/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit;

import entity.Hobby;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import utils.HobbyFacade;

/**
 *
 * @author KimPPedersen
 */
public class HobbyFacadeTest {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("CA2DB");

    /**
     * Setup test data in the database to a known state BEFORE Each test
     */
    @BeforeClass
    public static void setUp() {
        HobbyFacadeTest t1 = new HobbyFacadeTest();
        HobbyFacade hf = t1.setEMF();
        Hobby h1 = new Hobby("Masturbation");
        Hobby h2 = new Hobby("Happy slapping");
        Hobby h3 = new Hobby("Teabagging");
        hf.addHobby(h1);
        hf.addHobby(h2);
        hf.addHobby(h3);
    }

    public HobbyFacadeTest() {
    }

    @Test
    public void addHobbyTest() {
        HobbyFacade hf = setEMF();
        System.out.println("addHobby");
        Hobby h = new Hobby("Fast fisting");
        Hobby expResult = hf.addHobby(h);
        Hobby result = h;
        assertEquals(expResult, result);
        assertTrue(true);
    }

    @Test
    public void getPersonsByHobbyTest() {
        HobbyFacade hf = setEMF();
        assertTrue(true);
    }

        @Test
    public void testGetAllHobbys() {
        System.out.println("getAllHobbys");
        HobbyFacade hf = new HobbyFacade();
        int expResult = 3;
        List<Hobby> result = hf.getAllHobbys();
        assertEquals(expResult, result.size());
    }

    @Test
    public void editHobbyTest() {
        System.out.println("editHobbyById");
        HobbyFacade hf = setEMF();
        int id = 2;
        Hobby h = hf.getHobbyById(id);
        String expResult = "Dick Slapping";
        h.setName(expResult);
        System.out.println(h.getName());
        Hobby result = hf.editHobby(h);
        assertEquals(expResult, result.getName());
    }

    
    /**
     * Test of getPerson method, of class PersonFacade.
     */
    @Test
    public void getHobbyByIdTest() {
        HobbyFacade hf = setEMF();
        System.out.println("getHobbyById");
        int id = 3;
        String expResult = "Teabagging";
        Hobby result = hf.getHobbyById(id);
        assertEquals(expResult, result.getName());
    }

    @Test
    public void deleteHobbyByIdTest() {
        System.out.println("deleteHobbyById");
        HobbyFacade hf = setEMF();
        Hobby h = new Hobby("Fast fisting 2");
        hf.addHobby(h);
        int id = 4;
        Hobby expResult = hf.getHobbyById(id);
        Hobby result = hf.deleteHobbyById(id);
        assertEquals(expResult, result);

    }

    private HobbyFacade setEMF() {
        HobbyFacade hf = new HobbyFacade();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CA2DB");
        hf.addEntityManager(emf);
        return hf;
    }


}
