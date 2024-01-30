package com.test.pLesson56.p2;


import com.test.pLesson56.SessionCreator;
import com.test.pLesson56.p1.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class Utils {

    public void savePrinter(final Printer printer) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(printer);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveRole(final Role role) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(role);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveDevice(final Device device) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(device);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public List<Device> getAllDevices() {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final Query<Device> fromDevice = session.createQuery("from Device", Device.class);
            final List<Device> list = fromDevice.list();
            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public void saveMassages(final Messages messages) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(messages);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void savePerson(final Personal personal) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(personal);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Printer gedPrinter(final int id) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final Printer printer = session.find(Printer.class, Integer.valueOf(id));
            return printer;
        } catch (Exception e) {
            throw new IllegalStateException();
        }
    }

}
