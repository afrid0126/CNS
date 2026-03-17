import java.math.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a prime number");
      BigInteger p = sc.nextBigInteger();
      System.out.println("enter another prime number");
      BigInteger q= sc.nextBigInteger();
      
      BigInteger n=p.multiply(q);
      
      BigInteger n2=p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
       BigInteger e = BigInteger.valueOf(3);
      BigInteger d= e.modInverse(n2);
      System.out.println("public keys are"+e+" "+n);
      System.out.println("private keys are"+d+" "+n);
      
    }
    public static BigInteger generateE(BigInteger fiofn) { 
        int y,GCD; 
        BigInteger e; 
        BigInteger gcd; 
        Random x = new Random(); 
        do 
        { 
            y = x.nextInt(fiofn.intValue()-1); 
            String z = Integer.toString(y); 
            e = new BigInteger(z); 
            gcd = fiofn.gcd(e); 
            GCD = gcd.intValue(); 
        }  while(y <= 2 || GCD != 1); 
        return e; 
} 
   
} 
