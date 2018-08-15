package com.workspace.profile.Domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name="Employee_Profile")
public class Employee implements Serializable {
    @Id
    @Column(name="EMPLOYEE_ID",unique=true,nullable=false)
    String id;

    public Employee() {
    }

    public Employee(String id, String name, String employer, String exp, String technology) {
        this.id = id;
        this.name = name;
        this.employer = employer;
        this.exp = exp;
        this.technology = technology;
    }

    @Column(name="NAME",nullable=false)
    String name;

    @Column(name="EMPLOYER",nullable=false)
    String employer;

    @Column(name="EXPERIENCE",nullable=false)
    String exp;

    @Column(name="TECHNOLOGY",nullable=false)
    String technology;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }



}
