
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashfaq
 */
public class EmployeesDemo {

    /**
     * @param args the command line arguments
     */
    static Scanner scan=new Scanner(System.in);
    static ArrayList<RegularEmployees> rEmp=new ArrayList<>();
    
    public static void main(String[] args) {

        do{
    System.out.println("Enter 1 to register new employee: ");
    System.out.println("Enter 2 for list all employees: " );
    System.out.println("Enter 3 for Exit: ");
    int input=scan.nextInt();
    switch(input){
        case 1:
          getEmployeeDetails();
            break;
        case 2:
            showEmployees();
            break;
        case 3:
            System.exit(0);
            break;
        default:
            System.out.println("Invalid input");
    }
}while(true);


//      RegularEmployees e1= new RegularEmployees(10000, "10March 2000", "09 march 2060");
//      e1.addAddress("20", "30","ATD", "KPK");
//        System.out.println(e1.getAddress());
//        //e1=null;
//        //System.out.println(e1.getAddress());
//        e1.addExperince("Abc", "Manager", "00", "10");
//        System.out.println(e1.showAllExperince());
//        //e1.showAllExperince();
    }
   static void getEmployeeDetails(){

       System.out.println("Enter name of Employee: ");
       String name=scan.next();
       System.out.println("Enter Employee id of Employee: ");
       String eid=scan.next();
       System.out.println("Enter designation of Employee: ");
       String des=scan.next();
       System.out.println("Enter salary of Employee: ");
       int salaray=scan.nextInt();
       System.out.println("Enter Join date of Employee: ");
       String sd=scan.next();
       System.out.println("Enter Address Details: ");
       System.out.println("");
       System.out.println("Enter housenumber: ");
       String h=scan.next();
       System.out.println("Enter Street: ");
       String s=scan.next();
       System.out.println("Enter City: ");
       String c=scan.next();
       System.out.println("Enter Province: ");
       String st=scan.next();
       RegularEmployees e1= new RegularEmployees(name, salaray, sd, des);
       
       e1.addAddress(h, s, c, st);
       rEmp.add(e1);
    }
   static void showEmployees(){
   for(RegularEmployees r: rEmp){
       System.out.println(r);
   }
   
   }
}
