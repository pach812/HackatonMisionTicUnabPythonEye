package com.ejemplo.tiendaalamano.repository;

import com.ejemplo.tiendaalamano.model.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoRepositorio extends JpaRepository<Carrito, Integer>{
//    @Query("SELECT c FROM Carrito c")
//    public List<Carrito> parceDemeTodosCarrito();
//    
//    @Query("SELECT c FROM Carrito c WHERE c.codCarrito = :codigo")
//    public Carrito parceDemeUnCarrito(Integer codigo);
//    
//    @Query("DELETE FROM Carrito c WHERE c.codCarrito = :codigo")
//    public void parceBorremeUnCarrito(Integer codigo);
}
