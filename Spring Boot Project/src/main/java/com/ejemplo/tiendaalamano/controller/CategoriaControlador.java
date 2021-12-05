package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Categoria;
import com.ejemplo.tiendaalamano.service.CategoriaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/miscategorias/")
public class CategoriaControlador {
    @Autowired
    private CategoriaServicio miServiCatego;
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/demelas", method = RequestMethod.GET)
    public List<Categoria> dameCategorias(){
        return miServiCatego.miReyTodasCategorias();
    }
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/demela/{codigo}", method = RequestMethod.GET)
    public Categoria dameCategoria(@PathVariable Integer codigo){
        return miServiCatego.miReyUnaCategoria(codigo);
    }
    
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/crear", method = RequestMethod.POST)
    public void creaCategoria(@RequestBody Categoria soyLaCategoria){
        miServiCatego.miReyCreameUnaCategoria(soyLaCategoria);
    }
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/borrar/{codigo}", method = RequestMethod.DELETE)
    public String borraCategoria(@PathVariable Integer codigo){
        return miServiCatego.miReyBorremeUnaCategoria(codigo);
    }
}
