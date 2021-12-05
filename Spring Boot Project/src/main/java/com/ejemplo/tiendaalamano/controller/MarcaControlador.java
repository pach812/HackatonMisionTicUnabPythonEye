package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Marca;
import com.ejemplo.tiendaalamano.service.MarcaServicio;
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
@RequestMapping("/api/mismarcas/")
public class MarcaControlador {
    @Autowired
    private MarcaServicio miServiMarca;
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/demelas", method = RequestMethod.GET)
    public List<Marca> dameMarcas(){
        return miServiMarca.miReyTodasMarcas();
    }
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/demela/{codigo}", method = RequestMethod.GET)
    public Marca dameMarca(@PathVariable Integer codigo){
        return miServiMarca.miReyUnaMarca(codigo);
    }
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/demeelnombre/{nombre}", method = RequestMethod.GET)
    public Marca dameMarcaNombre(@PathVariable String nombre){
        return miServiMarca.miReyUnaMarcaNombre(nombre);
    }
    
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/crear", method = RequestMethod.POST)
    public void creaMarca(@RequestBody Marca soyLaMarca){
        miServiMarca.miReyCreameUnaMarca(soyLaMarca);
    }
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/borrar/{codigo}", method = RequestMethod.DELETE)
    public String borraMarca(@PathVariable Integer codigo){
        return miServiMarca.miReyBorremeUnaMarca(codigo);
    }

}
