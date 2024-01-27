package org.test.pLesson57.p2;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.test.pLesson56.SessionCreator;

import java.util.List;

public class AccountUtils {

    public void saveAccount(final Account account) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(account);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void savProfile(final Profile profile) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(profile);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getProfileTypeById(final int id) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {

            final Query query = session.createQuery("select p.type FROM Profile as p where id = :id", String.class);
            query.setParameter("id", id);
            final List<String> list = query.list();
            return list.get(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
