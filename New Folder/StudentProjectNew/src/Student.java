/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashfaq
 */
public class Student {
  private String pro,regNo,name;
  private static String Universty="CIIT"; 
  private double cgpa;
   private int semester;
    public Student(){
    pro="BCS";
    name="ABC";
    }
    public Student(String p){
    pro=p;
        System.out.println("I am being called");
    }
  public Student(String p,String n){
   pro=p;
   name=n;
   semester=2; 
      System.out.println("I am constructor with 2 paramaters");
   }
  public Student(String program, String name, String regNo){
  this.pro=program;
  this.name=name;
  this.regNo=regNo;
  
  }
  public Student(String p,String n, String r, double c){

  
  }
  void setName(String name){
  this.name=name;
  }
  String getName(){
  return this.name;
  }
    
    void takeClasses(String program){
       System.out.println("Student can take classes of: " + program);
   
   }
    void takeExam(){
    System.out.println("Student can take exam");
    }
    void sports(){
    System.out.println("Student can play in ground");
    }
}
