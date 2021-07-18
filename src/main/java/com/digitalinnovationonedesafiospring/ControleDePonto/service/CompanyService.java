package com.digitalinnovationonedesafiospring.ControleDePonto.service;
import com.digitalinnovationonedesafiospring.ControleDePonto.model.Company;
import com.digitalinnovationonedesafiospring.ControleDePonto.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    @Autowired
    CompanyRepository companyRepository;
    //TODO SALVAR
    public Company saveCompany(Company company){
        return companyRepository.save(company);
    }
    //TODO LISTAR
    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    //TODO LISTAR POR ID
    public Optional<Company> getById(Long id) {
        return companyRepository.findById(id);
    }
    //TODO ATUALIZAR
    public Company updateCompany(Company company){
        return companyRepository.save(company);
    }
    //TODO DELETAR
    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }
}
