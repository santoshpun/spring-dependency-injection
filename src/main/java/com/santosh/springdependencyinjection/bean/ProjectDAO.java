package com.santosh.springdependencyinjection.bean;

import org.springframework.stereotype.Repository;

@Repository
public class ProjectDAO {

    public void addProject(int id, String name) {
        //store project details to database
        System.out.println("Project with id : " + id + ",name : " + name + " is saved to database");
    }
}
