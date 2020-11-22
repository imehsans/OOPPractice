/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fa17-bse-024
 */
public class Student {
   private String program,name ,regNo;
   private double CGPA;
   private int semister;
    public Student(){
        program="BCS";
        name="Khan";
        
    }
    public Student(String p){
      program=p ;
      System.out.println("I m being called");
    }
    public Student(String program,String regNo,String name,double CGPA){
        this.program =program;
        this.name=name;
        this.regNo=regNo;
        this.CGPA=CGPA;
    }
    public Student(String p,String n){
        program=p;
        name=n;
        semister=2;
    }
    public Student(String p,String n,String r){
        program =p;
        name=n;
        regNo=r;
    }
    
    void takeclas(String program){
        System.out.println("Student can take clasess of"+program);
        
    }
    void takeExam(){
        System.out.println("Student can take Exam");
    }
    void sports(){
        System.out.println("Student can play in Ground");
    }
    void SetName(String Name){
        this.name=name;
    }
    String getName;
    
    
}
