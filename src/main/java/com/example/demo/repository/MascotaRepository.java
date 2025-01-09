package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Mascota;


import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MascotaRepository extends  JpaRepository<Mascota, Integer>{
    
}
