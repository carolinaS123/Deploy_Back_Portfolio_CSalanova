package com.backportfoliocs.backportfcsalanova.repository;

import com.backportfoliocs.backportfcsalanova.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion, Long>{
    
}
