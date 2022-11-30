package br.edu.fatecrl.demo.controllers;

import br.edu.fatecrl.demo.models.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
    private static final List<Cliente> clientes = new ArrayList<Cliente>();

    public ClienteController() {
        clientes.add(new Cliente("Lucas", "Tenis", 200));
        clientes.add(new Cliente("Renan", "Calça", 100));
        clientes.add(new Cliente("Melissa", "Sapato", 500));
        clientes.add(new Cliente("Matheus", "Camiseta", 50));
    }

    @GetMapping
    public String getClientes(Model model)
    {
        model.addAttribute("clientes", clientes);
        return "clientes";

    }

}
