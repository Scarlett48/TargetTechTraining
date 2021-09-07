package com.aique.annotations;

public class WorkService {

    public WorkService() {
        super();
    }

    public void compltedMethod() {

        System.out.println("This method is complete");
    }

    @Todo(priority = Todo.Priority.HIGH)
    public void notYetStartedMethod() {
        // No Code Written yet
    }

    @Todo(priority = Todo.Priority.MEDIUM, author = "Victor", status = Todo.Status.STARTED)
    public void incompleteMethod1() {
        //add your logic here
    }

    @Todo(priority = Todo.Priority.LOW, status = Todo.Status.STARTED )
    public void incompleteMethod2() {
        //add your logic here
    }
}
