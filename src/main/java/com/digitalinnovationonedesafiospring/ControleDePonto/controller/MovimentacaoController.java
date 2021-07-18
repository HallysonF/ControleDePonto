package com.digitalinnovationonedesafiospring.ControleDePonto.controller;

import com.digitalinnovationonedesafiospring.ControleDePonto.model.Movimentacao;
import com.digitalinnovationonedesafiospring.ControleDePonto.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {
    @Autowired
    MovimentacaoService movimentacaoService;
    //TODO POST WORKDAY
    @PostMapping
    public Movimentacao createMovimentacao(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.saveMovimentacao(movimentacao);

    }
    //TODO GET WORKDAY
    @GetMapping
    public List<Movimentacao> getMovimentacaoList(){
        return movimentacaoService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Movimentacao> getMovimentacaoByID(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(movimentacaoService.getById(id).orElseThrow(() -> new NoSuchElementException("Not found")));
    }
    //TODO DELETE WORKDAY
    @DeleteMapping("/{id}")
    public ResponseEntity<Movimentacao>  deleteMovimentacaoByID(@PathVariable("id") Long id) throws Exception {
        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
            HttpStatus.EXPECTATION_FAILED.toString();       }
        movimentacaoService.deleteMovimentacao(id);
        return (ResponseEntity<Movimentacao>) ResponseEntity.ok();
    }
    //TODO PUT WORKDAY
    @PutMapping
    public Movimentacao updateMovimentacao(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.updateMovimentacao(movimentacao);

    }
}
