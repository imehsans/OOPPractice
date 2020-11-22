/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Ehsan Jadoon
 */
public class FileIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
     FileIO fi=new FileIO();
//     String File="C:\\Users\\Ehsan Jadoon\\Desktop\\OOP Assigment\\pollution report.text";
     String txtFile="C:\\Users\\Ehsan Jadoon\\Desktop\\OOP Assigment\\pract.txt";
//     fi.ReadFile(txtFile);
     
    String strDatatext= "\nkhan is back";
     fi.WriteFile(txtFile, strDatatext);
     fi.ReadFile(txtFile);
    }
    public void WriteFile(String strFile,String strData) throws IOException{
        try(BufferedWriter bf=new BufferedWriter(new FileWriter(strFile,true))){
           bf.write(strData);
        }
        catch(IOException e){
             e.printStackTrace();   
        }
    }
    public void ReadFile(String strFile) throws FileNotFoundException, IOException{
        String strBuff;
        try(BufferedReader bf=new BufferedReader(new FileReader(strFile))){
            while((strBuff=bf.readLine())!=null){
                System.out.println(strBuff);
            }
        }
         catch(IOException e){
             e.printStackTrace();
         }   
    }
    
}
