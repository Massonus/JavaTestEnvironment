package org.test.pLesson57;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.test.pLesson56.SessionCreator;

import java.util.List;

public class JuceUtils {

    public void saveJuce(final Juice juice) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(juice);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Juice> getAllJuces() {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {

            final Query<Juice> fromJuice = session.createQuery("from Juice", Juice.class);
            final List<Juice> list1 = fromJuice.list();
            return list1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public Juice getById(final int id) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {

            final Query<Juice> query = session.createQuery("from Juice where id = 1", Juice.class);

            final Juice juice = query.list().get(0);
            return juice;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public List<String> getNameFromJuice() {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {

            final Query<String> query = session.createQuery("select j.name from Juice as j", String.class);
            final List<String> list = query.list();

            return list;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public void saveManufacturer(final Manufacturer manufacturer) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(manufacturer);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveOrange(final Orange orange) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(orange);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
