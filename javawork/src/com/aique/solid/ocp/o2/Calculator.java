package com.aique.solid.ocp.o2;

import java.security.InvalidParameterException;

public class Calculator {

    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Can not perform operation");
        }

        operation.perform();
    }


    public void badCalculator(String operation){
        if(operation.equals("add")){
            //add call
        }
        else if(operation.equals("substract")){
            //do subtract
        }
        else if(operation.equals("division")){
            //do subtract
        }
        else{

        }

    }
}
