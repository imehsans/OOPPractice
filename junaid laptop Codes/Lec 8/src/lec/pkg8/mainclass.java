package lec.pkg8;

/**
 *
 * @author JUNAID ALI KHAN
 */
public class mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       student[] s_arr=new student[5];
       for(int i=0;i<s_arr.length;i++)
       {
       s_arr[i]=new student();
       }
        for(int i=0;i<s_arr.length;i++)
       {
       s_arr[i]=new student("Ali","FA17-BCE-022",123,60,'C');
       }
        student S1=new student("JAK","FA188",500,70,'B');
         for(int i=0;i<s_arr.length;i++)
       {
       s_arr[i]=new student(S1);
       }
        for (int i=0;i<s_arr.length;i++) 
        {
            s_arr[i].set_data();
        }
        for (int i=0;i<s_arr.length;i++) 
        {
            s_arr[i].display_data();
        }
        for( int i=0;i<5;i++)
        {
        s_arr[i].calc_percentage();
        }
        
    }
    
}