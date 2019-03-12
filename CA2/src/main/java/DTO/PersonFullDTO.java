/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import entity.*;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class PersonFullDTO {
    
int id;
String firstName;
String lastName;
String email;
List<Phone> phoneList;
Address address;
List<Hobby> hobbyList;


public PersonFullDTO(Person p){
this.id = p.getId();
this.firstName = p.getFirstName();
this.lastName = p.getLastName();
this.email = p.getEmail();
for (Phone ph : p.getPhones()){
    phoneList.add(ph);
}
for(Hobby h : hobbyList){
    hobbyList.add(h);
}
this.address = p.getAddress();
}
    
}
