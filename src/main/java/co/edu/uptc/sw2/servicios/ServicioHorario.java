package co.edu.uptc.sw2.servicios;

import c.edu.uptc.sw2.persistencia.Almacenamiento;
import co.edu.uptc.sw2.entidades.Horario;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("ServicioHorario")
public class ServicioHorario {

    @GET
    public ArrayList<Horario> getHorario() {
        return Almacenamiento.getInstance().getListHorarios();
    }

    @POST
    public Horario guardarHorario(Horario horario) {
        Almacenamiento.getInstance().getListHorarios().add(horario);
        return horario;
    }
}
