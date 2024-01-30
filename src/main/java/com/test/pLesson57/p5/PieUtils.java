package com.test.pLesson57.p5;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.test.pLesson56.SessionCreator;

public class PieUtils {

    public void savePie(final Pie pie) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(pie);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
