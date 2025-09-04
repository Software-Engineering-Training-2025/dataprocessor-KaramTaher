package org.example.dataprocessor.Analysis;

import java.util.List;

public class AnalysisStdDev implements Analysisinterface{
    @Override
    public double analysis(List<Integer> numbers) {
        if (numbers.isEmpty()){
            return Double.NaN;
        }
        int n = numbers.size();
        double avgX;
        double summation=0;
        AnalysisMean mean = new AnalysisMean();
        avgX = mean.analysis(numbers);
        for(Integer number : numbers){
            summation += Math.pow(number-avgX,2);
        }
        double variance = summation / n;
        return Math.sqrt(variance);
    }
}
