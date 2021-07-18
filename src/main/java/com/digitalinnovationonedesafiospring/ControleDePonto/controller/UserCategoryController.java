package com.digitalinnovationonedesafiospring.ControleDePonto.controller;

import com.digitalinnovationonedesafiospring.ControleDePonto.model.UserCategory;
import com.digitalinnovationonedesafiospring.ControleDePonto.service.UserCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/usercategory")
public class UserCategoryController {
    @Autowired
    UserCategoryService userCategoryService;
    //TODO POST WORKDAY
    @PostMapping
    public UserCategory createUserCategory(@RequestBody UserCategory userCategory){
        return userCategoryService.saveUserCategory(userCategory);

    }
    //TODO GET WORKDAY
    @GetMapping
    public List<UserCategory> getUsercategoryList(){
        return userCategoryService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserCategory> getUserCategoryByID(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(userCategoryService.getById(id).orElseThrow(() -> new NoSuchElementException("Not found")));
    }
    //TODO DELETE WORKDAY
    @DeleteMapping("/{id}")
    public ResponseEntity<UserCategory>  deleteUserCategoryByID(@PathVariable("id") Long id) throws Exception {
        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
            HttpStatus.EXPECTATION_FAILED.toString();       }
        userCategoryService.deleteUserCategory(id);
        return (ResponseEntity<UserCategory>) ResponseEntity.ok();
    }
    //TODO PUT WORKDAY
    @PutMapping
    public UserCategory updateUserCategory(@RequestBody UserCategory userCategory){
        return userCategoryService.updateUserCategory(userCategory);

    }
}
