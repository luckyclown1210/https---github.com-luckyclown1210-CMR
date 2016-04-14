package com.coursemonitor.entity;
// Generated Mar 28, 2016 9:57:55 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Course generated by hbm2java
 */
public class Course  implements java.io.Serializable {


     private String courseId;
     private String courseName;
     private String academicSession;
     private String courseImg;
     private String description;
     private Set assignCourses = new HashSet(0);
     private Set reports = new HashSet(0);

    public Course() {
    }

	
    public Course(String courseId) {
        this.courseId = courseId;
    }
    public Course(String courseId, String courseName, String academicSession, String courseImg, String description, Set assignCourses, Set reports) {
       this.courseId = courseId;
       this.courseName = courseName;
       this.academicSession = academicSession;
       this.courseImg = courseImg;
       this.description = description;
       this.assignCourses = assignCourses;
       this.reports = reports;
    }
   
    public String getCourseId() {
        return this.courseId;
    }
    
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    public String getCourseName() {
        return this.courseName;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getAcademicSession() {
        return this.academicSession;
    }
    
    public void setAcademicSession(String academicSession) {
        this.academicSession = academicSession;
    }
    public String getCourseImg() {
        return this.courseImg;
    }
    
    public void setCourseImg(String courseImg) {
        this.courseImg = courseImg;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Set getAssignCourses() {
        return this.assignCourses;
    }
    
    public void setAssignCourses(Set assignCourses) {
        this.assignCourses = assignCourses;
    }
    public Set getReports() {
        return this.reports;
    }
    
    public void setReports(Set reports) {
        this.reports = reports;
    }




}


