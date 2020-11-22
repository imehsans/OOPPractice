/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;
import java.util.Scanner;
/**
 *
 * @author JUNAID ALI KHAN
 */
public class Mainclass {

    
    public static void main(String[] args) {
        //double x,y,z;
        
        Scanner reader=new Scanner(System.in);
        /*System.out.println("Enter first number:");
        x=reader.nextDouble();
        System.out.println("Enter secound number:");
        y=reader.nextDouble();
        
        
        z=x+y;
        System.out.println("Sum = "+z);*/
        //primitive function already defined in the library
        //we create objects for that function which is not defined in the library and defined by the programmer.
        /*int[] A=new int[5];
        int x=0;
        while(x<A.length)
        {
            System.out.println("Enter the value of A["+x+"}:");
            A[x]=reader.nextInt();
            x++;
        }
        int sum=0;
        int product=1;
        for (int i=0;i<A.length;i++)
        {
            sum=sum + A[i];
            product=product*A[i];
        }
        System.out.println("Sum of Arrauy : "+sum);
        System.out.println("Product of Array : "+product);*/
        
    
  
        /*print_star();
        System.out.println("\nEnter the character : ");
        char a=reader.next().charAt(0);
        print_star(a);
        System.out.println("\nEnter how many times it will resume : ");
        int b=reader.nextInt();
        print_star(a,b);*/
        //print_star('z',50);
        print_star('*',20);
    }
    //static variables has no need of objects
    
    public static void print_star()
        {
            for (int j=0;j<=20;j++)
            {
                System.out.print("*");
            }
        }   
    //function/method overloading
    public static void print_star(char a)
    {
        for (int k=0;k<20;k++)
        {
            System.out.print("\t"+a);
        }
            
    }
    //again overload function
    public static void print_star(char a,int b)
    {
        for(int j=0;j<b;j++)
        {
            System.out.print(a);
            //System.out.print();
        }
     
    }
}
