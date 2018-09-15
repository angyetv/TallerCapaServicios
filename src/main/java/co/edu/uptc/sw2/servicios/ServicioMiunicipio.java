package co.edu.uptc.sw2.servicios;

import c.edu.uptc.sw2.persistencia.Almacenamiento;
import co.edu.uptc.sw2.entidades.Municipio;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("ServicioMunicipio")
public class ServicioMiunicipio {

    @GET
    public ArrayList<Municipio> getMunicipio() {
        return Almacenamiento.getInstance().getListMunicipios();
    }

    @POST
    public Municipio guardarMunicipio(Municipio municipio) {
        Almacenamiento.getInstance().getListMunicipios().add(municipio);
        return municipio;
    }
}
