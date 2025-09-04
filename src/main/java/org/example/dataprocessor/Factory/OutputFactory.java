package org.example.dataprocessor.Factory;

import org.example.dataprocessor.Cleaning.CleaningProcessRemoveNegative;
import org.example.dataprocessor.Cleaning.CleaningProcessReplaceNegativeWithZero;
import org.example.dataprocessor.Output.Console;
import org.example.dataprocessor.Output.OutputInterface;
import org.example.dataprocessor.Output.TextFile;
import org.example.dataprocessor.enums.CleaningType;
import org.example.dataprocessor.enums.OutputType;

public class OutputFactory {
    public static OutputInterface getOutputType(OutputType outputType){
        if (outputType == OutputType.CONSOLE) {
            return new Console();
        } else if (outputType == OutputType.TEXT_FILE) {
            return new TextFile();

        }
        throw new UnsupportedOperationException("Unsupported Operation");

    }
}
