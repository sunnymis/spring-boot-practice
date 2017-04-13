package com.topic; 

public class Topic {
    
    private String name; 
    private String id; 
    private String description; 

    public Topic() {

    }

    public Topic(String id, String name, String description) {
        this.id = id; 
        this.name = name;
        this.description = description; 
    }

    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
