import java.util.*;

class Main {
    public static void main(String[] args) {

        // 3x3 key matrix
        int[][] key = {
            {6, 24, 1},
            {13, 16, 10},
            {20, 17, 15}
        };

        String msg = "HIIAMAFRID";

        // Make length multiple of 3 (padding with X if needed)
        while (msg.length() % 3 != 0) {
            msg += "X";
        }

        for (int i = 0; i < msg.length(); i += 3) {

            int a = msg.charAt(i) - 'A';
            int b = msg.charAt(i + 1) - 'A';
            int c = msg.charAt(i + 2) - 'A';

            int c1 = (key[0][0]*a + key[0][1]*b + key[0][2]*c) % 26;
            int c2 = (key[1][0]*a + key[1][1]*b + key[1][2]*c) % 26;
            int c3 = (key[2][0]*a + key[2][1]*b + key[2][2]*c) % 26;

            System.out.print((char)(c1 + 'A'));
            System.out.print((char)(c2 + 'A'));
            System.out.print((char)(c3 + 'A'));
        }
    }
}
