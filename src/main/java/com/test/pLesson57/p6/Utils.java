package com.test.pLesson57.p6;


import com.test.pLesson57.p5.Pie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.test.pLesson56.SessionCreator;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;
import java.util.List;

public class Utils {

    public Pie getPie(final int id) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Pie> criteriaQuery = criteriaBuilder.createQuery(Pie.class);

            Root<Pie> root = criteriaQuery.from(Pie.class);
            criteriaQuery.select(root);
            criteriaQuery.where(criteriaBuilder.equal(root.get("id"), id));

            final Query<Pie> query = session.createQuery(criteriaQuery);
            List<Pie> resultList = query.getResultList();

            return resultList.get(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public List<Pie> getAllPie() {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Pie> criteriaQuery = criteriaBuilder.createQuery(Pie.class);

            Root<Pie> root = criteriaQuery.from(Pie.class);
            criteriaQuery.select(root);

            final Query<Pie> query = session.createQuery(criteriaQuery);
            List<Pie> resultList = query.getResultList();

            return resultList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public void updatePie(final Pie pie) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();

            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaUpdate<Pie> criteriaUpdate = criteriaBuilder.createCriteriaUpdate(Pie.class);
            Root<Pie> root = criteriaUpdate.from(Pie.class);
            criteriaUpdate.set("name", "badPie");
            criteriaUpdate.where(criteriaBuilder.equal(root.get("id"), pie.getId()));

            session.createQuery(criteriaUpdate).executeUpdate();

            tx.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
