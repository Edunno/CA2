/* Esben Dalgaard; DECK-CS */
package utils;

import javax.persistence.EntityManagerFactory;

/**
 * @author Esben All rights belong to respective contributors.
 */
public class AdressFacade {

    private EntityManagerFactory emf;

    public void addEntityManager(EntityManagerFactory emf) {
        this.emf = emf;
    }

}
