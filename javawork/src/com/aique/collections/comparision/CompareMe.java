package com.aique.collections.comparision;

public class CompareMe implements Comparable<CompareMe>{

    private int magicNumber;
    private String name;

    @Override
    public int compareTo(CompareMe obj) {
        if(obj.magicNumber >0){
           return 20;
        }
        if (obj.magicNumber <0){

        }

        return 0;
    }
}
