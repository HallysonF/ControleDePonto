package com.digitalinnovationonedesafiospring.ControleDePonto.controller;

import com.digitalinnovationonedesafiospring.ControleDePonto.model.Ocorrencia;
import com.digitalinnovationonedesafiospring.ControleDePonto.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {
    @Autowired
    OcorrenciaService ocorrenciaService;
    //TODO POST WORKDAY
    @PostMapping
    public Ocorrencia createOcorrencia(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.saveOcorrencia(ocorrencia);

    }
    //TODO GET WORKDAY
    @GetMapping
    public List<Ocorrencia> getOcorrenciaList(){
        return ocorrenciaService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Ocorrencia> getOcorrenciaByID(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(ocorrenciaService.getById(id).orElseThrow(() -> new NoSuchElementException("Not found")));
    }
    //TODO DELETE WORKDAY
    @DeleteMapping("/{id}")
    public ResponseEntity<Ocorrencia>  deleteOcorrenciaByID(@PathVariable("id") Long id) throws Exception {
        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
            HttpStatus.EXPECTATION_FAILED.toString();       }
        ocorrenciaService.deleteOcorrencia(id);
        return (ResponseEntity<Ocorrencia>) ResponseEntity.ok();
    }
    //TODO PUT WORKDAY
    @PutMapping
    public Ocorrencia updateOcorrencia(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.updateOcorrencia(ocorrencia);

    }
}
