package com.digitalinnovationonedesafiospring.ControleDePonto.controller;

import com.digitalinnovationonedesafiospring.ControleDePonto.model.Location;
import com.digitalinnovationonedesafiospring.ControleDePonto.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    LocationService locationService;
    //TODO POST WORKDAY
    @PostMapping
    public Location createLocation(@RequestBody Location location){
        return locationService.saveLocation(location);

    }
    //TODO GET WORKDAY
    @GetMapping
    public List<Location> getLocationList(){
        return locationService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Location> getLocationByID(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(locationService.getById(id).orElseThrow(() -> new NoSuchElementException("Not found")));
    }
    //TODO DELETE WORKDAY
    @DeleteMapping("/{id}")
    public ResponseEntity<Location>  deleteLocationByID(@PathVariable("id") Long id) throws Exception {
        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
            HttpStatus.EXPECTATION_FAILED.toString();       }
        locationService.deleteLocation(id);
        return (ResponseEntity<Location>) ResponseEntity.ok();
    }
    //TODO PUT WORKDAY
    @PutMapping
    public Location updateLocation(@RequestBody Location location){
        return locationService.updateLocation(location);

    }
}
