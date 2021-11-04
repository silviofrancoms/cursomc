package com.silviofranco.cursomc.services;

import com.silviofranco.cursomc.domain.Categoria;
import com.silviofranco.cursomc.repositories.CategoriaRepository;
import com.silviofranco.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
   return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id:" + id +
                    ",Tipo: " + Categoria.class.getName()));
    }
}


