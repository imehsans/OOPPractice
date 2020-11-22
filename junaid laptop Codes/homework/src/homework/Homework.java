/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;
import java.util.Scanner;

public class Homework {

    private static String area;
    private static String perimeter;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
    
        rectangle R1=new rectangle();
        rectangle R2;
        R2 = new rectangle(6,6);
        R2.area();
        R2.perimeter();
        
        System.out.println("Area = "+R2.area());
        System.out.println("Perimeter = "+R2.perimeter());
        
    }

    
}
