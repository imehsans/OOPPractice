/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marks;
import java.util.Scanner;
/**
 *
 * @author JUNAID ALI KHAN
 */
public class Marks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] marks=new int[10];
        double[] percentage=new double[10];
        char[] grade=new char[10];
        Scanner input= new Scanner(System.in);
        for(int i=0;i<10;i++)
        {   
            System.out.println(marks[i]+"\tEnter the value:\t\t");
            marks[i]=input.nextInt();    
        }
        for(int i=0;i<10;i++)
        {
            percentage[i]=calc_percentage(marks[i]);
            System.out.println("marks["+i+"]"+"\t"+marks[i]);
            System.out.println("percentage["+i+"\t"+percentage[i]);
            grade[i]=grade(percentage[i]);
            System.out.println("grade["+i+"\t"+grade[i]);
        }
        
    }
public static double calc_percentage(int x)
{
    double a;
    final int total=100;
    a= (x/total)*100; 
    return a;
}
public static char grade(double a)
    { 
        char grade;
       if(a>=90 && a<=100)
       {
           grade='A';
       }
       else if(a>=80 && a<90)
               {
                   grade='B';
               }
       else if(a>=70 && a<80)
       {
           grade='C';
       }
       else if(a>=60 && a<70)
       {
          grade='D';
       }
       else
       {
           grade='F';
       }
       return grade;
               
    }
}