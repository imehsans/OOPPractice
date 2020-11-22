/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;



import java.util.Scanner;


/**
 *
 * @author JUNAID ALI KHAN
 */
public class Account {
    
    
    public String name;
    private double account_no;
    private double balance;
    public int branch_code;
    private int pin_code;
    public String account_type;
    static int counter;
    
    
    public Account()
    {
        
        
    }
    
    public Account(String n, double a, double b, int br, int p, String t)
    {
        this.name=n;
        this.account_no=a;
        this.balance=b;
        this.branch_code=br;
        this.pin_code=p;
        this.account_type=t;
        counter++;
    }
    public Account(Account x)
    {
        this.name=x.name;
        this.account_no=x.account_no;
        this.balance=x.balance;
        this.branch_code=x.branch_code;
        this.pin_code=x.pin_code;
        this.account_type=x.account_type;
        counter++;
    }
    
    public void enter_data()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER ACCOUNT HOLDER INFORMATIONS:");
        System.out.println("Name:");
        this.name= in.nextLine();
        System.out.println("Account No:");
        this.account_no= in.nextInt();
        System.out.println("Balance:");
        this.balance= in.nextDouble();
        System.out.println("Branch Code:");
        this.branch_code= in.nextInt();
        System.out.println("Pin Code:");
        this.pin_code= in.nextInt();
        System.out.println("Account type:");
        this.account_type=in.next();
    }           
        
    public double deposit(double b)
    {
        Scanner in=new Scanner(System.in);
        
        balance = balance+b;
        return balance; 
        
    }
    
    public double withdraw(double a)
    {
        if(balance<a)
        {
            System.out.println("Your balance is less than the amount you entered.");
        }
    
        balance = balance-a;
        System.out.println("you withdraw "+a+"from your account");
        return balance;    
    }
    
     public double inquiry()
     {
        
        System.out.println("your account balance is "+balance);
        return balance;
    }
     
     public void changepin()
     {
         Scanner in=new Scanner(System.in);
         System.out.println("Enter old pin:");
         int p= in.nextInt();
         if(this.pin_code==p)
         {
             System.out.println("ENTER THE NEW PIN :");
             int a=in.nextInt();
             System.out.println("Your code is changed successfully.");
             System.out.println("Your new pin code is "+pin_code);
         }
         else
         {
             System.out.println("Incorrect pin");
         }
       
        
    }
     
     public void transfer()
     {
         Scanner in=new Scanner(System.in);
         System.out.println("Enter the account number: ");
         double no=in.nextDouble();
         System.out.println("Enter balance you want to transfer:");
         double b=in.nextDouble();
         this.balance=this.balance-b;
         this.account_no=this.balance+b;
         
         
     }

   static void counter()
           
   {
       counter++;
   }
}
