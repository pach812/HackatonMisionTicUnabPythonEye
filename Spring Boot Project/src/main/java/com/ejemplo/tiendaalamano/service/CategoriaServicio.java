package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Categoria;
import com.ejemplo.tiendaalamano.repository.CategoriaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CategoServicio")
public class CategoriaServicio {
    @Autowired
    private CategoriaRepositorio miCategoRepo;
    
    public List<Categoria> miReyTodasCategorias(){
        return miCategoRepo.parceDemeTodasCategorias();
    }
    
    public Categoria miReyUnaCategoria(Integer codigo){
        return miCategoRepo.parceDemeUnaCategoria(codigo);
    }
    
    public String miReyBorremeUnaCategoria(Integer codigo){
        miCategoRepo.deleteById(codigo);
        return "Se borró";
    }
    
    public void miReyCreameUnaCategoria(Categoria soyLaCategoria){
        miCategoRepo.save(soyLaCategoria);
    }
}
