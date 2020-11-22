/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg2;

/**
 *
 * @author JUNAID ALI KHAN
 */
public class Rectangle {
   public float length;
   public float width;
   public float area;
 
   public Rectangle()
   {
       
   }
   public Rectangle(float l, float w, float a)
   {
       this.length=l;
       this.width=w;
       this.area=a;
   }
   public Rectangle (Rectangle x)
   {
       this.length=x.length;
       this.width=x.width;
       this.area=x.area;
   }
    
}
