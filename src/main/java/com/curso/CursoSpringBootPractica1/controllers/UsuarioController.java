package com.curso.CursoSpringBootPractica1.controllers;

import com.curso.CursoSpringBootPractica1.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    // Función que devuelve "prueba"
    @RequestMapping(value = "prueba")
    public String prueba(){
        return "prueba";
    }

    // Función que devuelve un usuario
    @RequestMapping(value = "usuario")
    public Usuario getUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Virginia");
        usuario.setApellido("Marchena");
        usuario.setEmail("virginia.marchena@hotmail.com");
        usuario.setTelefono("666555444");
        usuario.setPassword("321_Barcelona_4$");
        return usuario;
    }
}
