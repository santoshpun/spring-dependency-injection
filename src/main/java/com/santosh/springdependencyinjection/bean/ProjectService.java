package com.santosh.springdependencyinjection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectDAO projectDAO;

    public void saveProject(int id, String name){
        this.projectDAO.addProject(id,name);
    }
}
