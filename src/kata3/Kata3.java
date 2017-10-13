package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram histogram = new Histogram();
        histogram.increment(".ulpgc.es");
        histogram.increment(".ulpgc.es");
        histogram.increment(".ulpgc.es");
        histogram.increment(".ulpgc.es");
        histogram.increment(".ulpgc.es");
        histogram.increment(".ulpgc.es");
        histogram.increment(".google.es");
        histogram.increment(".google.es");
        histogram.increment(".google.es");
        histogram.increment(".google.es");
        histogram.increment(".paco.com");
        histogram.increment(".paco.com");
        histogram.increment(".paco.com");
        histogram.increment(".paco.com");
        histogram.increment(".paco.com");
        histogram.increment(".paco.com");
        histogram.increment(".paco.com");
        histogram.increment(".paco.com");
        histogram.increment(".paco.com");
        histogram.increment(".paco.com");
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
}
