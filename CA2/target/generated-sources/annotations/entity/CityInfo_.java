package entity;

import entity.Address;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-13T13:15:04")
@StaticMetamodel(CityInfo.class)
public class CityInfo_ { 

    public static volatile SingularAttribute<CityInfo, Integer> zipCode;
    public static volatile SingularAttribute<CityInfo, String> city;
    public static volatile SetAttribute<CityInfo, Address> adresses;
    public static volatile SingularAttribute<CityInfo, Integer> id;

}