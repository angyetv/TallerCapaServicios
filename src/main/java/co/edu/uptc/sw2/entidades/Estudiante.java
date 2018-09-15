package co.edu.uptc.sw2.entidades;

import java.util.Date;

public class Estudiante {

    private String nombre;
    private String apellidos;
    private String codigo;
    private String documento;
    private Date fechaNacimiento;
    private String carrera;
    private String municipio;

    public Estudiante(String nombre, String apellidos, String codigo, String documento, Date fechaNacimiento, String carrera, String municipio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
        this.carrera = carrera;
        this.municipio = municipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
