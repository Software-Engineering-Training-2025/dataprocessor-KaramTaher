package org.example.dataprocessor.Factory;

import org.example.dataprocessor.Analysis.*;
import org.example.dataprocessor.enums.AnalysisType;

public class AnalysisFactory {
    public static Analysisinterface getAnalysisType(AnalysisType analysisType){
        if(analysisType == AnalysisType.MEAN){
            return new AnalysisMean();
        } else if(analysisType == AnalysisType.MEDIAN) {
            return new AnalysisMedian();
        } else if (analysisType == AnalysisType.STD_DEV) {
            return new AnalysisStdDev();
        } else if (analysisType == AnalysisType.P90_NEAREST_RANK) {
            return new AnalysisNearestRank();
        } else if (analysisType == AnalysisType.TOP3_FREQUENT_COUNT_SUM) {
            return new AnalysisTopThreeFrequentCountSum();
        }

        throw new UnsupportedOperationException("Unsupported Operation");

    }
    }

