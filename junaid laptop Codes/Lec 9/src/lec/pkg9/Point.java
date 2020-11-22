/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec.pkg9;

import static java.lang.Math.sqrt;
import java.lang.*;
/**
 *
 * @author JUNAID ALI KHAN
 */
public class Point {
    private float x_coordinate;
    private float y_coordinate;
    
    
    public Point()
    {
        
    }
    public Point (float x, float y)
    {
        this.x_coordinate=x;
        this.y_coordinate=y;
    }
    public Point (Point s)
    {
        this.x_coordinate=s.x_coordinate;
        this.y_coordinate=s.y_coordinate;
    }
    
    public void set_x_axis ()
    {
        this.x_coordinate=this.x_coordinate;
    }
    public void set_y_axis()
    {
        this.y_coordinate=this.y_coordinate;
    }
    
    public float get_x_axis()
    {
        return x_coordinate;
    }
    public float get_y_axis()
    {
        return y_coordinate;
    }
    
    public double get_distance(Point q)
    {
        double a,b,d;
        a=q.x_coordinate-this.x_coordinate;
        b=q.y_coordinate-this.y_coordinate;
        d=Math.sqrt(a*a+b*b);
        return d;
        
}
    
}