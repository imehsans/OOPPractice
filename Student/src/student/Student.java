/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.util.Scanner;
/**
 *
 * @author fa17-bse-024
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentResult s1=new StudentResult();
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the Number of Student=");
    int NoStudent=scan.nextInt();
    int[] arr=new int[NoStudent-1];
    for (int i=0;i<NoStudent;){
        System.out.print("Enter the Name of "+i+1+" Student");
        String Nam=s1.getName();
        System.out.println();
        System.out.print("Enter the Marks of "+i+1+" Student");
        arr[i]= s1.getMarks();
        System.out.println();
        i=i++;
    }
    int count=0;
    for(int i=0;i<NoStudent-2;i++){
        if(arr[i]<arr[i+1]){
            int a=arr[i];
            arr[i]=arr[i+1];
            
        }
        
    }
    
    }
    
}
