package com.digitalinnovationonedesafiospring.ControleDePonto.service;

import com.digitalinnovationonedesafiospring.ControleDePonto.model.Workday;
import com.digitalinnovationonedesafiospring.ControleDePonto.repository.WorkdayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkdayService {
    @Autowired
    WorkdayRepository workdayRepository;
    //TODO SALVAR
    public Workday saveWorkday(Workday workday){
        return workdayRepository.save(workday);
    }
    //TODO LISTAR
    public List<Workday> findAll() {
        return workdayRepository.findAll();
    }

    //TODO LISTAR POR ID
    public Optional<Workday> getById(Long idWorkday) {
        return workdayRepository.findById(idWorkday);
    }
    //TODO ATUALIZAR
    public Workday updateWorkday(Workday workday){
        return workdayRepository.save(workday);
    }
    //TODO DELETAR
    public void deleteWorkday(Long idWorkday) {
        workdayRepository.deleteById(idWorkday);
    }
}
