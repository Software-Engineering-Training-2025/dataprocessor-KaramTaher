package org.example.dataprocessor.Analysis;

import java.util.*;

public class AnalysisTopThreeFrequentCountSum implements Analysisinterface{
    @Override
    public double analysis(List<Integer> numbers) {
        if (numbers.isEmpty()){
            return 0.0;
        }
        Map<Integer, Integer> d = new HashMap<>();
        for (Integer number : numbers) {
            if (d.containsKey(number)) {
                d.put(number, d.get(number) + 1);
            } else {
                d.put(number, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(d.entrySet());
        list.sort((a, b) -> {
            int cmp = Integer.compare(b.getValue(), a.getValue());
            if (cmp == 0) {
                return Integer.compare(a.getKey(), b.getKey());
            }
            return cmp;
        });

        int sum = 0;
        int n = Math.min(3, list.size());
        for (int i = 0; i < n; i++) {
            int value = list.get(i).getValue();
            if (value > 1) {
                sum += value;
            }

        }
        return sum;
    }
}
