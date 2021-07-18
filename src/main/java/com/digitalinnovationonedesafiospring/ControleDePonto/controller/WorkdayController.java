package com.digitalinnovationonedesafiospring.ControleDePonto.controller;

import com.digitalinnovationonedesafiospring.ControleDePonto.model.Workday;
import com.digitalinnovationonedesafiospring.ControleDePonto.service.WorkdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/workday")
public class WorkdayController {
    @Autowired
    WorkdayService workdayService;
    //TODO POST WORKDAY
    @PostMapping
    public Workday createWorkday(@RequestBody Workday workday){
        return workdayService.saveWorkday(workday);

    }
    //TODO GET WORKDAY
    @GetMapping
    public List<Workday> getWorkdayList(){
        return workdayService.findAll();
    }
    @GetMapping("/{idWorkday}")
    public ResponseEntity<Workday>  getWorkdayByID(@PathVariable("idWorkday") Long idWorkday) throws Exception {
        return ResponseEntity.ok(workdayService.getById(idWorkday).orElseThrow(() -> new NoSuchElementException("Not found")));
}
    //TODO DELETE WORKDAY
    @DeleteMapping("/{idWorkday}")
    public ResponseEntity<Workday>  deleteWorkdayByID(@PathVariable("idWorkday") Long idWorkday) throws Exception {
       try{

       }catch (Exception e){
           System.out.println(e.getMessage());
           HttpStatus.EXPECTATION_FAILED.toString();       }
        workdayService.deleteWorkday(idWorkday);
        return (ResponseEntity<Workday>) ResponseEntity.ok();
    }
    //TODO PUT WORKDAY
    @PutMapping
    public Workday updateWorkday(@RequestBody Workday workday){
        return workdayService.updateWorkday(workday);

    }
}
