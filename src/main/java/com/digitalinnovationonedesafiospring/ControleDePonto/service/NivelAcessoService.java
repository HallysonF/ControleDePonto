package com.digitalinnovationonedesafiospring.ControleDePonto.service;
import com.digitalinnovationonedesafiospring.ControleDePonto.model.NivelAcesso;
import com.digitalinnovationonedesafiospring.ControleDePonto.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {
    @Autowired
    NivelAcessoRepository nivelAcessoRepository;
    //TODO SALVAR
    public NivelAcesso saveNivelAcesso(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }
    //TODO LISTAR
    public List<NivelAcesso> findAll() {
        return nivelAcessoRepository.findAll();
    }

    //TODO LISTAR POR ID
    public Optional<NivelAcesso> getById(Long id) {
        return nivelAcessoRepository.findById(id);
    }
    //TODO ATUALIZAR
    public NivelAcesso updateNivelAcesso(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }
    //TODO DELETAR
    public void deleteNivelAcesso(Long id) {
        nivelAcessoRepository.deleteById(id);
    }
}
