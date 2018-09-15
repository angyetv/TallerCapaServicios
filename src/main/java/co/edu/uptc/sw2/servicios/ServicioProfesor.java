package co.edu.uptc.sw2.servicios;

import c.edu.uptc.sw2.persistencia.Almacenamiento;
import co.edu.uptc.sw2.entidades.Profesor;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("ServicioProfesor")
public class ServicioProfesor {

    @GET
    public ArrayList<Profesor> getProfesor() {
        return Almacenamiento.getInstance().getListProfesors();
    }

    @POST
    public Profesor guardarProfesor(Profesor profesor) {
        Almacenamiento.getInstance().getListProfesors().add(profesor);
        return profesor;
    }
}
