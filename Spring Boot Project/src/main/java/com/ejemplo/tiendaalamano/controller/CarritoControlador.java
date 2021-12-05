package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Carrito;
import com.ejemplo.tiendaalamano.service.CarritoServicio;
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
@RequestMapping("/api/miscarritos/")
public class CarritoControlador {
    @Autowired
    private CarritoServicio miServiCarrito;
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/demeloscarritos", method = RequestMethod.GET)
    public List<Carrito> dameCarritos(){
        return miServiCarrito.miReyTodosCarritos();
    }
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/demelocarrito/{codigo}", method = RequestMethod.GET)
    public Carrito dameCarrito(@PathVariable Integer codigo){
        return miServiCarrito.miReyUnCarrito(codigo);
    }
    
    @ResponseStatus(code = HttpStatus.CREATED, reason = "Carrito Creado Correctamente")
    @RequestMapping(value = "/crear", method = RequestMethod.POST)
    public void creaCarrito(@RequestBody Carrito soyElCarrito){
        miServiCarrito.miReyCreameUnCarrito(soyElCarrito);
    }
    
    @ResponseStatus(code = HttpStatus.ACCEPTED, reason = "Carrito Actualizado Correctamente")
    @RequestMapping(value = "/actualizarcarrito/{id}", method = RequestMethod.PUT)
    public void actualizaCarrito(@RequestBody Carrito soyCarrito){
        miServiCarrito.miReyActualizaUnCarrito(soyCarrito);
    }
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/borrar/{codigo}", method = RequestMethod.DELETE)
    public String borraCarrito(@PathVariable Integer codigo){
        return miServiCarrito.miReyBorremeUnCarrito(codigo);
    }
}
