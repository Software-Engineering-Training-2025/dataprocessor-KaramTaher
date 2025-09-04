package org.example.dataprocessor.Output;

public class Console implements OutputInterface {

    @Override
    public void print(double value) {
        System.out.println("Result = "+ value);
    }
}
