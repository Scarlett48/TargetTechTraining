package com.aique;

public class AdditionTest {
    private  int errorCount;

    public void testAdd(){
        Addition a = new Addition();
        double r = a.add(30,40);

        if(r!=70){
            throw  new IllegalStateException("Problem in method result ....."+r);
        }
    }

    public static void main(String[] args) {
        AdditionTest test = new AdditionTest();
        try {
            test.testAdd();
        }
        catch (Exception e){
            test.errorCount++;

            if(test.errorCount > 0){
                throw  new IllegalStateException("No of times error occured ....."+test.errorCount);
            }
        }
    }
}
