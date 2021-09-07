package com.aique.annotations;

import java.lang.reflect.Method;

public class WorkApplication {

    public WorkApplication() {
        super();
    }

    public static void main(String[] args) {
        getWorkReport();
    }


    private static void getWorkReport() {

        Class businessLogicClass = WorkService.class;
        for(Method method : businessLogicClass.getMethods()) {
            Todo todoAnnotation = (Todo)method.getAnnotation(Todo.class);
            if(todoAnnotation != null) {
                System.out.println(" Method Name : " + method.getName());
                System.out.println(" Author : " + todoAnnotation.author());
                System.out.println(" Priority : " + todoAnnotation.priority());
                System.out.println(" Status : " + todoAnnotation.status());
                System.out.println(" --------------------------- ");
            }
        }
    }
}
