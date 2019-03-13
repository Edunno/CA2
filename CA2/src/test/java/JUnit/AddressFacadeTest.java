/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit;

import entity.Address;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.AddressFacade;

/**
 *
 * @author Esben
 */
public class AddressFacadeTest {

    public AddressFacadeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void addAdressTest(){
        AddressFacade db = setEMF();
        Address tA = new Address();
        tA.setStreet("BowlerStreet 8");
        tA.setAdditionalInfo("Beyond the scope of mere mortals!");
        db.a
        assertTrue(true);
    }

    @Test
    public void getPersonsByAddressTest() {
        assertTrue(true);
    }

    @Test
    public void getAddressByStreetTest() {
        assertTrue(true);
    }

    @Test
    public void getAdressByIdTest() {
        assertTrue(true);
    }
    
    @Test
    public void deleteAddressByIdTest(){
        assertTrue(true);
    }

    private DBFacade setEMF() {
        DBFacade db = new DBFacade();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CA2DB");
        db.addEntityManager(emf);
        return db;
    }

}
