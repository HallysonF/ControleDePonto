package com.digitalinnovationonedesafiospring.ControleDePonto.service;

import com.digitalinnovationonedesafiospring.ControleDePonto.model.Ocorrencia;
import com.digitalinnovationonedesafiospring.ControleDePonto.model.Workday;
import com.digitalinnovationonedesafiospring.ControleDePonto.repository.OcorrenciaRepository;
import com.digitalinnovationonedesafiospring.ControleDePonto.repository.WorkdayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {
    @Autowired
    OcorrenciaRepository ocorrenciaRepository;
    //TODO SALVAR
    public Ocorrencia saveOcorrencia(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }
    //TODO LISTAR
    public List<Ocorrencia> findAll() {
        return ocorrenciaRepository.findAll();
    }

    //TODO LISTAR POR ID
    public Optional<Ocorrencia> getById(Long id) {
        return ocorrenciaRepository.findById(id);
    }
    //TODO ATUALIZAR
    public Ocorrencia updateOcorrencia(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }
    //TODO DELETAR
    public void deleteOcorrencia(Long id) {
        ocorrenciaRepository.deleteById(id);
    }
}
