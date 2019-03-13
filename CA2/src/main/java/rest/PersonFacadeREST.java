/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import DTO.PersonFullDTO;
import entity.Person;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import utils.DBFacade;
import com.google.gson.Gson;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author caspe
 */
@Path("person")
public class PersonFacadeREST {

    Gson gson = new Gson();
    DBFacade dbf = new DBFacade();
    @Context
    private UriInfo context;

    

    public PersonFacadeREST() {
    }

//    @GET
//    @Path("/all")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getAllPets() {
//        List<PersonFullDTO> pList = 
//
//        return Response.ok().entity(gson.toJson()).build();
//        //return Response.ok().entity(petList.size()).build();
//    }

    @GET
    @Path("/complete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPersonFromID(@PathParam("id") int id) {

        Person p = dbf.getPersonById(id);
        //  PersonFullDTO pdto = new PersonFullDTO(p);
        return Response.ok().entity(gson.toJson(p)).build();
    }

    @GET
    @Path("/complete/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPersonFromName(@PathParam("name") String name) {

        Person p = dbf.getPersonByName(name);
        //  PersonFullDTO pdto = new PersonFullDTO(p);
        return Response.ok().entity(gson.toJson(p)).build();
    }



}
