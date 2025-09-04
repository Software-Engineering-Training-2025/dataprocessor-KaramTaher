package org.example.dataprocessor.Factory;

import org.example.dataprocessor.Cleaning.CleanInterface;
import org.example.dataprocessor.Cleaning.CleaningProcessRemoveNegative;
import org.example.dataprocessor.Cleaning.CleaningProcessReplaceNegativeWithZero;
import org.example.dataprocessor.enums.CleaningType;

import java.util.List;

public class CleaningFactory {
    public static CleanInterface getCleaningType(CleaningType cleaningType) {
        if (cleaningType == CleaningType.REMOVE_NEGATIVES) {
            return new CleaningProcessRemoveNegative();
        } else if (cleaningType == CleaningType.REPLACE_NEGATIVES_WITH_ZERO) {
            return new CleaningProcessReplaceNegativeWithZero();

        }
        throw new UnsupportedOperationException("Unsupported Operation");
    }
}
