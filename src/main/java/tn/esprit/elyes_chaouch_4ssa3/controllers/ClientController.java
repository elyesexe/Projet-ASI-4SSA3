package tn.esprit.elyes_chaouch_4ssa3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.elyes_chaouch_4ssa3.entities.Client;
import tn.esprit.elyes_chaouch_4ssa3.services.interfaces.IClientService;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/client")
public class ClientController {
    IClientService clientService;

    @PostMapping("/ajouter")
    public Client ajouterClient(@RequestBody Client a) {
        return clientService.ajouterClient(a);
    }

    @PutMapping("/modifier")
    public Client updateClient(@RequestBody Client a) {
        return clientService.updateClient(a);
    }

    @DeleteMapping("/supprimer/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }

    @GetMapping("/get/{id}")
    public Client getClient(@PathVariable Long id) {
        return clientService.getClient(id);
    }

    @GetMapping("/getAll")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }
}
