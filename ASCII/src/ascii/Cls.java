/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii;

/**
 *
 * @author Ehsan Jadoon
 */
public class Cls {
    void Assci(){
        System.out.println("The Ascii Codes Are The following");
        for(int i=1;i<132;i=i+4){
            System.out.print("||"+i+"="+(char)i+"||"+(i+1)+"="+(char)(i+1)+"||"+(i+2)+"="+(char)(i+2)+"||"+(i+3)+"="+(char)(i+3)+"||\n");
        }
        
    }
    
}
