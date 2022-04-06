package com.detail;


public class course {

    Integer courseId;
    String courseName;

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;

    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}


