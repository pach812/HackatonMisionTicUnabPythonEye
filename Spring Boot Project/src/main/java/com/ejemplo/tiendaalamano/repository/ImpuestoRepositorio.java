package com.ejemplo.tiendaalamano.repository;

import com.ejemplo.tiendaalamano.model.Impuesto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ImpuestoRepositorio extends JpaRepository<Impuesto, Integer>{
    @Query("SELECT i FROM Impuesto i")
    public List<Impuesto> parceDemeTodosImpuesto();
    
    @Query("SELECT i FROM Impuesto i WHERE i.codImpuesto = :codigo")
    public Impuesto parceDemeUnaImpuesto(Integer codigo);
    
    @Query("DELETE FROM Impuesto i WHERE i.codImpuesto = :codigo")
    public void parceBorremeUnaMarca(Integer codigo);
}
