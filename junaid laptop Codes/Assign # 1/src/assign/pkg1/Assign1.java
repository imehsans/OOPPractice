/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign.pkg1;

/**
 *
 * @author FA17-BEE-060
 */
import java.util.Scanner;
public class Assign1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner In = new Scanner(System.in);
        int[] x = new int[5];
        int sum=0;
        for (int i=0;i<5;i++)
        {
            do
            {
                System.out.println("Enter Number;");
                x[i]=In.nextInt();
            }
            while(x[i]<=0 && x[i]>=9);
            sum=sum+x[i];
        }
        
        System.out.printf("Sum = %d",sum);
        
    }
}

4