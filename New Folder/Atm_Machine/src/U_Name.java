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
public class U_Name {
    String Name="Khan";
    int pasword=12345;
    float amount=(float) 400.50;
    Scanner Scan=new Scanner(System.in);
    private String name;
//    public float output(String n,int p,float a){
//        if(n==this.Name){
//            if(p==this.pasword){
//                System.out.println();
//            return amount;
//            }
//            else{
//                System.out.println("You entered Pin is Wrong\nTry Again ");
//            return 0;
//            }
//        }
//        else{
//            System.out.println("You entered User Name is Wrong\nTry Again ");
//        return 0;
//        }
//    }
    public String getN(){
        return this.Name;
    }
    
    public float getA(){
        return this.amount;
    }
}
