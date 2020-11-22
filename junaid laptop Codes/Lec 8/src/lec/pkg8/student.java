/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec.pkg8;
import java.util.Scanner;
/**
 *
 * @author JUNAID ALI KHAN
 */
public class student {
    private String name;
    private String reg_no;
    private Double marks;
    private Double percentage;
    private char grade;
    
    
    public student ()
    {
        this.name="";
        this.reg_no="";
        this.marks=0.0;
        this.percentage=0.0;
        this.grade='N';
        
    }

    public student(String n, String r, double m, double p, char g)
    {
        this.name=n;
        this.reg_no=r;
        this.marks=m;
        this.percentage=p;
        this.grade=g;
    }
    
    public student(student s)
    {
        this.name=s.name;
        this.reg_no=s.reg_no;
        this.marks=s.marks;
        this.percentage=s.percentage;
        this.grade=s.grade;
    }
     
    public void set_data()
    {
        Scanner In=new Scanner(System.in);
        System.out.println("Enter Name:");
        this.name=In.nextLine();
        System.out.println("Enter Reg_no:");
        this.reg_no=In.nextLine();
        System.out.println("Enter Marks:");
        this.marks=In.nextDouble();
        System.out.println("Enter Percentage:");
        this.percentage=In.nextDouble();
        System.out.println("Enter Grade:");
        this.grade=In.next().charAt(0);        
        
        
    }
    public void display_data()
    {
        System.out.println("Name = "+this.name);
        System.out.println("Reg_no = "+this.reg_no);
        System.out.println("Marks = "+this.marks);
        System.out.println("Percentage = "+this.percentage);
        System.out.println("Grade = "+this.grade);
    }
    
    public double calc_percentage()
    {
    double a;
    final int total=550;
    a= (this.marks/total)*100; 
    return a;
    }
}
