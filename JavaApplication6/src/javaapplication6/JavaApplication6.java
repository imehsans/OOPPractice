package JavaApplication6;
import java.util.Scanner;
class LineType{
    String []array = new String[80];
    Scanner in = new Scanner(System.in);
    void Line(){
        char i = 'y';
        char c;
        int b=0;
        while(b!=80){
            c = in.next().charAt(0);
            String s = String.valueOf(c);
            if(c == ' '){
                b = b+1;
                array[i]=s;
            }
            
        }
    }
    void show(){
        for(int i=1;i<=array.length;i++){
            System.out.println(array[i]);
        }
    }
}
public class JavaApplication6{
    public static void main(String args[]){
        LineType ob = new LineType();
        ob.Line();
        ob.show();
    }
}