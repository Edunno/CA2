/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit;

import entity.Person;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.validation.constraints.AssertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import utils.DBFacade;

/**
 *
 * @author Esben
 */
public class DBFacadeTest {
    
    public DBFacadeTest() {
    }
    
    @BeforeClass
    public void setupClass(){
        DBFacade db = setEMF();
        Person p = new Person("ms@stevia.com");
        p.setLastName("Sommer");
        p.setFirstName("Michael");
        db.addPerson(p);
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void addEntityManager(){
        DBFacade db = new DBFacade();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CA2DB");
        try{
        db.addEntityManager(emf);
        } catch(Exception e){
            assertTrue(false);
        }
        assertTrue(true);
    }
    @Test
    public void addPersonTest(){
        DBFacade db = setEMF();
        Person xtra = new Person("gustaff@gmail.com");
        xtra.setFirstName("Gustaff");
        xtra.setLastName("Graff");
        db.addPerson(xtra);
        Person p = new Person("John@hotmail.com");
        p.setFirstName("John");
        p.setLastName("Johnson");
        Person tp = db.addPerson(p);
        assertEquals(p.getFirstName(),tp.getFirstName());
    }
    @Test
    public void getPersonByNameTest(){
        DBFacade db = setEMF();
        String name = "John";
        Person tp = db.getPersonByName(name);
        assertEquals(name,tp.getFirstName());
    }
    @Test
    public void getPersonById(){
        DBFacade db = setEMF();
        int id = 1;
        Person tp = db.getPersonById(id);
        assertEquals(tp.getFirstName(),"John");
    }
    
    @Test
    public void deletePersonById(){
        DBFacade db = setEMF();
        int id = 1;
        Person tp = db.deletePersonById(id);
        assertEquals(tp.getFirstName(),"John");
    }

    private DBFacade setEMF(){
        DBFacade db = new DBFacade();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CA2DB");
        db.addEntityManager(emf);
        return db;
    }
    
}
