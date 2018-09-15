package co.edu.uptc.sw2.servicios;

import c.edu.uptc.sw2.persistencia.Almacenamiento;
import co.edu.uptc.sw2.entidades.Municipio;
import java.util.ArrayList;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("ServicioMunicipio")
public class ServicioMunicipio {

    @GET
    public ArrayList<Municipio> getMunicipio() {
        return Almacenamiento.getInstance().getListMunicipios();
    }

    @POST
    public Municipio guardarMunicipio(Municipio municipio) {
        municipio.setId(Almacenamiento.getInstance().getListEstudiantes().size() + 1);
        Almacenamiento.getInstance().getListMunicipios().add(municipio);
        return municipio;
    }

    @DELETE
    @Path("/{id}")
    public void deleteMunicipio(@PathParam("id") int id) {
        Almacenamiento.getInstance().getListMunicipios().remove(id - 1);
    }
}
