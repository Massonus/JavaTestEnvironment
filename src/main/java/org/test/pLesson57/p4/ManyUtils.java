package org.test.pLesson57.p4;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.test.pLesson56.SessionCreator;

public class ManyUtils {

    public void saveStudent(final Student student) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveCourse(final CourseTest courseTest) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(courseTest);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
