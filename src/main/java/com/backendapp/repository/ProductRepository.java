package com.backendapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendapp.model.Producto;

@Repository
public interface ProductRepository extends JpaRepository<Producto, Long> {

}
