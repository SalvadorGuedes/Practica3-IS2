package practica3.is2;

import java.awt.Container;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{
    
    private final Histogram<String> histograma; 

    public HistogramDisplay(Histogram<String> histograma) {
        super("HISTOGRAMA");
        this.histograma = histograma;
        setContentPane(createPanel());
        pack();
    }

    private ChartPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart(null,
                "Dominios",
                "Nº Email",
                dataset,
                PlotOrientation.VERTICAL,
                true,true,true);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (String Key : histograma.keySet()) {
            dataset.addValue(histograma.get(Key),"",Key);
        }
        return dataset;
    }
    
    public void execute(){
        setVisible(true);
    }
}
