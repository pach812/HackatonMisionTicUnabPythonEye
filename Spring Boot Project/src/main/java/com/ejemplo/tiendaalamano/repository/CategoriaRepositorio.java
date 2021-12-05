package com.ejemplo.tiendaalamano.repository;

import com.ejemplo.tiendaalamano.model.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria, Integer>{
    @Query("SELECT c FROM Categoria c")
    public List<Categoria> parceDemeTodasCategorias();
    
    @Query("SELECT c FROM Categoria c WHERE c.codCategoria = :codigo")
    public Categoria parceDemeUnaCategoria(Integer codigo);
    
    @Query("DELETE FROM Categoria c WHERE c.codCategoria = :codigo")
    public void parceBorremeUnaCategoria(Integer codigo);
}
