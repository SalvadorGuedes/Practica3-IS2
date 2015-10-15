package practica3.is2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.lang.Exception;
public class Main {

    public static void main(String[] args) {
        Histogram<String> histo = new Histogram<>();
        try{
           String name = "C:\\Users\\Salvador\\Documents\\0-Salvador\\ULPGC\\TERCERO\\Netbeans\\Practica3 IS2\\emailsfilev1.txt";
           BufferedReader fileIn = new BufferedReader(new FileReader(name));
           String mail;
           
           while((mail = fileIn.readLine())!= null){
               if(mail.contains("@")){
                   histo.increment(mail.split("@")[1]);
               }
           }
        }catch(Exception e){
        }
        HistogramDisplay histo1 = new HistogramDisplay(histo);
        histo1.execute();
    }
    
}
