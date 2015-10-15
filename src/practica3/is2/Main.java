package practica3.is2;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Histogram<String> histo = new Histogram<>();
        histo.increment("gmail.com");
        histo.increment("gmail.com");
        histo.increment("gmail.com");
        histo.increment("gmail.com");
        histo.increment("gmail.com");
        histo.increment("gmail.com");
        
        histo.increment("ulpgc.com");
        histo.increment("ulpgc.com");
        histo.increment("ulpgc.com");
        histo.increment("ulpgc.com");
        histo.increment("ulpgc.com");
        histo.increment("ulpgc.com");
        
        histo.increment("ull.com");
        histo.increment("ull.com");
        histo.increment("ull.com");
        histo.increment("ull.com");
        histo.increment("ull.com");
        histo.increment("ull.com");
        
        HistogramDisplay histo1 = new HistogramDisplay(histo);
        histo1.execute();
    }
    
}
