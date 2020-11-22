/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooppaperq;
import java.util.Scanner;
/**
 *
 * @author Ehsan Jadoon
 */
public class Function {
    Scanner scan=new Scanner(System.in);
    int a,b;
    public void Fun(){
        System.out.println("Enter your Num:");
        this.a=scan.nextInt();
        System.out.println("Enter the Second Num");
        this.b=scan.nextInt();
        for(int i=0;i<1;i++){
            Fun();
        }
        
    }
    
    
}
