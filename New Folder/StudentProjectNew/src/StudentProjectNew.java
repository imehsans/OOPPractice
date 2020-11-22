/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashfaq
 */
public class StudentProjectNew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Student s1= new Student("BSE","X","FA18");
      //  System.out.println("value is: "+ s1.program);
        System.out.println("Your name is: "+ s1.getName());
        s1.setName("Ahmed");
        System.out.println("My new name is : "+ s1.getName());
     //   System.out.println("New value is : "+ s1.program);
        Integer i=new Integer(4); //int i=4
        
        System.out.println("Name is : "  + s1.getName());
        String s="BSE";
        s1.setName("Ahmad");
        s1.sports();
        s1.takeClasses("Program");
        s1.takeClasses("OOP");
        Student s2= new Student();
        System.out.println("Program of Second object is : ");
        
    }
    
}
