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
    ArrayList<RegularEmployees> regular=new ArrayList();
    ArrayList<ContractEmployees> contract=new ArrayList();
    ArrayList<Projectclass> P=new ArrayList();
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    EmployeesDemo obj1 = new EmployeesDemo();
    Employee e = new Employee();
    int user_option;
    do{
        System.out.println("Salect your Choice:"); 
        System.out.println("Enter [1] Register Regular Employee\n[2] Register Contarct Employee\n[3] Add Reguler Employee in Project");
        System.out.println("[4] Add Contract Employeein Project\n[5] Show List Employees\n[6] Show List of projects");
        System.out.println("\n[7] Exit:");
        user_option =input.nextInt();
        switch(user_option){
            case 1:
                obj1.setReg();
                break;
            case 2:
                obj1.setCont();
                break;
            case 3:
                System.out.println("Project Number:");
                int p_num=input.nextInt();
                System.out.println("Employee Number");
                int e_num=input.nextInt();
                obj1.addRegEmpProj(p_num, e_num);
                break;
            case 4:
                System.out.println("Project Number:");
                int proj_num=input.nextInt();
                System.out.println("Employee Number");
                int emp_num=input.nextInt();
                obj1.addContEmpProj(proj_num, emp_num);
                break;
            case 5:
                obj1.ShowAllEmp();
                break;
            case 6:
                obj1.showlEmpProj();
                break;
            case 7:
                break;
            default:
                System.out.println("Invalid input");
        }
    }while(user_option==7);
}
    void setReg(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Name of Employee: ");
        String name=scan.next();
        System.out.println("Employee id: ");
        String emp_id=scan.next();
        System.out.println("Designation of Employee: ");
        String designation=scan.next();
        System.out.println("Salary of Employee: ");
        int salaray=scan.nextInt();
        System.out.println("Join date of Employee: ");
        String start_Date=scan.next();
        System.out.println("||||||||||Address Details:||||||||||||");
        System.out.println("\n");
        System.out.println("House_number: ");
        String house=scan.next();
        System.out.println("Street: ");
        String street=scan.next();
        System.out.println("City: ");
        String city=scan.next();
        System.out.println("Province: ");
        String provence=scan.next();
        RegularEmployees emp= new RegularEmployees(name, salaray, start_Date, designation);
        emp.addAddress(house, street, city, provence);
        int c_o;
        System.out.println("Enter the Number Previce Jobs which you Done");
        c_o=scan.nextInt();
        for(int i=1;i<=c_o;i++){
            System.out.println("Enter the job "+i+" details");
            System.out.println("Enter Oranization name");
            String o_s=scan.next();
            System.out.println("Enter Joining date");
            String j_d=scan.next();
            System.out.println("Enter the Retiremente Date");
            String r_e=scan.next();
            System.out.println("Your designation");
            String desig=scan.next();
            emp.addExperince(o_s, desig, j_d, r_e);
        }
        regular.add(emp);}
        void setCont(){
            Scanner scanerr=new Scanner(System.in);
            System.out.println("Enter name of Employee: ");
            String name1=scanerr.next();
            System.out.println("Enter Employee id of Employee: ");
            String email_id=scanerr.next();
            System.out.println("Enter designation of Employee: ");
            String des1=scanerr.next();
            System.out.println("Enter salary of Employee: ");
            int salaray1=scanerr.nextInt();
            System.out.println("Enter Join date of Employee: ");
            String sd1=scanerr.next();
            System.out.println("Enter Address Details: ");
            System.out.println("");
            System.out.println("Enter housenumber: ");
            String h1=scanerr.next();
            System.out.println("Enter Street: ");
            String s1=scanerr.next();
            System.out.println("Enter City: ");
            String c1=scanerr.next();
            System.out.println("Enter Province: ");
            String st1=scanerr.next();
            RegularEmployees e2= new RegularEmployees(name1, salaray1, sd1, des1);
            e2.addAddress(h1, s1, c1, st1);
            int co1;
            System.out.println("Enter number of jobs u did");
            co1=scanerr.nextInt();
            for(int i=1;i<=co1;i++){
                System.out.println("Enter the job:::"+i+":::details");
                System.out.println("enter the oranization name");
                String os=scanerr.next();
                System.out.println("enter the joining date");
                String jd=scanerr.next();
                System.out.println("enter the resgindate");
                String re=scanerr.next();
                System.out.println("what was your designation");
                String dess=scanerr.next();
                e2.addExperince(os, dess, jd, re);  
            }
            regular.add(e2);
        }
        void ShowAllEmp(){
            System.out.println("||||||||||||Contrat Employee|||||||||||||");
            for(int i=0;i<contract.size();i++){
                System.out.println(contract.get(i));
                contract.get(i).toString();
            }
            System.out.println("||||||||||||Regular Employees||||||||||");
            for(int i=0;i<regular.size();i++){
                System.out.println(regular.get(i));
                regular.get(i).toString();
            }
        }
        void addRegEmpProj(int proj_num,int e_num){
            P.get(proj_num).addRegEmp(regular.get(e_num));
        }
        void addContEmpProj(int proj_num,int emp_num){
            P.get(proj_num).addCntEmp(contract.get(emp_num));
        }
        void showlEmpProj(){
            Projectclass p1 = null;
            p1.toString();  
        }
}