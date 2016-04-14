/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coursemonitor.model;

import com.coursemonitor.entity.Course;
import com.coursemonitor.entity.Staff;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Nghia
 */
public class CourseDao {

    public void save(Course c) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(c);
        session.getTransaction().commit();
        session.close();
    }

    
//    public void update(Course c,CourseLeader cl,CourseModerator cm) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        c.setCourseLeader(cl);
//        c.setCourseModerator(cm);
//        session.update(c);
//        session.getTransaction().commit();
//        session.close();
//    }

    public List<Course> getCourse() {
        List<Course> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Course";
        Query query = session.createQuery(hql);
        list = query.list();
        session.close();
        return list;
    }
    
      public Course getCourseById(String id) {
        List<Course> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Course where courseId = :id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        Course c = (Course)query.list().get(0);
        session.close();
        return c;
    }
    

  
    public List<Course> searchCourse(String key) {
        List<Course> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Course where courseName like :keyword ";
        Query query = session.createQuery(hql);
        query.setParameter("keyword", "%" + key + "%");
        list = query.list();
        session.close();
        return list;
    }

    public List<Course> getCourseByCL(Staff cl) {
        List<Course> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Course where courseLeader = :keyword ";
        Query query = session.createQuery(hql);
        query.setParameter("keyword", cl);
        list = query.list();
        session.close();
        return list;
    }
    
    
    }


