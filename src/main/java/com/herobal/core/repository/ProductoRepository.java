package com.herobal.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.herobal.core.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
