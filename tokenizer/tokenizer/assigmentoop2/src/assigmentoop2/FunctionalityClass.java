/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigmentoop2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.*; 
import java.util.ArrayList;
import java.util.StringTokenizer;
/**
 *
 * @author khurram
 */
public class FunctionalityClass {
    FileWriter fileWriter;
    File file = new File("C:\\Users\\Ehsan Jadoon\\Desktop\\OOP Assigment"); 
    public FunctionalityClass() throws IOException {
        fileWriter = new FileWriter("pollution report");
    }
  
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream);
         FileReader fr=new FileReader("");
   void function() throws IOException{
        BufferedReader reader = new BufferedReader(input); 
        ArrayList<String> wordList = new ArrayList<>();
        String line ; 
        int capital=0,count=0, lower=0,sentenceCount=0,w=0;
        while((line = reader.readLine()) != null) {
             for (int i=0; i<line.length(); i++)
	{
    		 for(char d='a'; d<='z'; d++)
    		{
        		   if (line.charAt(i) == d)
          		   {
                    		lower++;
          		   }		
     		}
	}
            for (int i=0; i<line.length(); i++)
	{
    		 for(char c='A'; c<='Z'; c++)
    		{
        		   if (line.charAt(i) == c)
          		   {
                    		capital++;
          		   }		
     		}
	}
        StringTokenizer words = new StringTokenizer(line); 
      while(words.hasMoreTokens()) { 
        count++; 
        words.nextToken(); 
      }    
            StringTokenizer st = new StringTokenizer(line);
            String[] sentenceList = line.split("[!?.:]+"); 
             sentenceCount += sentenceList.length; 
            line.split("-!~\"'().,");
	for (int i=0; i<line.length(); i++)
	
                while(st.hasMoreTokens())
                {
                    String tmp = st.nextToken();
                    
                    
                    if(!wordList.contains(tmp))
                    {
                        wordList.add(tmp);
                        w++;
                        
                    }}
	}
    System.out.println("-----------------------------------------------|");
    System.out.println("Total number of words in the file= "+count+"--------|");
    System.out.println("Total number lines= "+sentenceCount+"------------------------|");
    System.out.println("-----------------------------------------------|");
    PrintWriter printWriter = new PrintWriter(fileWriter);
    printWriter.println("------------------------------------------|");
    printWriter.println(" Total number of words starting with lower letter "+lower+"-----------------|");
    printWriter.println("Total number of words in the file"+count+"-------------|");
    printWriter.println(" Total number of words starting with capital letter "+capital+"------------|");
    printWriter.println(" words \n"+w+"------------------------------|");
    printWriter.println("otal number of lines"+sentenceCount+"----------------------|");
    printWriter.println("------------------------------------------|");
    printWriter.println("presents words \n"+wordList+"----|");
    printWriter.close();
}


   
      
    }
    
