package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method. It is automatically
     * populated with all resources defined in the project. If required, comment
     * out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(co.edu.uptc.sw2.servicios.ServicioCarrera.class);
        resources.add(co.edu.uptc.sw2.servicios.ServicioEstudiante.class);
        resources.add(co.edu.uptc.sw2.servicios.ServicioFacultad.class);
        resources.add(co.edu.uptc.sw2.servicios.ServicioHorario.class);
        resources.add(co.edu.uptc.sw2.servicios.ServicioMateria.class);
        resources.add(co.edu.uptc.sw2.servicios.ServicioMatricula.class);
        resources.add(co.edu.uptc.sw2.servicios.ServicioMunicipio.class);
        resources.add(co.edu.uptc.sw2.servicios.ServicioProfesor.class);
    }
}
