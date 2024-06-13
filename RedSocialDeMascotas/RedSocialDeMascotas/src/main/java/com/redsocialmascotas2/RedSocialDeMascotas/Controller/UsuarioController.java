package com.redsocialmascotas2.RedSocialDeMascotas.Controller;

import com.redsocialmascotas2.RedSocialDeMascotas.Repository.UsuarioRepository;
import com.redsocialmascotas2.RedSocialDeMascotas.Services.UsuarioService;
import com.redsocialmascotas2.RedSocialDeMascotas.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")


public class UsuarioController {


    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/TDU")
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioService.obtenerTodosLosUsuarios();

    }

    @PostMapping
    public void guardarUsuario(@RequestBody Usuario usuario) {
        usuarioService.guardarUsuario(usuario);

    }

    @GetMapping("/{id}")
    public Usuario obtenerUsuarioPorId(@PathVariable long id) {
        return usuarioService.obtenerUsuarioPorId(id);

    }

    @DeleteMapping("/{id}/delete")
    public void eliminarUsuario(@PathVariable long id) {
        usuarioService.eliminarUsuario(id);
    }

}



