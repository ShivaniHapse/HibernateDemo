package com.ideas.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("firs", "last", "em@email.com");
        Session session = SessionFactory().
    }
}
