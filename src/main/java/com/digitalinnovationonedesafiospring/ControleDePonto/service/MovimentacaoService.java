package com.digitalinnovationonedesafiospring.ControleDePonto.service;
import com.digitalinnovationonedesafiospring.ControleDePonto.model.Movimentacao;
import com.digitalinnovationonedesafiospring.ControleDePonto.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {
    @Autowired
    MovimentacaoRepository movimentacaoRepository;
    //TODO SALVAR
    public Movimentacao saveMovimentacao(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }
    //TODO LISTAR
    public List<Movimentacao> findAll() {
        return movimentacaoRepository.findAll();
    }

    //TODO LISTAR POR ID
    public Optional<Movimentacao> getById(Long id) {
        return movimentacaoRepository.findById(id);
    }
    //TODO ATUALIZAR
    public Movimentacao updateMovimentacao(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }
    //TODO DELETAR
    public void deleteMovimentacao(Long id) {
        movimentacaoRepository.deleteById(id);
    }
}
