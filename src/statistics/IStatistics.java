package statistics;

public interface IStatistics {
    void writeCSVFile(String scenarioNumber, double[] values);
    void buildMeasureRFile();
    void buildBarPlotFile();
    void buildBoxPlotRFile();
    void buildDotPlotRFile();
    void buildHistogramRFile();
    void buildStripChartRFile();
    void buildTTestRFile();
    void buildMostFrequentFitnessValuesRFile();
}
