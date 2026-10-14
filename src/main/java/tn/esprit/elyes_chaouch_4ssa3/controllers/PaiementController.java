package tn.esprit.elyes_chaouch_4ssa3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.elyes_chaouch_4ssa3.entities.Paiement;
import tn.esprit.elyes_chaouch_4ssa3.services.interfaces.IPaiementService;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/paiement")
public class PaiementController {
    IPaiementService paiementService;

    @PostMapping("/ajouter")
    public Paiement ajouterPaiement(@RequestBody Paiement a) {
        return paiementService.ajouterPaiement(a);
    }

    @PutMapping("/modifier")
    public Paiement updatePaiement(@RequestBody Paiement a) {
        return paiementService.updatePaiement(a);
    }

    @DeleteMapping("/supprimer/{id}")
    public void deletePaiement(@PathVariable Long id) {
        paiementService.deletePaiement(id);
    }

    @GetMapping("/get/{id}")
    public Paiement getPaiement(@PathVariable Long id) {
        return paiementService.getPaiement(id);
    }

    @GetMapping("/getAll")
    public List<Paiement> getAllPaiements() {
        return paiementService.getAllPaiements();
    }
}
