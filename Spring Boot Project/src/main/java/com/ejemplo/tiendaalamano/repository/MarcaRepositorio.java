package com.ejemplo.tiendaalamano.repository;

import com.ejemplo.tiendaalamano.model.Marca;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepositorio extends JpaRepository<Marca, Integer>{
    @Query("SELECT m FROM Marca m")
    public List<Marca> parceDemeTodasMarca();
    
    @Query("SELECT m FROM Marca m WHERE m.codMarca = :codigo")
    public Marca parceDemeUnaMarca(Integer codigo);
    
    @Query("SELECT m FROM Marca m WHERE m.nombreMarca = :nombre")
    public Marca parceDemeUnaMarcaNombre(String nombre);
    
    @Query("DELETE FROM Marca m WHERE m.codMarca = :codigo")
    public void parceBorremeUnaMarca(Integer codigo);
}
