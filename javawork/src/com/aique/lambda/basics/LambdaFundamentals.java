package com.aique.lambda.basics;

import java.util.Arrays;
import java.util.List;

public class LambdaFundamentals {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        list.forEach((Integer x)-> {  x += 2;
            System.out.println(x);
        });
    }
}
