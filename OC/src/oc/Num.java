/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oc;
import java.util.Scanner;
/**
 *
 * @author Ehsan Jadoon
 */
public class Num {
    private Scanner cin;
    void vowel(){
        cin=new Scanner(System.in);
        System.out.println("Enter the Char:");
        char a=cin.next().charAt(0);
        if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
        {
            System.out.println("The Char "+a+" is Vowel");
        }
        else{
            System.out.println("The Char "+a+" is Not  Vowel");
        }
            }
    
}
