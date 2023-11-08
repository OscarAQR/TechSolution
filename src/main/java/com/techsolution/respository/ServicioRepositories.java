package com.techsolution.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techsolution.entity.Servicio;

@Repository
public interface ServicioRepositories extends JpaRepository<Servicio, Long>{

}
