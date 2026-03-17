// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;
class Main {
    public static void main(String[] args) throws Exception {
      KeyGenerator keyGen=KeyGenerator.getInstance("AES");
      SecretKey secret = keyGen.generateKey();
      
      String original="Hello World";
      
      Cipher ecipher=Cipher.getInstance("AES");
      ecipher.init(Cipher.ENCRYPT_MODE,secret);
      
      byte[]encryption=ecipher.doFinal(original.getBytes());
      
      String encryptedText=Base64.getEncoder().encodeToString(encryption);
      
      Cipher dcipher=Cipher.getInstance("AES");
      dcipher.init(Cipher.DECRYPT_MODE,secret);
      byte []decrypt=dcipher.doFinal(Base64.getDecoder().decode(encryptedText));
      String decryptText=new String(decrypt);
      
      System.out.println(encryptedText);
      System.out.println(decryptText);
      
      
    }
}