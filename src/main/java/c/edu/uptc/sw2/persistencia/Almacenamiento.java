package c.edu.uptc.sw2.persistencia;

import co.edu.uptc.sw2.entidades.Carrera;
import co.edu.uptc.sw2.entidades.Estudiante;
import co.edu.uptc.sw2.entidades.Facultad;
import co.edu.uptc.sw2.entidades.Horario;
import co.edu.uptc.sw2.entidades.Materia;
import co.edu.uptc.sw2.entidades.Matricula;
import co.edu.uptc.sw2.entidades.Municipio;
import co.edu.uptc.sw2.entidades.Profesor;
import java.util.ArrayList;

public class Almacenamiento {

    private static final Almacenamiento INSTANCE = new Almacenamiento();
    private ArrayList<Estudiante> listEstudiantes;
    private ArrayList<Carrera> listCarreras;
    private ArrayList<Facultad> listFacultads;
    private ArrayList<Materia> listMaterias;
    private ArrayList<Matricula> listMatriculas;
    private ArrayList<Municipio> listMunicipios;
    private ArrayList<Profesor> listProfesors;
    private ArrayList<Horario> listHorarios;

    public static Almacenamiento getInstance() {
        return INSTANCE;
    }

    public Almacenamiento() {
        this.listEstudiantes = new ArrayList<>();
        this.listCarreras = new ArrayList<>();
        this.listFacultads = new ArrayList<>();
        this.listMaterias = new ArrayList<>();
        this.listMatriculas = new ArrayList<>();
        this.listMunicipios = new ArrayList<>();
        this.listProfesors = new ArrayList<>();
        this.listHorarios = new ArrayList<>();

        this.listMunicipios.add(new Municipio("Tunja"));
        this.listMunicipios.add(new Municipio("Duitama"));
        this.listMunicipios.add(new Municipio("Umbita"));

//        listFacultads.add(new Facultad("Ingenieria"));
//        listCarreras.add(new Carrera("Ingenieria de Sistemas", listFacultads.get(0)));
//        listEstudiantes.add(new Estudiante("daniela", "torrres", "Veloza", "we", null, null, null));
    }

    public ArrayList<Estudiante> getListEstudiantes() {
        return listEstudiantes;
    }

    public void setListEstudiantes(ArrayList<Estudiante> listEstudiantes) {
        this.listEstudiantes = listEstudiantes;
    }

    public ArrayList<Carrera> getListCarreras() {
        return listCarreras;
    }

    public void setListCarreras(ArrayList<Carrera> listCarreras) {
        this.listCarreras = listCarreras;
    }

    public ArrayList<Facultad> getListFacultads() {
        return listFacultads;
    }

    public void setListFacultads(ArrayList<Facultad> listFacultads) {
        this.listFacultads = listFacultads;
    }

    public ArrayList<Materia> getListMaterias() {
        return listMaterias;
    }

    public void setListMaterias(ArrayList<Materia> listMaterias) {
        this.listMaterias = listMaterias;
    }

    public ArrayList<Matricula> getListMatriculas() {
        return listMatriculas;
    }

    public void setListMatriculas(ArrayList<Matricula> listMatriculas) {
        this.listMatriculas = listMatriculas;
    }

    public ArrayList<Municipio> getListMunicipios() {
        return listMunicipios;
    }

    public void setListMunicipios(ArrayList<Municipio> listMunicipios) {
        this.listMunicipios = listMunicipios;
    }

    public ArrayList<Profesor> getListProfesors() {
        return listProfesors;
    }

    public void setListProfesors(ArrayList<Profesor> listProfesors) {
        this.listProfesors = listProfesors;
    }

    public ArrayList<Horario> getListHorarios() {
        return listHorarios;
    }

    public void setListHorarios(ArrayList<Horario> listHorarios) {
        this.listHorarios = listHorarios;
    }

}
