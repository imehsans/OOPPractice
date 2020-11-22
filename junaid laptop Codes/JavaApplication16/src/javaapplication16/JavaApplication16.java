package JavaApplication16;
import java.util.Scanner;
class Accounts{
    
    Scanner in = new Scanner(System.in);
    String title = in.nextLine();
    int accountno = in.nextInt();
    int balance = in.nextInt();
    int branchcode = in.nextInt();
    int code = in.nextInt();
    
    
    
    int deposit(){
        
        int add = in.nextInt();
        balance = balance+add;
        return balance;    
    }
    int withdraw(){
        int sub = in.nextInt();
        balance = balance-sub;
        System.out.println("you withdraw "+sub+"from account");
        return balance;    
    }
    void inquiry(){
        
        System.out.println("your balance is "+balance);
        System.out.println("your account no is "+accountno);
        System.out.println("your branchcode is "+branchcode);
        System.out.println("your pincode is "+code);
   
    }
    void changepin(){
        System.out.println("enter the new pin ");
        code = in.nextInt();
        this.code = code;
        System.out.println("your code successfully change ");
        System.out.println("your code is "+code);
    }       // changepin
}       // class end
public class JavaApplication16{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Accounts ob = new Accounts();
        System.out.println("enter  1 for deposit balance");
        System.out.println("enter 2 for withdraw balance ");
        System.out.println("enter 3 for inquiry ");
        System.out.println("enter 4 for change pin ");
        int cheack = in.nextInt();
        if(cheack == 1){
            ob.deposit();
        }
        if(cheack == 2){
            ob.withdraw();
        }
        if(cheack == 3){
            ob.inquiry();
        }
        if(cheack == 4){
            ob.changepin();
            
        }
    }

}