package com.silviofranco.cursomc.services;

import com.silviofranco.cursomc.domain.Cliente;
import com.silviofranco.cursomc.repositories.ClienteRepository;
import com.silviofranco.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente find(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
   return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id:" + id +
                    ",Tipo: " + Cliente.class.getName()));
    }
}


