package co.edu.uptc.sw2.servicios;

import c.edu.uptc.sw2.persistencia.Almacenamiento;
import co.edu.uptc.sw2.entidades.Carrera;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("ServicioCarrera")
public class ServicioCarrera {

    @GET
    public ArrayList<Carrera> getCarrera() {
        return Almacenamiento.getInstance().getListCarreras();
    }

    @POST
    public Carrera guardarCarrera(Carrera carrera) {
        Almacenamiento.getInstance().getListCarreras().add(carrera);
        return carrera;
    }
}
