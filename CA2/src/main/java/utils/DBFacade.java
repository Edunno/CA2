/* Esben Dalgaard; DECK-CS */

package utils;

import entity.Hobby;
import entity.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Esben
 * All rights belong to respective contributors.
 */
public class DBFacade {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CA2DB");
        EntityManager em = emf.createEntityManager();
        
        try{    
            em.getTransaction().begin();
            Person pm = new Person("Lars");
            pm.addHobby(new Hobby("Skiing"));
            pm.addHobby(new Hobby("Swinger clubbing"));
            em.persist(pm);
            em.getTransaction().commit();
            
        }
        finally{
            em.close();
        }
        
    }
}
