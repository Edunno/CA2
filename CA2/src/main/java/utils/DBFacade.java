/* Esben Dalgaard; DECK-CS */
package utils;

import entity.Hobby;
import entity.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * @author Esben All rights belong to respective contributors.
 */
public class DBFacade {

    private EntityManagerFactory emf;

    public static void main(String[] args) {
        EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("CA2DB");
        EntityManager em1 = emf1.createEntityManager();

        try {
            em1.getTransaction().begin();
            Person pm = new Person("Lars");
            pm.addHobby(new Hobby("Skiing"));
            pm.addHobby(new Hobby("Swinger clubbing"));
            em1.persist(pm);
            em1.getTransaction().commit();

        } finally {
            em1.close();
        }

    }

    public void addEntityManager(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public Person addPerson(Person p) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            return p;
        } finally {
            em.close();
        }
    }

    public Person getPersonByNameTest(String name) {
        EntityManager em = emf.createEntityManager();
        try {
            Query q = em.createQuery("select c from Person c where c.firstName = :name").setParameter("name", name);
            return (Person) q.getSingleResult();
        } finally {
            em.close();
        }
    }

    public Person getPersonById(int id) {
        EntityManager em = emf.createEntityManager();
        try{
            Person p = em.find(Person.class, (Integer)id);
            return p;
        }finally{
            em.close();
        }
    }

    public Person deletePersonById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
