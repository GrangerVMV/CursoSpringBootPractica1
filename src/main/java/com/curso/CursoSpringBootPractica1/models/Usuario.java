package com.curso.CursoSpringBootPractica1.models;

public class Usuario {

    // Atributos de la clase Usuario
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String password;

    // Constructor de la clase Usuario
    // N/A

    // Métodos de la clase Usuario incluyendo getters y setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

}
