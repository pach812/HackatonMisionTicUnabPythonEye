package com.ejemplo.tiendaalamano.repository;

import com.ejemplo.tiendaalamano.model.Domiciliario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomiciliarioRepositorio extends JpaRepository<Domiciliario, Integer>{
//    @Query("SELECT d FROM Domiciliario d")
//    public List<Domiciliario> parceDemeTodosDomiciliarios();
//    
//    @Query("SELECT d FROM Domiciliario d WHERE d.codDomiciliario = :codigo")
//    public Domiciliario parceDemeUnDomiciliario(Integer codigo);
//    
//    @Query("DELETE FROM Domiciliario d WHERE d.codDomiciliario = :codigo")
//    public void parceBorremeUnDomiciliario(Integer codigo);
}
