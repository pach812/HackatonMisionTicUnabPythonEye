package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Marca;
import com.ejemplo.tiendaalamano.repository.MarcaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MarcaServicio")
public class MarcaServicio {
    @Autowired
    private MarcaRepositorio miMarcaRepo;
    
    public List<Marca> miReyTodasMarcas(){
        return miMarcaRepo.parceDemeTodasMarca();
    }
    
    public Marca miReyUnaMarca(Integer codigo){
        return miMarcaRepo.parceDemeUnaMarca(codigo);
    }
    
    public Marca miReyUnaMarcaNombre(String nombre){
        return miMarcaRepo.parceDemeUnaMarcaNombre(nombre);
    }
    
    public String miReyBorremeUnaMarca(Integer codigo){
        miMarcaRepo.deleteById(codigo);
        return "Se borró";
    }
    
    public void miReyCreameUnaMarca(Marca soyLaMarca){
        miMarcaRepo.save(soyLaMarca);
    }
}
