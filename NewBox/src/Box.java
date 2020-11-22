/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fa17-bse-024
 */
public class Box {
    private int hieght,depth,weidth;
    private String colour;
    void side(){
        System.out.println("The Box Have Six Side");
    }
    int volume(int a,int b,int c){
        return hieght*depth*weidth;
    }
    
    
}
