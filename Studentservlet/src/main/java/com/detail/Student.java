package com.detail;

import java.util.*;

class Student {

    Integer id;
    String name;
    Integer password;
    List<course>courselist;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public void setCourselist(List<course> courselist) {
        this.courselist = courselist;
    }

    public List<course> getCourselist() {
        return courselist;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password=" + password +
                ", courselist=" + courselist +
                '}';
    }
}



