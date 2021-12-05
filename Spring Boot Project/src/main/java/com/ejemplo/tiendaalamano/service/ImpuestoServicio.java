package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Impuesto;
import com.ejemplo.tiendaalamano.repository.ImpuestoRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ImpuestoServicio")
public class ImpuestoServicio {
    @Autowired
    private ImpuestoRepositorio miImpuRepo;

    public List<Impuesto> miReyTodasImpuestos() {
        return miImpuRepo.parceDemeTodosImpuesto();
    }

    public Impuesto miReyUnImpuesto(Integer codigo) {
        return miImpuRepo.parceDemeUnaImpuesto(codigo);
//        Optional<Impuesto> objTemporal = miImpuRepo.findById(codigo);
//        System.out.println("--------> " + objTemporal);
//        Impuesto objFinal = null;
//        return objFinal;
        // Como convierto un generico de tipo Optional a impuesto
        
    }

    public void miReyActualizaUnImpuesto(Impuesto miImpuesto) {
        // Tienes que usar un FindById
        miImpuRepo.save(miImpuesto);
    }

    public String miReyBorremeUnaImpuesto(Integer codigo) {
        miImpuRepo.deleteById(codigo);
        return "Se borró";
    }

    public void miReyCreameUnaImpuesto(Impuesto soyLaImpuesto) {
        miImpuRepo.save(soyLaImpuesto);
    }
}
