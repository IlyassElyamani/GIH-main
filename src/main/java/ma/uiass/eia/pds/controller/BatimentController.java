package ma.uiass.eia.pds.controller;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import ma.uiass.eia.pds.metier.DepartementService;
import ma.uiass.eia.pds.metier.DepartementServiceImpl;
import ma.uiass.eia.pds.model.batiment.Batiment;

@Path("/Batiment")
public class BatimentController {


     DepartementService departementService=new DepartementServiceImpl();
     @POST
     @Path("{nomBatiment}")
     public Response addBatiment(
          @PathParam(value="nomBatiment") String nomBatiment){
               departementService.addBatiment(nomBatiment);
               return  Response.ok().build();
          }

     }

