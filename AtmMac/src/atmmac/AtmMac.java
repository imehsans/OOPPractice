/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmmac;

import java.util.Scanner;

/**
 *
 * @author Ehsan Jadoon
 */
public class AtmMac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Amount obj=new Amount();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Name=");
        String name=scan.nextLine();
        System.out.println("Enter your pin Code");
        int pin=scan.nextInt();
//        obj.getN(name);
//        obj.getP(a);
        obj.ShowName(name,pin);
    }
    
}
