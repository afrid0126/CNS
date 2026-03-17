import java.util.*;

public class Main {

    static int[][] key = {{3, 3}, {2, 5}};

    static int[] multiply(int[][] key, int[] text) {
        int[] result = new int[2];

        result[0] = (key[0][0]*text[0] + key[0][1]*text[1]) % 26;
        result[1] = (key[1][0]*text[0] + key[1][1]*text[1]) % 26;

        return result;
    }

    public static void main(String[] args) {

        String msg = "HI";
        msg = msg.toUpperCase();

        int[] text = new int[2];

        for (int i = 0; i < 2; i++) {
            text[i] = msg.charAt(i) - 'A';
        }

        int[] cipher = multiply(key, text);

        System.out.print("Encrypted: ");
        for (int i : cipher) {
            System.out.print((char)(i + 'A'));
        }
    }
}