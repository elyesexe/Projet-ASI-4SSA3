package tn.esprit.elyes_chaouch_4ssa3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.elyes_chaouch_4ssa3.entities.Contrat;
import tn.esprit.elyes_chaouch_4ssa3.services.interfaces.IContratService;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/contrat")
public class ContratController {
    IContratService contratService;

    @PostMapping("/ajouter")
    public Contrat ajouterContrat(@RequestBody Contrat a) {
        return contratService.ajouterContrat(a);
    }

    @PutMapping("/modifier")
    public Contrat updateContrat(@RequestBody Contrat a) {
        return contratService.updateContrat(a);
    }

    @DeleteMapping("/supprimer/{id}")
    public void deleteContrat(@PathVariable Long id) {
        contratService.deleteContrat(id);
    }

    @GetMapping("/get/{id}")
    public Contrat getContrat(@PathVariable Long id) {
        return contratService.getContrat(id);
    }

    @GetMapping("/getAll")
    public List<Contrat> getAllContrats() {
        return contratService.getAllContrats();
    }
}
