package com.digitalinnovationonedesafiospring.ControleDePonto.service;
import com.digitalinnovationonedesafiospring.ControleDePonto.model.Usuario;
import com.digitalinnovationonedesafiospring.ControleDePonto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    //TODO SALVAR
    public Usuario saveUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    //TODO LISTAR
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    //TODO LISTAR POR ID
    public Optional<Usuario> getById(Long id) {
        return usuarioRepository.findById(id);
    }
    //TODO ATUALIZAR
    public Usuario updateUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    //TODO DELETAR
    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
