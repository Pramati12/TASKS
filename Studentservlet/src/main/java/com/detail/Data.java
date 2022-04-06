package com.detail;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static final List<Student> students = new ArrayList<Student>();


    public Data() {

        Student s1 = new Student();
        s1.setName("watts");
        s1.setId(12);
        Student s2 = new Student();
        s2.setName("maxwell");
        s2.setId(13);

        course c1 = new course();
        c1.setCourseId(1);
        c1.setCourseName("eng");
        course c2 = new course();
        c2.setCourseId(2);
        c2.setCourseName("telugu");

        List<course> courselist = new ArrayList<course>();
        courselist.add(c1);

        s1.setCourselist(courselist);
        students.add(s1);
        students.add(s2);

    }

    public String getstudentData() {
        return students.toString();

    }

    public String getStudentDataById(int id) {

        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId())
                return students.get(i).toString();
        }

        return null;
    }
}











