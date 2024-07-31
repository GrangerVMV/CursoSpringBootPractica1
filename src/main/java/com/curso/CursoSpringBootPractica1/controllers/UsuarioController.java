package com.curso.CursoSpringBootPractica1.controllers;

import com.curso.CursoSpringBootPractica1.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    // Método que devuelve "prueba"
    @RequestMapping(value = "prueba")
    public String prueba(){
        return "prueba";
    }

    // Método que devuelve un usuario
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

    // Método que devuelve un usuario concreto por su id
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuarioPorId(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Virginia");
        usuario.setApellido("Marchena");
        usuario.setEmail("virginia.marchena@hotmail.com");
        usuario.setTelefono("666555444");
        usuario.setPassword("321_Barcelona_4$");
        return usuario;
    }

    // Método que devuelve un listado de usuarios
    @RequestMapping(value = "usuarios")
    public List<Usuario> getListadoUsuarios(){

        List<Usuario> usuarios = new ArrayList<>();

        // Definimos usuario 1
        Usuario usuario1 = new Usuario();
        usuario1.setId(123L);
        usuario1.setNombre("Virginia");
        usuario1.setApellido("Marchena");
        usuario1.setEmail("virginia.marchena@hotmail.com");
        usuario1.setTelefono("666555444");
        usuario1.setPassword("321_Barcelona_4$");

        // Definimos usuario 2
        Usuario usuario2 = new Usuario();
        usuario2.setId(456L);
        usuario2.setNombre("Francisco Javier");
        usuario2.setApellido("Ruiz");
        usuario2.setEmail("f.ruiz@hotmail.com");
        usuario2.setTelefono("666333222");
        usuario2.setPassword("321_Sevilla_4$");

        // Definimos usuario 3
        Usuario usuario3 = new Usuario();
        usuario3.setId(789L);
        usuario3.setNombre("Carolina");
        usuario3.setApellido("Marchena");
        usuario3.setEmail("carolina.marvid@hotmail.com");
        usuario3.setTelefono("666111888");
        usuario3.setPassword("321_Madrid_4$");

        //Añadimos usuarios a la lista
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        //Devolvemos el listado
        return usuarios;
    }


    // Método que permite editar un usuario
    @RequestMapping(value = "usuario123")
    public Usuario editarUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Virginia");
        usuario.setApellido("Marchena");
        usuario.setEmail("virginia.marchena@hotmail.com");
        usuario.setTelefono("666555444");
        usuario.setPassword("321_Barcelona_4$");
        return usuario;
    }

    // Método que permite eliminar un usuario
    @RequestMapping(value = "usuario456")
    public Usuario eliminarUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Virginia");
        usuario.setApellido("Marchena");
        usuario.setEmail("virginia.marchena@hotmail.com");
        usuario.setTelefono("654555444");
        usuario.setPassword("321_Barcelona_4$");
        return usuario;
    }

    // Método que permite buscar un usuario
    @RequestMapping(value = "usuario789")
    public Usuario buscarUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Virginia");
        usuario.setApellido("Marchena");
        usuario.setEmail("virginia.marchena@hotmail.com");
        usuario.setTelefono("647555444");
        usuario.setPassword("321_Barcelona_4$");
        return usuario;
    }
}
