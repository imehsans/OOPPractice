/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa17.bee.pkg060;

/**
 *
 * @author JUNAID ALI KHAN
 */
import java.util.Scanner;
public class FA17BEE060 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    int[] bin1=new int[40];
    int[] bin2=new int[20];
    int[] bin3=new int[29];
    int input,b,i=0,j=0,k=0;
    int choice;
    do{
      
          System.out.println("Enter Number:");
          input=a.nextInt();
          if(input>10 && input<50)
          {
              bin1[i]= input;
              i++;
          }
          else
              if(input>60 && input<80)
              {
                  bin2[j]=input;
                  j++;
              }
          else
                  if(input>81 && input<110)
                  {
                      bin3[k]=input;
                      k++;
                  }    
      } while(input!=0);
      for(int x:bin1)
      {
          system.out.println("bin1 has",+x);
      }
      for(int y: bin2)
      {
          system.out.println("bin2 has",+y);
      }
      for(int z: bin3)
      {
        system.out.println("bin3 has",+z);
      }
      System.out.println("press 1 for try again");
      choice=a.nextInt();
    }while(choice==1);
    }
}
