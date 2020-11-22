/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookprograms;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Ehsan Jadoon
 */
public class GridLabApplet extends Applet {
    @Override
    public void init(){
        ButtonPanel buttonPanel=new ButtonPanel(this);
        Picker picker=new Picker(buttonPanel);
        setLayout(new Boardlayout());
        add(new Box(picker, "Grid layout Settings"), "North")
        add(buttonPanel, "Center");
    }
}
