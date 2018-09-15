package co.edu.uptc.sw2.servicios;

import c.edu.uptc.sw2.persistencia.Almacenamiento;
import co.edu.uptc.sw2.entidades.Facultad;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("ServicioFacultad")
public class ServicioFacultad {

    @GET
    public ArrayList<Facultad> getFacultad() {
        return Almacenamiento.getInstance().getListFacultads();
    }

    @POST
    public Facultad guardarFacultad(Facultad facultad) {
        Almacenamiento.getInstance().getListFacultads().add(facultad);
        return facultad;
    }
}
