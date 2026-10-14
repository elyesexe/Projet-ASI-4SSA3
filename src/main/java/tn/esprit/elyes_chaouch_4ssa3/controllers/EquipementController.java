package tn.esprit.elyes_chaouch_4ssa3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.elyes_chaouch_4ssa3.entities.Equipement;
import tn.esprit.elyes_chaouch_4ssa3.services.interfaces.IEquipementService;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/equipement")
public class EquipementController {
    IEquipementService equipementService;

    @PostMapping("/ajouter")
    public Equipement ajouterEquipement(@RequestBody Equipement a) {
        return equipementService.ajouterEquipement(a);
    }

    @PutMapping("/modifier")
    public Equipement updateEquipement(@RequestBody Equipement a) {
        return equipementService.updateEquipement(a);
    }

    @DeleteMapping("/supprimer/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        equipementService.deleteEquipement(id);
    }

    @GetMapping("/get/{id}")
    public Equipement getEquipement(@PathVariable Long id) {
        return equipementService.getEquipement(id);
    }

    @GetMapping("/getAll")
    public List<Equipement> getAllEquipements() {
        return equipementService.getAllEquipements();
    }
}
