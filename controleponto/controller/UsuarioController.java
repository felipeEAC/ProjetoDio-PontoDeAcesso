package com.projetoDio.controlepontoacesso.controller;

import com.projetoDio.controlepontoacesso.model.JornadaTrabalho;
import com.projetoDio.controlepontoacesso.model.Usuario;
import com.projetoDio.controlepontoacesso.service.JornadaService;
import com.projetoDio.controlepontoacesso.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioService.saveUsuario(usuario);
    }

    @GetMapping
    public List<Usuario> getUsuarioList() {
        return usuarioService.findAll();
    }

    @GetMapping("/{idUsuario}")
    public ResponseEntity<Usuario> getUsuarioByID(@PathVariable("idUsuario") Long idUsuario) throws Exception{
        return ResponseEntity.ok(usuarioService.getById(idUsuario).orElseThrow(() -> new Exception("Usuário não encontrado.")));
    }

    @PutMapping
    public Usuario updateUsuario(@RequestBody Usuario usuario) {
        return usuarioService.updateUsuario(usuario);
    }

    @DeleteMapping ("/{idUsuario}")
    public ResponseEntity<Usuario> deleteUsuarioByID(@PathVariable("idUsuario") Long idUsuario) {
        try {
            usuarioService.deleteUsuario(idUsuario);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Usuario>) ResponseEntity.ok();

    }

}
