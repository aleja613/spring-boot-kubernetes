import javax.crypto.Cipher;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;


public class test_aleja613 {

    public static void main(String[] args) {
      try
      {        
        Cipher c19 = Cipher.getInstance("RC4"); // Noncompliant: vulnerable to several attacks (see https://en.wikipedia.org/wiki/RC4#Security)          
      }
      catch(NoSuchAlgorithmException|NoSuchPaddingException e)
      {
      }
    }
