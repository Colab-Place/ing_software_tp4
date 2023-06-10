package com.mycompany.app;

public class Cliente {
    private final String id;
    private String fullname;
    
    public Cliente(String id, String fullname) {
        this.id = id;
        this.fullname = fullname;
    }

    public String getId() {
        return id;
    }


    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }


    
}
