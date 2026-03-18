import java.util.*;

class HillCipher {
    static int[][] key = {
        {6, 24, 1},
        {13, 16, 10},
        {20, 17, 15}
    };

    static int[] multiply(int[][] key, int[] pt) {
        int[] result = new int[3];

        for (int i = 0; i < 3; i++) {
            result[i] = 0;
            for (int j = 0; j < 3; j++) {
                result[i] += key[i][j] * pt[j];
            }
            result[i] %= 26;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3-letter plaintext: ");
        String text = sc.next().toUpperCase();

        int[] pt = new int[3];
        for (int i = 0; i < 3; i++) {
            pt[i] = text.charAt(i) - 'A';
        }

        int[] ct = multiply(key, pt);

        System.out.print("Ciphertext: ");
        for (int i = 0; i < 3; i++) {
            System.out.print((char)(ct[i] + 'A'));
        }
    }
              }
