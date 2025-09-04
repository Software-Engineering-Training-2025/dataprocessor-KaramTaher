package org.example.dataprocessor.Analysis;

import java.util.List;

public class AnalysisMean implements Analysisinterface {
    @Override
    public double analysis(List<Integer> numbers) {
        if (numbers.isEmpty()){
            return Double.NaN;
        }
        double mean;
        int sum=0;
        int count = numbers.size();
        for(Integer n : numbers){
            sum = sum+n;
        }
        mean = (double) sum / count;
        return mean;
    }
}
