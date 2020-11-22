package ClassObj;
import java.util.Scanner;
class node{
    Scanner in = new Scanner(System.in);
    int data;
    node next,pre,first,cur,temp;
    node(){
        first = null;
    }
    void create(){
        char ch = 'y';
        while(ch == 'y'){
            cur = new node();
            System.out.println("enter data");
            cur.data = in.nextInt();
            cur.next = null;
            if(first == null){
                first = pre = cur;
            }
            else{
                pre.next = cur;
                pre = cur;
            }
            System.out.println("enter y for yes ");
            ch = in.next().charAt(0);
            
        }
    }
    void display(){
        temp = first;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class ClassObj{
    public static void main(String args[]){
        node ob = new node();
        ob.create();
        ob.display(); 
        
    }
}