// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    static String a="abcdefghijklmnopqrstuvwxyz";
   static String b="zyxwvutsrqponmlkjihgfedcba";
    public static String encryption(String s)
    {
        StringBuilder sb = new StringBuilder();
       for(int i=0;i<s.length();i++)
       {
           char A=s.charAt(i);
           int index=a.indexOf(A);
           sb.append(b.charAt(index));
       }
       return sb.toString();
    }
    public static String decryption(String s)
    {
         StringBuilder sb = new StringBuilder();
       for(int i=0;i<s.length();i++)
       {
           char A=s.charAt(i);
           int index=b.indexOf(A);
           sb.append(a.charAt(index));
       }
       return sb.toString();
    }
    public static void main(String[] args) {
        String s="Afrid";
        s=s.toLowerCase();
        String cipher=encryption(s);
        String decrypt=decryption(cipher);
        System.out.println(cipher);
        System.out.println(decrypt);
        
    }
}