package com.silviofranco.cursomc.services;

import com.silviofranco.cursomc.domain.Pedido;
import com.silviofranco.cursomc.repositories.PedidoRepository;
import com.silviofranco.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
   return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id:" + id +
                    ",Tipo: " + Pedido.class.getName()));
    }
}


