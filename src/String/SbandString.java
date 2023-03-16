package String;

public class SbandString {

    public static void main(String[] args) {

//        System.out.println('a'+'b');
//        System.out.println('a'+2);
//
//        String a="a"+1;
//        System.out.println(a);
//        String s="s"+"a";
//        System.out.println(s);

//        for (int i = 0; i < 26; i++) {
//       String series="";
//            char s=(char)('a'+i);
//
//            System.out.println(s);
//
//        }
//        String series="";
//        for (int i = 0; i < 26; i++) {
//
//            char s=(char)('a'+i); // a+0=a; a+1=b......
//
//            series=series+s;  // in this way every times its creating a new object and appending it. so this is time consum9ng
//                              // 1 + 2+3....n  // n(n-1)/2== n^2-n/2 // O(n^2)
//
//        }
//        System.out.println(series);

        // for not wasting the memory we are going to use Stringbuilder . it will allow us to not create an object every time we added a new string. it is just use same object and append it to that same object

        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char s=(char)('a'+i);
            sb.append(s);

        }
        System.out.println(sb);
    }
}
