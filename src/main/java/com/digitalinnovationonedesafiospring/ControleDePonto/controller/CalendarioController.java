package com.digitalinnovationonedesafiospring.ControleDePonto.controller;

import com.digitalinnovationonedesafiospring.ControleDePonto.model.BancoHoras;
import com.digitalinnovationonedesafiospring.ControleDePonto.model.Calendario;
import com.digitalinnovationonedesafiospring.ControleDePonto.service.BancoHorasService;
import com.digitalinnovationonedesafiospring.ControleDePonto.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/calendario")
public class CalendarioController {
    @Autowired
    CalendarioService calendarioService;
    //TODO POST WORKDAY
    @PostMapping
    public Calendario createBancoHoras(@RequestBody Calendario calendario){
        return calendarioService.saveCalendario(calendario);

    }
    //TODO GET WORKDAY
    @GetMapping
    public List<Calendario> getCalendarioList(){
        return calendarioService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Calendario> getCalendarioByID(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(calendarioService.getById(id).orElseThrow(() -> new NoSuchElementException("Not found")));
    }
    //TODO DELETE WORKDAY
    @DeleteMapping("/{id}")
    public ResponseEntity<Calendario>  deleteCalendarioByID(@PathVariable("id") Long id) throws Exception {
        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
            HttpStatus.EXPECTATION_FAILED.toString();       }
        calendarioService.deleteCalendario(id);
        return (ResponseEntity<Calendario>) ResponseEntity.ok();
    }
    //TODO PUT WORKDAY
    @PutMapping
    public Calendario updateCalendario(@RequestBody Calendario calendario){
        return calendarioService.updateCalendario(calendario);

    }
}
