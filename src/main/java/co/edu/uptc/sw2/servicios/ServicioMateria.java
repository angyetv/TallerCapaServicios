package co.edu.uptc.sw2.servicios;

import c.edu.uptc.sw2.persistencia.Almacenamiento;
import co.edu.uptc.sw2.entidades.Materia;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("ServicioMateria")
public class ServicioMateria {

    @GET
    public ArrayList<Materia> getMaterias() {
        return Almacenamiento.getInstance().getListMaterias();
    }

    @POST
    public Materia guardarMaterias(Materia materia) {
        Almacenamiento.getInstance().getListMaterias().add(materia);
        return materia;
    }
}
