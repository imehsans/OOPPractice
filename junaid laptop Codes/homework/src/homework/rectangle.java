/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author JUNAID ALI KHAN
 */
public class rectangle {
    
    private float length;
    private float width;

    
    public void set_length(float l)
    {
        this.length=l;
}
    public float get_length()
    {
        return this.length;
    }
    
    public void set_width(float w)
    {
        this.width=w;
}
    public float get_width()
    {
        return this.width;
    }
    
    public rectangle()
    {
        this.length=1;
        this.width=1;
    }
    
    public rectangle(float l, float w)
    {
        this.length=l;
        this.width=w;
    }
    
    public rectangle (rectangle x)
   {
       this.length=x.length;
       this.width=x.width;
   }
    
    
    public float area()
    
    {
        float area;
        area=this.length*this.width;
        return area;
    }
   
  
    public float perimeter()
    {

        float perimeter=2*(this.length+this.width);
        return perimeter;
    }

    
}
