package com.digitalinnovationonedesafiospring.ControleDePonto.controller;

import com.digitalinnovationonedesafiospring.ControleDePonto.model.TipoData;
import com.digitalinnovationonedesafiospring.ControleDePonto.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/tipodata")
public class TipoDataController {
    @Autowired
    TipoDataService tipoDataService;
    //TODO POST WORKDAY
    @PostMapping
    public TipoData createTipoData(@RequestBody TipoData tipoData){
        return tipoDataService.saveTipoData(tipoData);

    }
    //TODO GET WORKDAY
    @GetMapping
    public List<TipoData> getTipoDataList(){
        return tipoDataService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<TipoData> getTipoDataByID(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(tipoDataService.getById(id).orElseThrow(() -> new NoSuchElementException("Not found")));
    }
    //TODO DELETE WORKDAY
    @DeleteMapping("/{id}")
    public ResponseEntity<TipoData>  deleteTipoDataByID(@PathVariable("id") Long id) throws Exception {
        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
            HttpStatus.EXPECTATION_FAILED.toString();       }
        tipoDataService.deleteTipoData(id);
        return (ResponseEntity<TipoData>) ResponseEntity.ok();
    }
    //TODO PUT WORKDAY
    @PutMapping
    public TipoData updateTipoData(@RequestBody TipoData tipoData){
        return tipoDataService.updateTipoData(tipoData);

    }
}
