package co.edu.uptc.sw2.servicios;

import c.edu.uptc.sw2.persistencia.Almacenamiento;
import co.edu.uptc.sw2.entidades.Estudiante;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("ServicioEstudiante")
public class ServicioEstudiante {

    @GET
    public ArrayList<Estudiante> consultarEstudiante() {
        return Almacenamiento.getInstance().getListEstudiantes();
    }

    @POST
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        Almacenamiento.getInstance().getListEstudiantes().add(estudiante);
        return estudiante;
    }
}
