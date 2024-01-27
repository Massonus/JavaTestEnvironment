package org.test.pLesson57.p3;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.test.pLesson56.SessionCreator;

import java.util.List;

public class ParentUtils {

    public void saveParent(final Parent parent) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(parent);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveChild(final Child child) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(child);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Child> getAllChild() {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            final Query<Child> fromChild = session.createQuery("from Child", Child.class);
            return fromChild.list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
