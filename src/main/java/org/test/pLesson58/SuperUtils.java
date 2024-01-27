package org.test.pLesson58;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.test.pLesson56.SessionCreator;
import org.test.pLesson56.p1.entity.Flower;

import javax.persistence.criteria.*;
import java.util.List;

public class SuperUtils {

    public List getFlowers() {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            final CriteriaQuery<Flower> criteriaQuery = criteriaBuilder.createQuery(Flower.class);

            Root<Flower> root = criteriaQuery.from(Flower.class);
            criteriaQuery.select(root);
            final Query query = session.createQuery(criteriaQuery);
            return query.getResultList();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Flower getFlower(final String name) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            final CriteriaQuery<Flower> criteriaQuery = criteriaBuilder.createQuery(Flower.class);

            Root<Flower> root = criteriaQuery.from(Flower.class);
            criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("name"), name));
            final Query<Flower> query = session.createQuery(criteriaQuery);
            return query.getSingleResult();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int updateFlower(final Flower flower) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

            final Transaction transaction = session.beginTransaction();

            final CriteriaUpdate<Flower> criteriaUpdate = criteriaBuilder.createCriteriaUpdate(Flower.class);
            Root<Flower> root = criteriaUpdate.from(Flower.class);
            criteriaUpdate.set("name", flower.getName());
            criteriaUpdate.where(criteriaBuilder.equal(root.get("id"), flower.getId()));

            final int i = session.createQuery(criteriaUpdate).executeUpdate();

            transaction.commit();

            return i;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int deleteFlower(final Flower flower) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

            final Transaction transaction = session.beginTransaction();

            final CriteriaDelete<Flower> criteriaDelete = criteriaBuilder.createCriteriaDelete(Flower.class);
            Root<Flower> root = criteriaDelete.from(Flower.class);
            criteriaDelete.where(criteriaBuilder.equal(root.get("id"), flower.getId()));

            final int i = session.createQuery(criteriaDelete).executeUpdate();

            transaction.commit();

            return i;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
