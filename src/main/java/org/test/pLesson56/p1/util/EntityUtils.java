package org.test.pLesson56.p1.util;


import org.test.pLesson56.p1.entity.Device;
import org.test.pLesson56.p1.entity.Factory;

import javax.persistence.*;
import java.time.LocalDate;

public class EntityUtils {

    public void saveDevice() {
        EntityManager em = getEntityManager();

        Factory factory2 = new Factory("Telephone", "China");

        Device device = new Device("Telephone1", "redmi1", 300.0d, LocalDate.now(), "telephone1", true, factory2);

        final EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.persist(factory2);
        transaction.commit();

        transaction.begin();

        em.persist(device);
        transaction.commit();
        em.close();
    }

    public Device getDevice(final int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        final Device device1 = em.find(Device.class, new Integer(id));
        em.close();
        return device1;
    }

    public void mergeDevice(final double price, Device device) {
        EntityManager em = getEntityManager();
        device.setPrice(price);
        em.getTransaction().begin();
        em.merge(device);
        em.getTransaction().commit();
        em.close();
    }

    public void remove(final int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Device device = em.find(Device.class, new Integer(id));
        em.remove(device);
        em.getTransaction().commit();
        em.close();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("org.test.pLesson56.p1.entity");
        EntityManager em = emf.createEntityManager();
        return em;
    }

}
