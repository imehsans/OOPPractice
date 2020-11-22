
package assignmet;
public class Person {

    
   private String name;
   private int age;
    
    
   public Person()
    {
        this.name="Ali";
        this.age=9;
    }
    public Person (String s, int i)
    {
        this.name=s;
        this.age=i;
    }
    public void set_name(String s)
    {
        this.name=name;
    }
    public void set_age(int i)
    {
        this.age=age;
    }
        
    public String get_name()
    {
       return this.name;
    }
    public int get_age()
    {
       return this.age;
    }
    
    
}
