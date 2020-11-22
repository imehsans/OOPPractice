/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec.pkg10;

/**
 *
 * @author JUNAID ALI KHAN
 */
public class student {
    String name;
    double marks;
    int id;
    static int counter;
    
    public student ()
    {
        
        counter++;
    }
    public student(String n,double m, int i)
    {
        this.name=n;
        this.marks=m;
        this.id=counter;
        counter++;
       
    }

    

   
    
}
