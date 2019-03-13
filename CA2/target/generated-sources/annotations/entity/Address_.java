package entity;

import entity.CityInfo;
import entity.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-13T13:15:04")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SetAttribute<Address, Person> persons;
    public static volatile SingularAttribute<Address, CityInfo> city;
    public static volatile SingularAttribute<Address, String> street;
    public static volatile SingularAttribute<Address, String> additionalInfo;
    public static volatile SingularAttribute<Address, Integer> id;

}