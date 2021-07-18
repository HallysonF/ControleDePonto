package com.digitalinnovationonedesafiospring.ControleDePonto.controller;

import com.digitalinnovationonedesafiospring.ControleDePonto.model.BancoHoras;
import com.digitalinnovationonedesafiospring.ControleDePonto.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/bancohoras")
public class BancoHorasController {
    @Autowired
    BancoHorasService bancoHorasService;
    //TODO POST WORKDAY
    @PostMapping
    public BancoHoras createBancoHoras(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.saveBancoHoras(bancoHoras);

    }
    //TODO GET WORKDAY
    @GetMapping
    public List<BancoHoras> getBancoHorasList(){
        return bancoHorasService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<BancoHoras> getBancoHorasByID(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(bancoHorasService.getById(id).orElseThrow(() -> new NoSuchElementException("Not found")));
    }
    //TODO DELETE WORKDAY
    @DeleteMapping("/{id}")
    public ResponseEntity<BancoHoras>  deleteBancoHorasByID(@PathVariable("id") Long id) throws Exception {
        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
            HttpStatus.EXPECTATION_FAILED.toString();       }
        bancoHorasService.deleteBancoHoras(id);
        return (ResponseEntity<BancoHoras>) ResponseEntity.ok();
    }
    //TODO PUT WORKDAY
    @PutMapping
    public BancoHoras updateBancoHoras(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.updateBancoHoras(bancoHoras);

    }
}
