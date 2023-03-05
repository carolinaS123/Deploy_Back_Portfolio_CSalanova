package com.backportfoliocs.backportfcsalanova.service;

import com.backportfoliocs.backportfcsalanova.model.Experiencia;
import com.backportfoliocs.backportfcsalanova.repository.RExperiencia;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia implements ISExperiencia{

    @Autowired
    RExperiencia rExperiencia;
   
    @Override
    public List<Experiencia> mostrarExperiencias() {
        List<Experiencia> listaExperiencias = rExperiencia.findAll();
        return listaExperiencias;
    }

    @Override
    public void crearExperiencia(Experiencia expe) {
        rExperiencia.save(expe);
    }

    @Override
    public Experiencia editarExperiencia(Long id) {
        Experiencia expe = rExperiencia.findById(id).orElse(null);
        return expe;
    }
    
    @Override
    public void borrarExperiencia(Long id) {
        rExperiencia.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        Experiencia expe = rExperiencia.findById(id).orElse(null);
        return expe;
    }
}
