
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

public class Experience {
    private String organizationName,designation,startDate, endDate;    
    public Experience(String organizationName, String designation, String startDate, String endDate) {
        this.organizationName = organizationName;
        this.designation = designation;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public String getOrganizationName() {
        return organizationName;
    }
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    @Override
    public String toString(){
    return ("Organization: "+ this.organizationName+ " Designation: "+this.designation+ " Start Date: "+ this.startDate+" End Date: "+this.endDate);
    }
}
