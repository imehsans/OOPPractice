/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import static java.lang.System.in;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.Y;
/**
 *
 * @author JUNAID ALI KHAN
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner in=new Scanner(System.in);
        Account A1=new Account();
        Account A2=new Account();
        char ch;
        do
        {
        System.out.println("Enter 1 to open account:");
        System.out.println("Enter 2 for Deposit:");
        System.out.println("Enter 3 for withdraw:");
        System.out.println("Enter 4 for Transfer:");
        System.out.println("Enter 5 for Change pin:");
        System.out.println("Enter 6 for Balance inquiry:");
        System.out.println("Enter 7 for Close account:");
        int choice=in.nextInt();
        switch(choice){
            
            case 1:
            {
                
                System.out.println("Your account is opening: ");
                break;
                
            }
            case 2:
            {
                A1.deposit(786786785);
                A1.inquiry();
                System.out.println("Amount Deposit Completed.");
                break;
            }
            case 3:
            {
             A1.withdraw(2000);
             break;
            }
            case 4:
            {
               A1.inquiry();
                break;
            }
            case 5:
            {
                A1.changepin();
                break;
            }
            case 6:
            {
                A1.inquiry();
                break;
            }
            default:
            {
                System.out.println("Wrong Entry.");
            }
            
        }
        
        System.out.println("Do you want to continue? Enter y for continue.");
        
       
            ch = in.next().charAt(0);
        }
   
        while(ch=='Y' || ch=='y');
        
    }
}

    
              
                
        
    
      
      
      
    


    

