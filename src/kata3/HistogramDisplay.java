package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{

    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }
    public void execute(){
        setVisible(true);
    }
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        return chartPanel;
    }
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("HISTOGRAMA JFreeChart", "Dominios", 
                "Nº emails", dataSet, PlotOrientation.VERTICAL, 
                false, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
        return chart;        
    }
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(15, "", ".ulpgc.es");
        dataset.addValue(2, "", ".google.com");
        dataset.addValue(20, "", ".yahoo.es");
        dataset.addValue(4, "", ".bing.com");
        dataset.addValue(10, "", ".paco.es");
        return dataset;
    }
}
