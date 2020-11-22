
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashfaq
 */
public class Projectclass {
    private String proj_name,start_d,end_d,emp_pid;
    ArrayList<RegularEmployees> reg=new ArrayList();
    ArrayList<ContractEmployees> cont=new ArrayList();
    public Projectclass(String projecttitle, String startdate, String enddate, String epid) {
        this.proj_name= projecttitle;
        this.start_d = startdate;
        this.end_d = enddate;
        this.emp_pid = epid;
    }
    public String getProj_title() {
        return proj_name;
    }
    public void setProj_title(String projecttitle) {
        this.proj_name = projecttitle;
    }
    public String getStart_d() {
        return start_d;
    }
    public void setStart_d(String startdate) {
        this.start_d = startdate;
    }
    public String getEnd_d() {
        return end_d;
    }
    public void setEnd_d(String enddate) {
        this.end_d = enddate;
    }
    public String getEmp_pid() {
        return emp_pid;
    }
    public void setEmp_pid(String emp_pid) {
        this.emp_pid = emp_pid;
    }
    void addCntEmp(ContractEmployees c_e){
        cont.add(c_e);
    }
    void addRegEmp(RegularEmployees r_e){
        reg.add(r_e);
    } 
    @Override
    public String toString(){
        return "Employ id: "+emp_pid+"/n project title: "+proj_name+"startfrom: "+start_d+"to "+end_d;
    }
}