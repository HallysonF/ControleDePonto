package com.digitalinnovationonedesafiospring.ControleDePonto.service;
import com.digitalinnovationonedesafiospring.ControleDePonto.model.BancoHoras;
import com.digitalinnovationonedesafiospring.ControleDePonto.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {
    @Autowired
    BancoHorasRepository bancoHorasRepository;
    //TODO SALVAR
    public BancoHoras saveBancoHoras(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }
    //TODO LISTAR
    public List<BancoHoras> findAll() {
        return bancoHorasRepository.findAll();
    }

    //TODO LISTAR POR ID
    public Optional<BancoHoras> getById(Long id) {
        return bancoHorasRepository.findById(id);
    }
    //TODO ATUALIZAR
    public BancoHoras updateBancoHoras(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }
    //TODO DELETAR
    public void deleteBancoHoras(Long id) {
        bancoHorasRepository.deleteById(id);
    }
}
