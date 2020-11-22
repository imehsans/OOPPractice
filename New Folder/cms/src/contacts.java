
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author khurram
 */
public class contacts {
     protected  ArrayList <newcontacts> newcontactss;
    public contacts() {
         newcontactss= new ArrayList<>();
         
    }
    Scanner s= new Scanner(System.in);

void setnameap(String n,String a ,int p){
   newcontactss.add(new newcontacts(n,a,p));
}

    void print(){
       
       for(newcontacts n: newcontactss){
           System.out.println(n);
       } 
    }
    void search(String n,String a,int d){ 
            int k=0;
    int i=0;
    for(  i=0;i>newcontactss.size();i++){
        if((newcontactss.get(i).getName().equals(n)|| newcontactss.get(i).equals(a))|| newcontactss.get(i).equals(d)){
            k=1;
            break;
        }
    }
        if(k==1){
          ;
        }
        else{
         System.out.println(newcontactss.get(i).getName());
            System.out.println(newcontactss.get(i).getAddress());
            System.out.println(newcontactss.get(i).getPhoneno());
        }
    }
    void delete(String n,String a,int d){
      int k=0;
    int i=0;
    for(  i=0;i>newcontactss.size();i++){
        if((newcontactss.get(i).getName().equals(n)|| newcontactss.get(i).equals(a))|| newcontactss.get(i).equals(d)){
            k=1;
            break;
        }
    }
        if(k==1){
           
       
        }
        else{
            newcontactss.remove(n);
          newcontactss.remove(a);
          newcontactss.remove(d);
        }
    }
     void replace(String n,String a,int d){
      int k=0;
    int i=0;
    for(  i=0;i>newcontactss.size();i++){
        if((newcontactss.get(i).getName().equals(n)|| newcontactss.get(i).equals(a))|| newcontactss.get(i).equals(d)){
            k=1;
            break;
        }
    }
        if(k==1){
           
       
        }
        else{
            System.out.println("enter replace name");
            String n1=s.nextLine();
             System.out.println("enter replace address");
            String a1=s.nextLine();
             System.out.println("enter replace name");
           int  p1=s.nextInt();
            newcontactss.get(i).setName(n1);
          newcontactss.get(i).setAddress(a1);
          newcontactss.get(i).setPhoneno(p1);
        }
    }
    
    }


