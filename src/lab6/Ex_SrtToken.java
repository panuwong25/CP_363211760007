package lab6;

import java.util.StringTokenizer;

public class Ex_SrtToken {

    public static void main (String[] aegs) {


        String msg = "My name is Tyler Martin. My nickname is Tyler. I am nineteen years old.\n" +
                "I was born on the twenty sixth of December, 1997";

        System.out.println(msg.length());
        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens()); // return word count as integer


        while (myToken.hasMoreElements()) {
            System.out.println(myToken.nextToken());
        }

    }
}
