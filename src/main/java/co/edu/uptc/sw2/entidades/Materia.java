package co.edu.uptc.sw2.entidades;

import java.util.ArrayList;

public class Materia {

    private String nombre;
    private int creditos;
    private Profesor profesor;
    private ArrayList<Horario> horario;

    public Materia(String nombre, int creditos, Profesor profesor, ArrayList<Horario> horario) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Horario> getHorario() {
        return horario;
    }

    public void setHorario(ArrayList<Horario> horario) {
        this.horario = horario;
    }
}
