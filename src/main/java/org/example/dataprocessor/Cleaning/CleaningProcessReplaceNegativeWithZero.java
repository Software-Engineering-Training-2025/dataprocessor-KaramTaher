package org.example.dataprocessor.Cleaning;

import java.util.ArrayList;
import java.util.List;

public class CleaningProcessReplaceNegativeWithZero implements CleanInterface {


    @Override
    public List<Integer> clean(List<Integer> numbers) {
        if(numbers.isEmpty()){
            return List.of();
        }

        ArrayList<Integer> number = new ArrayList<Integer>(numbers);
        int length = number.size();

        for(int i=0 ; i<length ; i++){
            if(number.get(i)>=0){
                continue;
            } else{
                number.set(i,0);
            }
        }
        return number;
    }
}
