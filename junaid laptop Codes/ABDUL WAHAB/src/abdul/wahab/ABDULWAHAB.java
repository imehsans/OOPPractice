/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abdul.wahab;


import java.util.Scanner;
public class ABDULWAHAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner z = new Scanner(System.in);
int[] bin1=new int[40];
int[] bin2=new int[20];
int[] bin3=new int[19];
int input,b,i=0,j=0,k=0;
int choice;
do{
System.out.println("Enter Number:");
input=z.nextInt();
if(input>10 && input <50)
{
bin1[i] = input;
i++;
}
else
if(input>60 && input <80)
{
bin2[j] = input;
j++;
}
else
if(input>81 && input <100)
{
bin3[k] = input;
k++;
}
}while(input !=0);
for (int x : bin1)
{
System.out.println("bin1 has"+x);
} for (int y : bin2)
{
System.out.println("bin2 has"+y);
} for (int t : bin3)
{
System.out.println("bin3 has"+t);
System.out.println("Click 1 for Try again");
} choice = z.nextInt();
while(choice==1);
}
    }



