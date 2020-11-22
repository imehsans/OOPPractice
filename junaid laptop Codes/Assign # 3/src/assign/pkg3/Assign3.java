/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign.pkg3;

/**
 *
 * @author FA17-BEE-060
 */
import java.util.Scanner;
public class Assign3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Input = new Scanner(System.in);
        double S1,S2,S3;
        double sum;
        
        System.out.println("Enter Angel 1:");
        S1=Input.nextDouble();
        
        System.out.println("Enter Angel 2:");
        S2=Input.nextDouble();
        
        System.out.println("Enter Angel 3 :");
        S3=Input.nextDouble();
        sum=S1+S2+S3;
        if(sum==180)
        {
            System.out.printf("Triangle is valid");
        }
        else 
        {
            System.out.printf("Triangle is invalid");
        }
    }
    
}
