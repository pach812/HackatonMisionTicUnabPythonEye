package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Impuesto;
import com.ejemplo.tiendaalamano.service.ImpuestoServicio;
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
@RequestMapping("/api/misimpuesto/")
public class ImpuestoControlador {
    @Autowired
    private ImpuestoServicio miServiImpuesto;
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/demelas", method = RequestMethod.GET)
    public List<Impuesto> dameImpuestos(){
        return miServiImpuesto.miReyTodasImpuestos();
    }
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/demela/{codigo}", method = RequestMethod.GET)
    public Impuesto dameImpuesto(@PathVariable Integer codigo){
        return miServiImpuesto.miReyUnImpuesto(codigo);
    }
    
    @ResponseStatus(code = HttpStatus.CREATED, reason = "Impuesto Creado Correctamente")
    @RequestMapping(value = "/crear", method = RequestMethod.POST)
    public void creaImpuesto(@RequestBody Impuesto soyLaImpuesto){
        miServiImpuesto.miReyCreameUnaImpuesto(soyLaImpuesto);
    }
    
    @ResponseStatus(code = HttpStatus.ACCEPTED, reason = "Impuesto Actualizado Correctamente")
    @RequestMapping(value = "/actualizar", method = RequestMethod.PUT)
    public void actualizaImpuesto(@RequestBody Impuesto soyImpuesto){
        miServiImpuesto.miReyActualizaUnImpuesto(soyImpuesto);
    }
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/borrar/{codigo}", method = RequestMethod.DELETE)
    public String borraImpuesto(@PathVariable Integer codigo){
        return miServiImpuesto.miReyBorremeUnaImpuesto(codigo);
    }
}
