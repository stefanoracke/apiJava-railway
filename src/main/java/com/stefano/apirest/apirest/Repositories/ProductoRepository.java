package com.stefano.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stefano.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
