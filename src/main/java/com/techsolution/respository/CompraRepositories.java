package com.techsolution.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techsolution.entity.Compra;

@Repository
public interface CompraRepositories extends JpaRepository<Compra, String>{

}
