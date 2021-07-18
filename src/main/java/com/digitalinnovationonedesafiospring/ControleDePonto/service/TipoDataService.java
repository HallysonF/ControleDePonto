package com.digitalinnovationonedesafiospring.ControleDePonto.service;
import com.digitalinnovationonedesafiospring.ControleDePonto.model.TipoData;
import com.digitalinnovationonedesafiospring.ControleDePonto.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {
    @Autowired
    TipoDataRepository tipoDataRepository;
    //TODO SALVAR
    public TipoData saveTipoData(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }
    //TODO LISTAR
    public List<TipoData> findAll() {
        return tipoDataRepository.findAll();
    }

    //TODO LISTAR POR ID
    public Optional<TipoData> getById(Long id) {
        return tipoDataRepository.findById(id);
    }
    //TODO ATUALIZAR
    public TipoData updateTipoData(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }
    //TODO DELETAR
    public void deleteTipoData(Long id) {
        tipoDataRepository.deleteById(id);
    }
}
