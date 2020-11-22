/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author khurram
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
     contacts c = new contacts();
     Scanner s= new Scanner(System.in);
       String ch = null ;
       
     
    do
        {
         System.out.println("new contact press:0");
         System.out.println("show list press:1");
         System.out.println("delete contact press:2");
         System.out.println("replace contacts press:3");
         System.out.println("search contact press:4");
         System.out.print("Do You Want To Continue (Y/N)?: ");
         ch=s.next();
         int  choice = s.nextInt();
          
         switch(choice){
             case 0:
                 System.out.println("enter name");
                 String name=s.next();
                 System.out.println("enter address");
                 String address=s.next();
                 System.out.println("enter phoneno");
                 int ph=s.nextInt();
                FileWriter fw= new FileWriter("f.txt",true);
                 BufferedWriter fd = new BufferedWriter(fw);
                 fd.write(name);
                 fd.newLine();
                 fd.write(ph);
                 fd.newLine();
                 fd.write(address);
                 fd.newLine();
                 fd.close();
                 c.setnameap(name, address, ph);
                 break;
             case 1:
                 c.print();
                 break;
             case 2:
                  System.out.println("enter name");
                 String name1=s.next();
                 System.out.println("enter address");
                 String address1=s.next();
                 System.out.println("enter phoneno");
                 int ph1=s.nextInt();
                 c.delete(name1, address1, ph1);
                 break;
             case 3:
                  System.out.println("enter name");
                 String name2=s.next();
                 System.out.println("enter address");
                 String address2=s.next();
                 System.out.println("enter phoneno");
                 int ph2=s.nextInt();
                 c.replace(name2, address2, ph2);
                 break;
             case 4:
                 System.out.println("enter name");
                 String name3=s.next();
                 System.out.println("enter address");
                 String address3=s.next();
                 System.out.println("enter phoneno");
                 int ph3=s.nextInt();
                 c.search(name3, address3, ph3);
                 break;
                 
        
       
                 default :
                     System.out.println("invalid entery");
         
         

       
         
        
         
         }
         
       
    } while((ch!="n")&&(ch!="N"));
      
}}
