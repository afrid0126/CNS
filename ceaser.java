// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static String encryption(String s,int key)
    {
        StringBuilder sb = new StringBuilder();
      for(int i=0;i<s.length();i++)
        {
            char A=s.charAt(i);
            if(Character.isLetter(A))
            {
                char base= Character.isUpperCase(A)?'A':'a';
                char cea=(char)((A-base+key)%26+base);
                sb.append(cea);
               
                }
                else
                sb.append(A);
        }
        return sb.toString();
    }
    public static String decryption(String encrypt,int key)
    {
        return encryption(encrypt,26-key);
    }
    public static void main(String[] args) {
        String s="Afrid";
        int key=3;
        String cipher=encryption(s,key);
        String decrypt=decryption(cipher,key);
        System.out.println(cipher);
        System.out.println(decrypt);
        
    }
}