package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Domiciliario;
import com.ejemplo.tiendaalamano.service.DomiciliarioServicio;
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
@RequestMapping("/api/misdomi/")
public class DomiciliarioControlador {
    @Autowired
    private DomiciliarioServicio miServiDomiciliario;
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/demelos", method = RequestMethod.GET)
    public List<Domiciliario> dameDomiciliarios(){
        return miServiDomiciliario.miReyTodosDomiciliarios();
    }
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/demelo/{codigo}", method = RequestMethod.GET)
    public Domiciliario dameDomiciliario(@PathVariable Integer codigo){
        return miServiDomiciliario.miReyUnDomiciliario(codigo);
    }
    
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/crear", method = RequestMethod.POST)
    public void creaDomiciliario(@RequestBody Domiciliario soyElDomiciliario){
        miServiDomiciliario.miReyCreameUnDomiciliario(soyElDomiciliario);
    }
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/borrar/{codigo}", method = RequestMethod.DELETE)
    public String borraDomiciliario(@PathVariable Integer codigo){
        return miServiDomiciliario.miReyBorremeUnDomiciliario(codigo);
    }
}
