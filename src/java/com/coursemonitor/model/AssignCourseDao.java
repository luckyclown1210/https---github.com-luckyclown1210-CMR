/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coursemonitor.model;

import com.coursemonitor.entity.AssignCourse;
import com.coursemonitor.entity.AssignCourseId;
import com.coursemonitor.entity.Course;
import com.coursemonitor.entity.Staff;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Nghia
 */
public class AssignCourseDao {

    public void save(AssignCourse c) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(c);
        session.getTransaction().commit();
        session.close();
    }
    
    public void updateStatus(AssignCourse ac,int status) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        ac.setStatus(status);
        session.update(ac);
        session.getTransaction().commit();
        session.close();
    }
    
     public List<AssignCourse> getAssignedById(AssignCourseId id) {
        List<AssignCourse> list = null;        
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from AssignCourse where id = :keyword ";
        Query query = session.createQuery(hql);
        query.setParameter("keyword", id);
        list = query.list();
        session.close();
        return list;
    }
    
    
    public List<AssignCourse> getLeaderAssignedByCL(Staff cl) {
        List<AssignCourse> list = null;        
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from AssignCourse where staffByClId = :keyword and status = 0 ";
        Query query = session.createQuery(hql);
        query.setParameter("keyword", cl);
        list = query.list();
               
        session.close();
        return list;
    }
    
    public List<AssignCourse> getModeratorAssignedByCL(Staff cl) {
        List<AssignCourse> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from AssignCourse where staffByCmId = :keyword and status = 1";
        Query query = session.createQuery(hql);
        query.setParameter("keyword", cl);
        list = query.list();    
        session.close();
        return list;
    }
    
}
