package com.lab.Project_JAVA;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lab.util.HibernateConnection;

public class Run {
    public static void main(String[] args) {

        try {
            Customer c1 = new Customer(10001, "Nuttagon", 631812362, "nuttagon@gmail.com", "USA", "nuttagonEx",
                    "nuttagon001");

            SessionFactory sf = HibernateConnection.doHibernateConnection();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();

            session.persist(c1);

            tx.commit();
            session.close();
            System.out.println("Command completed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
