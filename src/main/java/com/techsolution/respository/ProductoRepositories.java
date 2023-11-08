package com.techsolution.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techsolution.entity.Producto;

@Repository
public interface ProductoRepositories extends JpaRepository<Producto, Long>{

}
