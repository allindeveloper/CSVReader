
package csvreader;

/**
 *
 * @author Precious
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
            String[][] math = new String[words.size()][words.size()];
            words.toArray(math);
          
          for(int i=0; i<10; i++) {
           System.out.print(  math[i][i]+ "" );
           System.out.println("");
             }
     
       }
        

}
