package co.edu.uptc.sw2.servicios;

import c.edu.uptc.sw2.persistencia.Almacenamiento;
import co.edu.uptc.sw2.entidades.Facultad;
import co.edu.uptc.sw2.entidades.Materia;
import java.util.ArrayList;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("ServicioMateria")
public class ServicioMateria {

    public ServicioMateria() {
        
    }

    @GET
    public ArrayList<Materia> getMaterias() {
        return Almacenamiento.getInstance().getListMaterias();
    }

   @POST
    public Materia guardarFacultad(Materia materia) {
        for (int i = 0; i < Almacenamiento.getInstance().getListMaterias().size(); i++) {
            if (Almacenamiento.getInstance().getListMaterias().get(i).getId() == (materia.getId())) {
                Almacenamiento.getInstance().getListMaterias().get(i).setNombre(materia.getNombre());
                return materia;
            }
        }
        materia.setId(Almacenamiento.getInstance().getListMaterias().size() + 1);
        Almacenamiento.getInstance().getListMaterias().add(materia);
        return materia;
    }
    
    @DELETE
    @Path("/{name}")
    public void deleteFacultad(@PathParam("name") String name) {
        for (int i = 0; i < Almacenamiento.getInstance().getListMaterias().size(); i++) {
            if (Almacenamiento.getInstance().getListMaterias().get(i).getNombre().equals(name)) {
                Almacenamiento.getInstance().getListMaterias().remove(i);
            }
        }
    }
}
