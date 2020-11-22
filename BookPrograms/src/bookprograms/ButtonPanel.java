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
class ButtonPanel extends Panel {

    private Button one,two,three,four,five,six,seven,eight,nine,ten;
    private Panel panel=new Panel();
    private TenPixelBoard boarder=new TenPixelBoard(panel);
    private GridLayout gridLayout;
    public ButtonPanel(Applet applet){
        one =new Button(" 1 ");
        two=new Button(" 2 ");
        three=new Button(" 3 ");
        four=new Button(" 4 ");
        five=new Button(" 5 ");
        six=new Button(" 6 ");
        seven=new Button(" 7 ");
        eight=new Button(" 8 ");
        nine=new Button(" 9 ");
        ten=new Button(" 10 ");
        panel.setLayout(gridLayout=new GridLayout(3,2));
        panel.add(one);
        panel.add(two);
        panel.add(three);
        panel.add(four);
        panel.add(five);
        panel.add(six);
        panel.add(seven);
        panel.add(eight);
        panel.add(nine);
        panel.add(ten);
        setLayout(new BorderLayout());
        add     ("Center", border);
    }
    public void updateLayout(int rows,int cols,int hgap,int vgap){
        try{
            gridLayout.setRows(rows);
            gridLayout.setColumns(cols);
            gridLayout.setHgap(hgap);
            gridLayout.setVgap(vgap);
            panel.invalidate();
            border.validate();
        }
        catch(IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}
    

