package entity;

import entity.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-13T13:15:04")
@StaticMetamodel(Hobby.class)
public class Hobby_ { 

    public static volatile SetAttribute<Hobby, Person> persons;
    public static volatile SingularAttribute<Hobby, String> name;
    public static volatile SingularAttribute<Hobby, String> description;
    public static volatile SingularAttribute<Hobby, Integer> id;

}