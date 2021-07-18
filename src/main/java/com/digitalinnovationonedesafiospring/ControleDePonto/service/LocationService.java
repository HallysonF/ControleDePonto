package com.digitalinnovationonedesafiospring.ControleDePonto.service;
import com.digitalinnovationonedesafiospring.ControleDePonto.model.Location;
import com.digitalinnovationonedesafiospring.ControleDePonto.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    @Autowired
    LocationRepository locationRepository;
    //TODO SALVAR
    public Location saveLocation(Location location){
        return locationRepository.save(location);
    }
    //TODO LISTAR
    public List<Location> findAll() {
        return locationRepository.findAll();
    }

    //TODO LISTAR POR ID
    public Optional<Location> getById(Long id) {
        return locationRepository.findById(id);
    }
    //TODO ATUALIZAR
    public Location updateLocation(Location location){
        return locationRepository.save(location);
    }
    //TODO DELETAR
    public void deleteLocation(Long id) {
        locationRepository.deleteById(id);
    }
}
