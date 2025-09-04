package org.example.dataprocessor.Analysis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnalysisNearestRank implements Analysisinterface{
    @Override
    public double analysis(List<Integer> numbers) {
        if (numbers.isEmpty()){
            return Double.NaN;
        }
        List<Integer> number = new ArrayList<>(numbers);
        Collections.sort(number);
        int n = number.size();
        int rank = (int) Math.ceil(0.90 * n);
        int value = number.get(rank-1);
        return value;
    }
}
