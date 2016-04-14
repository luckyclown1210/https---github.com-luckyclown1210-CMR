/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coursemonitor.model;

import com.coursemonitor.entity.Staff;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Nghia
 */
public class StaffDao {

    public List<Staff> getStaff() {
        List<Staff> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Staff";
        Query query = session.createQuery(hql);
        list = query.list();
        session.close();
        return list;
    }

    public Staff getStaffByName(String name) {
        List<Staff> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Staff where stName = :name";
        Query query = session.createQuery(hql);
        query.setParameter("name", name);
        Staff result = (Staff) query.list().get(0);
        session.close();
        return result;
    }

    public List<Staff> getStaffByFaculty(String name) {
        List<Staff> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Staff where faculty = :name";
        Query query = session.createQuery(hql);
        query.setParameter("name", name);
        list = query.list();
        session.close();
        return list;
    }

    public Staff checkLogin(String user, String pass) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Staff where stUsername = :username AND stPassword = :password ";
        Query query = session.createQuery(hql);
        query.setParameter("username", user);
        query.setParameter("password", pass);
        Staff s = new Staff();
        if (query.list().isEmpty()) {
            return null;
        } else {
            s = (Staff) query.list().get(0);
        }
        session.close();
        return s;
    }
}
