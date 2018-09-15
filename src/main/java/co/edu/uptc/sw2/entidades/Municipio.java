package co.edu.uptc.sw2.entidades;

public class Municipio {

    private int id;
    private String nombre;
    private static int AUTO_ID = 0;

    public Municipio(String nombre) {
        this.nombre = nombre;
        this.id = AUTO_ID++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
