package com.digitalinnovationonedesafiospring.ControleDePonto.controller;

import com.digitalinnovationonedesafiospring.ControleDePonto.model.Company;
import com.digitalinnovationonedesafiospring.ControleDePonto.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    CompanyService companyService;
    //TODO POST WORKDAY
    @PostMapping
    public Company createCompany(@RequestBody Company company){
        return companyService.saveCompany(company);

    }
    //TODO GET WORKDAY
    @GetMapping
    public List<Company> getCompanyList(){
        return companyService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Company> getCompanyByID(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(companyService.getById(id).orElseThrow(() -> new NoSuchElementException("Not found")));
    }
    //TODO DELETE WORKDAY
    @DeleteMapping("/{id}")
    public ResponseEntity<Company>  deleteCompanyByID(@PathVariable("id") Long id) throws Exception {
        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
            HttpStatus.EXPECTATION_FAILED.toString();       }
        companyService.deleteCompany(id);
        return (ResponseEntity<Company>) ResponseEntity.ok();
    }
    //TODO PUT WORKDAY
    @PutMapping
    public Company updateCompany(@RequestBody Company company){
        return companyService.updateCompany(company);

    }
}
