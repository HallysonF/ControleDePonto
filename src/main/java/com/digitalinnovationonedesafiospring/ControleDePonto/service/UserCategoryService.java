package com.digitalinnovationonedesafiospring.ControleDePonto.service;
import com.digitalinnovationonedesafiospring.ControleDePonto.model.UserCategory;
import com.digitalinnovationonedesafiospring.ControleDePonto.repository.UserCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserCategoryService {
    @Autowired
    UserCategoryRepository userCategoryRepository;
    //TODO SALVAR
    public UserCategory saveUserCategory(UserCategory userCategory){
        return userCategoryRepository.save(userCategory);
    }
    //TODO LISTAR
    public List<UserCategory> findAll() {
        return userCategoryRepository.findAll();
    }

    //TODO LISTAR POR ID
    public Optional<UserCategory> getById(Long id) {
        return userCategoryRepository.findById(id);
    }
    //TODO ATUALIZAR
    public UserCategory updateUserCategory(UserCategory userCategory){
        return userCategoryRepository.save(userCategory);
    }
    //TODO DELETAR
    public void deleteUserCategory(Long id) {
        userCategoryRepository.deleteById(id);
    }
}
