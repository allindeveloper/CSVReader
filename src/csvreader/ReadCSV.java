/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvreader;

/**
 *
 * @author Spark
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    
public static String csvFile = "C:\\Users\\Spark\\Documents\\NetBeansProjects\\CSVReader\\src\\csvreader\\slatecode test.csv";
    public static void main(String[] args)  {
       BufferedReader br = null;
        String line = "";
        List<String[]> words = new ArrayList<String[]>();
    try {
        br = new BufferedReader(new FileReader(csvFile));
    
            while ((line = br.readLine()) != null) {
                words.add(line.split(","));
     } 
    } catch (FileNotFoundException  ex) {
      ex.printStackTrace();
    } catch (IOException ex) {
       ex.printStackTrace();
    }
            String[][] mat = new String[words.sizCSVe()][10];
            words.toArray(mat);
          
          for(int i=0; i<10; i++) {
           System.out.print(  mat[i][i]+ "" );
           System.out.println("");
             }
     
       }
        

}
