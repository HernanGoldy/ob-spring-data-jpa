package com.example;

/*
Los repositorios de persistencia se utilizan para ser almacenados en la DB.
@Repository -> Le indica a Spring que la interfaz será un bean.
*/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocheRepository extends JpaRepository<Coche, Long> {
}
