package com.aique.service;

public class SimpleService implements Service{
    private Collaborator collaborator;

    public boolean isActive(){
        return collaborator.isActive();
    }

    public void setCollaborator(Collaborator collaborator){
        this.collaborator=collaborator;
    }

}
