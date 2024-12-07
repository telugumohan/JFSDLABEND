package com.klef.jfsd.exam;

public class Course {
    private Integer courseId;
    private String courseName;
    private Integer credits;
    private Instructor instructor;

    public Course(Integer courseId, String courseName, Integer credits, Instructor instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.instructor = instructor;
    }

    // Getters and setters
    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course{id=" + courseId + ", name=" + courseName + ", credits=" + credits + ", instructor=" + instructor + "}";
    }
}
