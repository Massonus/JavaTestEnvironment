package org.test.pLesson56.p1.repository;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.test.pLesson56.SessionCreator;
import org.test.pLesson56.p1.entity.Device;
import org.test.pLesson56.p1.entity.Factory;
import org.test.pLesson56.p1.entity.Flower;
import org.test.pLesson56.p1.entity.Order;

import javax.persistence.Query;
import java.util.List;

public class RepositoryGet {
    public static void getDevice(Integer integer) {
        Session session = SessionCreator.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query usersQuery = (Query) session.createQuery("from Device where id = :idDevice", Device.class);
        usersQuery.setParameter("idDevice", integer);
        System.out.println(usersQuery.getSingleResult());
        transaction.commit();
        session.close();
    }

    public static Boolean saveFlower(final Flower flower) {
        try (final Session session = SessionCreator.getSessionFactory().openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(flower);
            transaction.commit();
            return true;
        } catch (final Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public static Flower getFlower(final Long id) {
        try (final Session session = SessionCreator.getSessionFactory().openSession()) {
            final Query usersQuery = (Query) session.createQuery("from Flower where id =:flowerId", Flower.class);
            usersQuery.setParameter("flowerId", id);
            final Flower singleResult = (Flower) usersQuery.getSingleResult();
            return singleResult;
        } catch (final Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public static Boolean updateFlower(final Flower flower) {
        try (final Session session = SessionCreator.getSessionFactory().openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.update(flower);
            transaction.commit();
            return true;
        } catch (final Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public static Boolean deleteFlower(final Flower flower) {
        try (final Session session = SessionCreator.getSessionFactory().openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.delete(flower);
            transaction.commit();
            return true;
        } catch (final Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public static Boolean saveOrder(final Order order) {
        try (final Session session = SessionCreator.getSessionFactory().openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(order);
            transaction.commit();
            return true;
        } catch (final Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public static Order getOrder(final Long id) {
        try (final Session session = SessionCreator.getSessionFactory().openSession()) {
            return session.find(Order.class, id);
        } catch (final Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public static void getFactory(Integer integer) {
        Session session = SessionCreator.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query usersQuery = (Query) session.createQuery("from Factory where id =:factoryId", Factory.class);
        usersQuery.setParameter("factoryId", integer);
        List<Device> deviceList = usersQuery.getResultList();
        transaction.commit();
        session.close();
        System.out.println("Factory list: " + deviceList.toString());
    }

    public static void getDivByFactoryId(Integer integer) {
        Session session = SessionCreator.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query query = (Query) session.createQuery("from Device as device inner join fetch device.factory where device.factory.id = :factoryId");
        query.setParameter("factoryId", integer);
        List<Device> deviceList = query.getResultList();
        transaction.commit();
        session.close();
        System.out.println("Factory list (join): " + deviceList.toString());
    }

    public static void getSum() {
        Session session = SessionCreator.getSessionFactory().openSession();
        String hql = "select d.factory.id, sum(d.price), count (d.id) from Device as d group by d.factory.id order by d.factory.id";
        List<?> list = session.createQuery(hql).list();
        System.out.println("Group by: ");
        for (int i = 0; i < list.size(); i++) {
            Object[] row = (Object[]) list.get(i);
            System.out.println("Factory № " + row[0] + ", Count fo devices: " + row[2] + ", amount of devices: " + row[1]);
        }
        session.close();
    }
}
