package com.digitalinnovationonedesafiospring.ControleDePonto.service;
import com.digitalinnovationonedesafiospring.ControleDePonto.model.Calendario;
import com.digitalinnovationonedesafiospring.ControleDePonto.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarioService {
    @Autowired
    CalendarioRepository calendarioRepository;
    //TODO SALVAR
    public Calendario saveCalendario(Calendario calendario){
        return calendarioRepository.save(calendario);
    }
    //TODO LISTAR
    public List<Calendario> findAll() {
        return calendarioRepository.findAll();
    }

    //TODO LISTAR POR ID
    public Optional<Calendario> getById(Long id) {
        return calendarioRepository.findById(id);
    }
    //TODO ATUALIZAR
    public Calendario updateCalendario(Calendario calendario){
        return calendarioRepository.save(calendario);
    }
    //TODO DELETAR
    public void deleteCalendario(Long id) {
        calendarioRepository.deleteById(id);
    }
}
