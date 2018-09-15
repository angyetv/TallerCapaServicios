package co.edu.uptc.sw2.servicios;

import c.edu.uptc.sw2.persistencia.Almacenamiento;
import co.edu.uptc.sw2.entidades.Matricula;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("ServicioMatricula")
public class ServicioMatricula {

    @GET
    public ArrayList<Matricula> getMatricula() {
        return Almacenamiento.getInstance().getListMatriculas();
    }

    @POST
    public Matricula guardarMatricula(Matricula matricula) {
        Almacenamiento.getInstance().getListMatriculas().add(matricula);
        return matricula;
    }
}
