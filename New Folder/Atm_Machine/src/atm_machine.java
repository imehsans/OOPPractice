/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author fa17-bse-024
 */
public class atm_machine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    U_Name Customer=new U_Name();
    Scanner Scan=new Scanner(System.in);
    System.out.print("Enter the Name:");
    String a=Scan.next();
    
    if(a==Customer.Name){
        System.out.print("Enter the '5' Diget pin");
        int b=Scan.nextInt();
        if(b==Customer.pasword){
            System.out.println("Your Currnt Balance is :"+Customer.getA());
        }
    }
}
}
