/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fa17-bse-024
 */
public class R_number {
    public int v1,v2;
    

    R_number(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public R_number(int v1,int v2){
        this.v1=v1;
        this.v2=v2;
    }
    int getN(){
        return this.v1;
    }
    int getD(){
        return this.v2;
    }
   
public R_number add(R_number r){
    int tempv1,tempv2,tempD, tempN;
    tempv1=r.v1;
    tempv2=r.v2;
    tempN=(this.v1*tempv2)+(this.v2*tempv2);
    tempD=tempv2*this.v2;
    System.out.println("Answer is :"+tempN+"/"+tempD);
    R_number temp=new R_number(tempN,tempD);
    return temp;
 }
public String toString{
    return this.v1+"/"+this.v2;
}
public void finalize(){
    super.finalize();
    System.out.println("GC is Calles");
}
                        
        }
