// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.security.MessageDigest;
import java.util.Scanner;

public class Main {
    
    public static void main(String args[])throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to hashed");
        String s=sc.nextLine();
        MessageDigest ms = MessageDigest.getInstance("SHA-1");
        ms.update(s.getBytes());
        byte[] digest=ms.digest();
        StringBuilder hex= new StringBuilder();
        for(byte b: digest)
        {
            hex.append(String.format("%02x",b));
        }
        System.out.println(hex.toString());
    }
}