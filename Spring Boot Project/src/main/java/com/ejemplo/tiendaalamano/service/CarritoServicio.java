package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Carrito;
import com.ejemplo.tiendaalamano.repository.CarritoRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarritoServicio {
    @Autowired
    private CarritoRepositorio miCarritoRepo;

    public List<Carrito> miReyTodosCarritos() {
        return miCarritoRepo.findAll();
    }

    public Carrito miReyUnCarrito(Integer codigo) {
        return miCarritoRepo.findById(codigo).orElse(new Carrito());
    }

    public void miReyActualizaUnCarrito(Carrito miCarrito) {
        miCarritoRepo.save(miCarrito);
    }

    public String miReyBorremeUnCarrito(Integer codigo) {
        miCarritoRepo.deleteById(codigo);
        return "Se borró";
    }

    public void miReyCreameUnCarrito(Carrito soyElCarrito) {
        miCarritoRepo.save(soyElCarrito);
    }
}
