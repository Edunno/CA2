package entity;

import entity.Address;
import entity.Hobby;
import entity.Phone;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-13T13:15:04")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile SingularAttribute<Person, String> firstName;
    public static volatile SingularAttribute<Person, String> lastName;
    public static volatile SingularAttribute<Person, Address> address;
    public static volatile SetAttribute<Person, Hobby> hobbies;
    public static volatile SetAttribute<Person, Phone> phones;
    public static volatile SingularAttribute<Person, Integer> id;
    public static volatile SingularAttribute<Person, String> email;

}