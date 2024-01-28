package org.test.TestTask57.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.test.TestTask57.SessionCreator;
import org.test.TestTask57.entity.Person;

import java.util.List;

@Repository
public class PersonRepo implements UniversalRepository {

    public PersonRepo() {
    }

    public void addPerson(final Person person) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(person);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Person> getPeopleList() {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            final Query<Person> fromChild = session.createQuery("from Person", Person.class);
            return fromChild.list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Person getPersonById(int id) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            final Query<Person> personQuery = session.createQuery("from Person where person_id = :id", Person.class);
            personQuery.setParameter("id", id);
            List<Person> list = personQuery.list();
            return list.get(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Boolean updatePerson(final Person person) {
        try (final Session session = SessionCreator.getSessionFactory().openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.update(person);
            transaction.commit();
            return true;
        } catch (final Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public Boolean deletePerson(final Person person) {
        try (final Session session = SessionCreator.getSessionFactory().openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.delete(person);
            transaction.commit();
            return true;
        } catch (final Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
