package br.edu.fatecrl.demo.controllers;

import br.edu.fatecrl.demo.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteApiController {
    private static final List<Cliente> clientes = new ArrayList<Cliente>();

    public ClienteApiController() {
        clientes.add(new Cliente("Lucas", "Tenis", 200));
        clientes.add(new Cliente("Renan", "Calça", 100));
        clientes.add(new Cliente("Melissa", "Sapato", 500));
    }

    @GetMapping
    public List<Cliente> getAlunos(){
        return clientes;
    }
}
