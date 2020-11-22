/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @author ashfaq
 * 
 */
public class ContractEmployees extends Employee {
private int hourlyRate,hoursWorked;
private String contractStartDate,contractEndDate;

    public ContractEmployees(String name,int hourlyRate, String contractStartDate, String contractEndDate, String designation) {
       super.name=name;
        this.hourlyRate = hourlyRate;
      //  this.hoursWorked = hoursWorked;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        super.designation=designation;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

   
   public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }


    public String getContractEndDate() {
        return contractEndDate;
    }

    @Override
    public String toString(){
    return super.employee_id+" "+super.name;
    } 
  

}
