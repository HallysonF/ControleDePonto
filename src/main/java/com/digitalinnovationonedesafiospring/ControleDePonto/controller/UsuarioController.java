package com.digitalinnovationonedesafiospring.ControleDePonto.controller;

import com.digitalinnovationonedesafiospring.ControleDePonto.model.Usuario;
import com.digitalinnovationonedesafiospring.ControleDePonto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
    //TODO POST WORKDAY
    @PostMapping
    public Usuario createUserUsuario(@RequestBody Usuario usuario){
        return usuarioService.saveUsuario(usuario);

    }
    //TODO GET WORKDAY
    @GetMapping
    public List<Usuario> getUsuarioList(){
        return usuarioService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuarioByID(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(usuarioService.getById(id).orElseThrow(() -> new NoSuchElementException("Not found")));
    }
    //TODO DELETE WORKDAY
    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario>  deleteUsuarioByID(@PathVariable("id") Long id) throws Exception {
        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
            HttpStatus.EXPECTATION_FAILED.toString();       }
        usuarioService.deleteUsuario(id);
        return (ResponseEntity<Usuario>) ResponseEntity.ok();
    }
    //TODO PUT WORKDAY
    @PutMapping
    public Usuario updateUserCategory(@RequestBody Usuario usuario){
        return usuarioService.updateUsuario(usuario);

    }
}
