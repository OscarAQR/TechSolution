package com.techsolution.respository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techsolution.entity.Cliente;

@Repository()
public interface ClienteRepositories extends JpaRepository<Cliente, Long>{

}
