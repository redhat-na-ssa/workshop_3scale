package rh.workshop;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/location")
public class LocationResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Location> findByType(@QueryParam("type") String type) {

        if(type == null){
            return Location.listAll();
        }else{
            return Location.findByType(type);
        }

    }

}