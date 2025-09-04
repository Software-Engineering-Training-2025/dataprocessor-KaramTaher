package org.example.dataprocessor.Analysis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnalysisMedian implements Analysisinterface{
    @Override
    public double analysis(List<Integer> numbers) {
        if (numbers.isEmpty()){
            return Double.NaN;
        }
        List<Integer> number = new ArrayList<>(numbers);
        Collections.sort(number);
        double median;
        int middle = number.size()/2;;
        int sum =0;
        if(number.size()%2==0){
            sum = number.get(middle) + number.get(middle-1);
            median = (double) sum / 2;
        } else {
            median = (double) number.get(middle);
        }
        return median;

    }
}
