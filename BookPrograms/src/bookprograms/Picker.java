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
public class Picker extends Panel implements ItemListener  {
    private Label hgapLabel =new Label("Horizontal:");
    private Label vgapLabel=new Label("Vertical:");
    private Label rowLabel=new Label("rows:");
    private Label colLabel=new Label("cols:");
    
    private Choice hchoice=new Choice();
    private Choice vchoice=new Choice();
    private Choice rowchoice=new Choice();
    private Choice colchoice=new Choice();
    
    private ButtonPanel buttonPanel;
private Picker(ButtonPanel buttonPanel ){
    Panel rowCols =new Panel();
    Panel gaps =new Panel();
    this.buttonPanel=buttonPanel;
    hchoice.addItem("0");
    hchoice.addItem("5");
    hchoice.addItem("10");
    hchoice.addItem("15");
    hchoice.addItem("20");
    
    vchoice.addItem("0");
    vchoice.addItem("5");
    vchoice.addItem("10");
    vchoice.addItem("15");
    vchoice.addItem("20");
    
    rowchoice.addItem("0");
    rowchoice.addItem("1");
    rowchoice.addItem("2");
    rowchoice.addItem("3");
    rowchoice.addItem("4");
    rowchoice.addItem("5");
    rowchoice.select(3);
    
    colchoice.addItem("0");
    colchoice.addItem("1");
    colchoice.addItem("2");
    colchoice.addItem("3");
    colchoice.addItem("4");
    colchoice.addItem("5");
    colchoice.select(2);
    
    rowCols.add(rowLabel);
    rowCols.add(rowChoice);
    rowCols.add(colLabel);
    rowCols.add(colChoice);
    
    gaps.add(hgapLabel);
    gaps.add(hchoice);
    gaps.add(vgapLabel);
    gaps.add(vchoice);
    
    hchoice.addItemListener(this);
    vchoice.addItemListener(this);
    rowchoice.addItemListener(this);
    colchoice.addItemListener(this);
    add(new Box(rowCols, "Rows And Columns"));
    add(new Box(gaps, "Horizental and Verticals Gaps"));    
}
    @Override
    public void itemStateChanged(ItemEvent event){
        int rows ,cols,hgap,vgap;
        rows=Integer.parseInt(rowChoice.getSelectedItem());
        cols=Integer.parseInt(colChoice.getSelectedItem());
        hgap=Integer.parseInt(hchoice.getSelectedItem());
        vgap=Integer.parseInt(vchoice.getSelectedItem());
        
        buttonPenal.updateLayout(rows,cols,hgap,vgp)
}
}