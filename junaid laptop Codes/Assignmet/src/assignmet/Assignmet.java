
package assignmet;
public class Assignmet {
    public static void main(String[] args ) {
        
        
        int x,y;
        Person P1=new Person();
        P1.set_name("Junaid");
        P1.set_age(20);
        x = P1.get_age();
        Person P2=new Person();
        P2.set_name("Hassan");
        P2.set_age(23);
        y=P2.get_age();
        
     

    if(y > x)
    {
        System.out.println("P2 person is elder");
    }
    else
    {
        System.out.println("P1 person is elder");
    }
    }
}