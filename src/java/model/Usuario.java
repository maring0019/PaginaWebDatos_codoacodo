package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String curso;
    private String comision;
    private String descripcion;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String curso, String comision, String descripcion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.comision = comision;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getComision() {
        return comision;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", curso=" + curso + ", comision=" + comision + ", descripcion=" + descripcion + '}';
    }

    
    
    
}
