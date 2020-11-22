
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javafx.scene.shape.Box;


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
        Component border = null;
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
public class GridLabApplet extends Applet {
    public void init(){
        ButtonPanel buttonPanel=new ButtonPanel(this);
        Picker picker=new Picker(buttonPanel);
        setLayout(new Boardlayout());
        GridLabApplet GridLabApplet = add(new Box(picker, "Grid layout Settings"), "North"); /*add*/
        add(buttonPanel, "Center");
    }
}
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
    private PopupMenu rowChoice;
    private PopupMenu colChoice;
Picker(ButtonPanel buttonPanel ){
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
 
    public void itemStateChanged(ItemEvent event){
        int rows ,cols,hgap,vgap;
        rows=Integer.parseInt(rowChoice.getSelectedItem());
        cols=Integer.parseInt(colChoice.getSelectedItem());
        hgap=Integer.parseInt(hchoice.getSelectedItem());
        vgap=Integer.parseInt(vchoice.getSelectedItem());
        
        buttonPenal.updateLayout(rows,cols,hgap,vgap);
}
}