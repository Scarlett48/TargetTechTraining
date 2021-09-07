package com.aique.service;

public class SimpleServiceTest {

    public void testActiveWhenCollaboratorIsActive(){
        SimpleService service = new SimpleService();
        Collaborator c = new StubCollaborator();
                c.isActive();
        service.setCollaborator(c);
//        assertTrue(service.isActive());
    }

    public static void main(String[] args) {
        SimpleServiceTest t  = new SimpleServiceTest();
        t.testActiveWhenCollaboratorIsActive();
    }
}
