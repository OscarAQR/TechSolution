package com.techsolution.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techsolution.entity.DetalleCompra;

@Repository
public interface DetalleCompraRepositories extends JpaRepository<DetalleCompra, Long>{

}
