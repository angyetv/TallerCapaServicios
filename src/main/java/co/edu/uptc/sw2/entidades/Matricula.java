package co.edu.uptc.sw2.entidades;

import java.util.ArrayList;

public class Matricula {

    private int id;
    private int annio;
    private int semestre;
    private ArrayList<Materia> materias;
    private Estudiante estudiante;

    public Matricula() {
    }

    public Matricula(int id, int annio, int semestre, ArrayList<Materia> materias, Estudiante estudiante) {
        this.id = id;
        this.annio = annio;
        this.semestre = semestre;
        this.materias = materias;
        this.estudiante = estudiante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
