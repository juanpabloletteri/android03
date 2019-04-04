package com.example.alumno.android03;

/**
 * Created by alumno on 04/04/2019.
 */

public class Persona {

    private String Apellido;
    private String nombre;
    private String telefono;

    public Persona() {
    }

    public Persona(String apellido, String nombre, String telefono) {
        Apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Apellido='" + Apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
