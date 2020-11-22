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
public class StudentResult {
    Scanner scan=new Scanner(System.in);
    String name;
    int Marks;
    public student(String m,int n){
    public String getName(){
        this.name=scan.next();
    return name;
    }
    public int getMarks(){
        this.Marks=scan.nextInt();
        return Marks;
    }
}
