/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nusteedloop;

/**
 *
 * @author Ehsan Jadoon
 */
public class NusteedLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j;
        for (i=0;i<5;i++){
            int x=1;
            for(j=i;j<5;j++){
                System.out.print(x++);
            }
            System.out.println("");
            
        }
    }
    
}
