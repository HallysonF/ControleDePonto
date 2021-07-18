package com.digitalinnovationonedesafiospring.ControleDePonto.controller;
import com.digitalinnovationonedesafiospring.ControleDePonto.model.NivelAcesso;
import com.digitalinnovationonedesafiospring.ControleDePonto.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/nivelacesso")
public class NivelAcessoController {
    @Autowired
    NivelAcessoService nivelAcessoService;
    //TODO POST WORKDAY
    @PostMapping
    public NivelAcesso createNivelAcesso(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.saveNivelAcesso(nivelAcesso);

    }
    //TODO GET WORKDAY
    @GetMapping
    public List<NivelAcesso> getNivelAcessoList(){
        return nivelAcessoService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<NivelAcesso> getNivelAcessoByID(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(nivelAcessoService.getById(id).orElseThrow(() -> new NoSuchElementException("Not found")));
    }
    //TODO DELETE WORKDAY
    @DeleteMapping("/{id}")
    public ResponseEntity<NivelAcesso>  deleteNivelAcessoByID(@PathVariable("id") Long id) throws Exception {
        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
            HttpStatus.EXPECTATION_FAILED.toString();       }
        nivelAcessoService.deleteNivelAcesso(id);
        return (ResponseEntity<NivelAcesso>) ResponseEntity.ok();
    }
    //TODO PUT WORKDAY
    @PutMapping
    public NivelAcesso updateNivelAcesso(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.updateNivelAcesso(nivelAcesso);

    }
}
