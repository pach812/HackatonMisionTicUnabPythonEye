package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Domiciliario;
import com.ejemplo.tiendaalamano.repository.DomiciliarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomiciliarioServicio {
    @Autowired
    private DomiciliarioRepositorio miDomiRepo;
    
    public List<Domiciliario> miReyTodosDomiciliarios(){
        return miDomiRepo.findAll();
    }
    
    public Domiciliario miReyUnDomiciliario(Integer codigo){
        return miDomiRepo.findById(codigo).orElse(new Domiciliario());
    }
    
    public String miReyBorremeUnDomiciliario(Integer codigo){
        miDomiRepo.deleteById(codigo);
        return "Se borró";
    }
    
    public void miReyCreameUnDomiciliario(Domiciliario soyLaDomiciliario){
        miDomiRepo.save(soyLaDomiciliario);
    }
}
