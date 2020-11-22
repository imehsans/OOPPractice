/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fa17-bse-024
 */
public class rationalnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws InterruptedException{
        // TODO code application logic here
    R_number r1=new R_number(10,5);
    R_number r2=new R_number(12,6);
    R_number r4=new R_number(r1);
    System.out.println("value is:"+r1);
//    r1.add(r2);
    System.gc();
    R_number r3=r1.add(r2);
    System.out.println("Answer is: "+r3.getN()+"/"+r3.getD());
//    r1.add(r2);
//    System.out.println(r1.r2);
//    
//    
//    
    }
    
}
