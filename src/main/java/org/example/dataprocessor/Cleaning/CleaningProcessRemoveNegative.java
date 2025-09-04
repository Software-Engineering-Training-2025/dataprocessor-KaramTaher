package org.example.dataprocessor.Cleaning;

import java.util.ArrayList;
import java.util.List;

public class CleaningProcessRemoveNegative implements CleanInterface {

    @Override
    public List<Integer> clean(List<Integer> numbers) {
        if(numbers.isEmpty()){
            return List.of();
        }

        ArrayList<Integer> number = new ArrayList<Integer>();
        for(Integer n: numbers){
            if(n<0){
                continue;
            } else{
                number.add(n);
            }
        }
        return number;
    }
}
