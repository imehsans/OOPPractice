
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashfaq
 */
public class RegularEmployees extends Employee {
 private int salary;
 private String joinDate,retirementDate;
// private Date join,ret;
 

    public RegularEmployees(String name,int salary, String joinDate,String designation) {
   //     this.join=new Date();
        super.name=name;
          this.salary = salary;
          this.joinDate = joinDate;
       super.designation = designation;
       super.experinces=new ArrayList<>();
    
    }
    
    void addAddress(String house,String street, String city, String state){
      super.address=new Address(house, street, city, state);  
    
    }
    void addExperince(String o,String d, String sd, String ed){
//    Experience exp1=new Experience(o, d, sd, ed);
//    super.experinces.add(exp1);
 super.experinces.add(new Experience(o, d, sd, ed));
    }

    public int getSalary() {
        return salary;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public String getRetirementDate() {
        return retirementDate;
    }
    public Address getAddress(){
    return super.address;
    }
    public Experience showAllExperince(){
//    for(Experience e:super.experinces){
//        System.out.println(e);
//    
getAddress();


    return null;
    
    }
    @Override
    public String toString(){
    return super.employee_id+" "+super.name;
    } 
 
}
