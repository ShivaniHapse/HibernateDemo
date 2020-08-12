package com.ideas.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("firs", "last", "em@email.com");
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(person);
        System.out.println(person);
        session.getTransaction().commit();
        session.close();
    }
}
