package assign.pkg1;

/**
 *
 * @author FA17-BEE-060
 */
import java.util.Scanner;
public class Assign2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int i=0;
        int sum=0;
        
        while(i<=10)
        {
            sum=sum+i;
            i++;
            
        }
        
        System.out.printf("Sum = %d",sum);
    }
    
}


