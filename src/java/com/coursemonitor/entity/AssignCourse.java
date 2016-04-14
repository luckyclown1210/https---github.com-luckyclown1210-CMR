package com.coursemonitor.entity;
// Generated Mar 28, 2016 9:57:55 PM by Hibernate Tools 4.3.1



/**
 * AssignCourse generated by hbm2java
 */
public class AssignCourse  implements java.io.Serializable {


     private AssignCourseId id;
     private Course course;
     private Staff staffByCmId;
     private Staff staffByClId;
     private Integer studentCount;
     private Integer status;

    public AssignCourse() {
    }

	
    public AssignCourse(AssignCourseId id, Course course) {
        this.id = id;
        this.course = course;
    }
    public AssignCourse(AssignCourseId id, Course course, Staff staffByCmId, Staff staffByClId, Integer studentCount, Integer status) {
       this.id = id;
       this.course = course;
       this.staffByCmId = staffByCmId;
       this.staffByClId = staffByClId;
       this.studentCount = studentCount;
       this.status = status;
    }
   
    public AssignCourseId getId() {
        return this.id;
    }
    
    public void setId(AssignCourseId id) {
        this.id = id;
    }
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
    public Staff getStaffByCmId() {
        return this.staffByCmId;
    }
    
    public void setStaffByCmId(Staff staffByCmId) {
        this.staffByCmId = staffByCmId;
    }
    public Staff getStaffByClId() {
        return this.staffByClId;
    }
    
    public void setStaffByClId(Staff staffByClId) {
        this.staffByClId = staffByClId;
    }
    public Integer getStudentCount() {
        return this.studentCount;
    }
    
    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }




}


