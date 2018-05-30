package com.spring.Dao;

import com.spring.User.Test;
import com.spring.User.User;
import com.spring.model.Person;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Степан1 on 04.04.2018.
 */
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private SessionFactory sessionFactory;




    public void save(Test person) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(person);
        tx.commit();
        session.close();
    }


    public List<Test> listContact() {
        Session session = this.sessionFactory.getCurrentSession();
        session.beginTransaction();
        return session.createQuery("from Test").list();
    }


    public void removeContact(Integer id) {

      /*  Test contact = (Test) sessionFactory.getCurrentSession().load(
                Test.class, id);*/

        Session session2 = sessionFactory.getCurrentSession();
        session2.beginTransaction();

        Test contact = (Test) session2.load(Test.class, id);

        System.out.println(contact);

        if (null != contact) {
            //sessionFactory.getCurrentSession().beginTransaction().delete(contact);

            session2.delete(contact);
        }

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }



}
