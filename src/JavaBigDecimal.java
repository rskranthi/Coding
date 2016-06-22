import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author owner
 */
public class JavaBigDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //Input
        
        BigDecimal bi2, bi3,bi4;
        int res;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        
        BigDecimal b[] = new BigDecimal[n];
        String []s=new String[n+2];
        
        for(int i=0;i<n;i++)
        {
            System.out.println("enter "+i+1+"number");
            s[i]=sc.next();
           b[i] = new BigDecimal(s[i]);
        }

        //Write your code here
      
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (b[i].compareTo(b[j]) == -1) {
                    BigDecimal temp = b[j];
                    b[j] = b[i];
                    b[i] = temp;
                }
            }
        }
             for(int i=0;i<n;i++)
        {
            
           System.out.println(b[i]);
        }

        
        
    }
    
}