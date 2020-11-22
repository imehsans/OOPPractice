/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template f, choose Tools | Templates
 * and open the template in the editor.
 */
package asig_oop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
/**
 *
 * @author khurram
 */
public class TokenizerClass {
     FileWriter fw;
  File f = new File("pollution_report.txt"); 
    public TokenizerClass() throws IOException {
        fw = new FileWriter("In_File_Write.txt");
    }
  
    FileInputStream fs = new FileInputStream(f); 
    InputStreamReader i = new InputStreamReader(fs);
    void fxnForWork() throws IOException{
        BufferedReader read = new BufferedReader(i); 
        ArrayList<String> words_in_list = new ArrayList<>();
        String S_Line ; 
        int up_c=0,count=0, low_c=0,Sc=0,word=0;
        while((S_Line = read.readLine()) != null) {
             for (int i=0; i<S_Line.length(); i++)
	{
    		 for(char d='a'; d<='z'; d++)
    		{
        		   if (S_Line.charAt(i) == d)
          		   {
                    		low_c++;
          		   }		
     		}
	}
            for (int i=0; i<S_Line.length(); i++)
	{
            for(char c='A'; c<='Z'; c++){
                if (S_Line.charAt(i) == c){
                    up_c++;
                }		
            }
	}
        StringTokenizer words = new StringTokenizer(S_Line); 
      while(words.hasMoreTokens()) { 
        count++; 
        words.nextToken(); 
      }    
            StringTokenizer st = new StringTokenizer(S_Line);
            String[] SentList = S_Line.split("[!?.:]+"); 
             Sc += SentList.length; 
            S_Line.split("-!~\"'().,");//Checking in Single Line
	for (int i=0; i<S_Line.length(); i++){
            while(st.hasMoreTokens()){
                String tmp = st.nextToken();
                if(!words_in_list.contains(tmp)){// if the Word is Exist
                    words_in_list.add(tmp);
                    word++;
                }
            }
	}
//    Writing in File
    try (PrintWriter printWriter = new PrintWriter(fw)){
        printWriter.println("Words starts from lower case "+low_c);
        printWriter.println("Words in File                "+count);
        printWriter.println("Words starts from Uper case  "+up_c);
        printWriter.println("Total Words                  "+word);
        printWriter.println("Number of lines              "+Sc);
        printWriter.println("Words After Work             "+words_in_list);
    
    }
}
    System.out.println("Words in File=               "+count);
    System.out.println("Number of lines              "+Sc);
    System.out.println("Words starts from lower case "+low_c);
    System.out.println("Words starts from Uper case  "+up_c);
    System.out.println("Total Words                  "+word); 
    }
}
