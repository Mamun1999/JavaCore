package Q2;


import java.io.*;
import java.net.*;
import java.util.*;


public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started.");

        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

            Thread t = new Thread(new ClientHandler(clientSocket));
            t.start();
        }
    }

    static class ClientHandler implements Runnable {
        private final Socket clientSocket;

        ClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                String inputLine;
                StringBuilder sb = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    sb.append(inputLine);
                }
                String text = sb.toString();

                // Call mapper function
                List<Map.Entry<String, Integer>> result = mapper(text);

                // Call reducer function
                Map<String, Integer> finalResult = reducer(result);

                // Send result to client
                out.println(finalResult.toString());

                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static List<Map.Entry<String, Integer>> mapper(String text) {
        String[] words = text.split("\\s+");
        List<Map.Entry<String, Integer>> result = new ArrayList<>();

        for (String word : words) {
            if (word.length() > 0) {
                char firstChar = word.charAt(0);
                if ("AEIOUaeiou".indexOf(firstChar) >= 0) {
                    result.add(new AbstractMap.SimpleEntry<>("vowel", 1));
                } else if ("AaAnThe".indexOf(word.charAt(0)) >= 0) {
                    result.add(new AbstractMap.SimpleEntry<>(word.toLowerCase(), 1));
                }
            }
        }

        return result;
    }

    static Map<String, Integer> reducer(List<Map.Entry<String, Integer>> input) {
        Map<String, Integer> result = new HashMap<>();

        for (Map.Entry<String, Integer> entry : input) {
            String key = entry.getKey();
            int value = entry.getValue();
            result.merge(key, value, Integer::sum);
        }

        return result;
    }
}
