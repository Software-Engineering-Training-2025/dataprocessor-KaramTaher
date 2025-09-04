package org.example;

import org.example.dataprocessor.Cleaning.CleanInterface;
import org.example.dataprocessor.DataProcessorService;
import org.example.dataprocessor.Factory.CleaningFactory;
import org.example.dataprocessor.enums.AnalysisType;
import org.example.dataprocessor.enums.CleaningType;
import org.example.dataprocessor.enums.OutputType;

import java.util.List;

import static org.example.dataprocessor.Factory.CleaningFactory.getCleaningType;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        DataProcessorService dataProcessorService = new DataProcessorService();
        List<Integer> data = List.of(2,4,4,4,5,5,7,9);
        dataProcessorService.process(CleaningType.REPLACE_NEGATIVES_WITH_ZERO,AnalysisType.STD_DEV , OutputType.CONSOLE , data);
        //System.out.println(dataProcessorService.process(CleaningType.REMOVE_NEGATIVES ,);
        //List<Integer> data = List.of(1, 2, 3, -1, -4, 0);
        //System.out.println(CleaningFactory.getCleaningType(CleaningType.REMOVE_NEGATIVES).clean(data));
    }

}