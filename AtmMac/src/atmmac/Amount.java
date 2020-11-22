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
public class Amount {
    String name="khan";
    int pin=12345;
    float balance=(float) 4000.0;
//    public int getP(int a){
//        if(a==this.pin){
//            return pin;
//        }
//    }
//    
//    public String getN(String name){
//        if(name==this.name){
//            return name;
//        }
//    }
    public void ShowName(String name,int pin){
        String nam = this.name;
        if((nam.equals(name))&&(this.pin==pin)){
            System.out.println("The Name is ="+name);
            System.out.println("Pasword is :"+pin);
            System.out.println("Account balance is:"+balance);
        }
        else{
            System.out.println("You are inter incorret Information");
        }
    }
}


