// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import javax.crypto.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception{
      int[][] key={{3,3},{2,5}};
      
    //  System.out.println("enter a message")
    
    String msg="HIIAMAFRID";
    
    for(int i=0;i<msg.length();i+=2)
    {
        int a=msg.charAt(i)-'A';
        int b=msg.charAt(i+1)-'A';
        
        int c1=(key[0][0]*a+key[0][1]*b)%26;
        int c2=(key[1][0]*a+key[1][1]*b)%26;
        
        System.out.print((char)(c1+'A'));
        System.out.print((char)(c2+'A'));
        
    }
    
      
    }
}