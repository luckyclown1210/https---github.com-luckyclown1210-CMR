package com.coursemonitor.entity;
// Generated Mar 28, 2016 9:57:55 PM by Hibernate Tools 4.3.1



/**
 * AssignCourseId generated by hbm2java
 */
public class AssignCourseId  implements java.io.Serializable {


     private String courseId;
     private int year;

    public AssignCourseId() {
    }

    public AssignCourseId(String courseId, int year) {
       this.courseId = courseId;
       this.year = year;
    }
   
    public String getCourseId() {
        return this.courseId;
    }
    
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    public int getYear() {
        return this.year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AssignCourseId) ) return false;
		 AssignCourseId castOther = ( AssignCourseId ) other; 
         
		 return ( (this.getCourseId()==castOther.getCourseId()) || ( this.getCourseId()!=null && castOther.getCourseId()!=null && this.getCourseId().equals(castOther.getCourseId()) ) )
 && (this.getYear()==castOther.getYear());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCourseId() == null ? 0 : this.getCourseId().hashCode() );
         result = 37 * result + this.getYear();
         return result;
   }   


}

