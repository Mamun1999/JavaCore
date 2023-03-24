package Interface;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println(" Audio started");
    }

    @Override
    public void stop() {
        System.out.println("Audio stopped");
    }
}
