package tn.esprit.elyes_chaouch_4ssa3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.elyes_chaouch_4ssa3.entities.Maintenance;
import tn.esprit.elyes_chaouch_4ssa3.services.interfaces.IMaintenanceService;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/maintenance")
public class MaintenanceController {
    IMaintenanceService maintenanceService;

    @PostMapping("/ajouter")
    public Maintenance ajouterMaintenance(@RequestBody Maintenance a) {
        return maintenanceService.ajouterMaintenance(a);
    }

    @PutMapping("/modifier")
    public Maintenance updateMaintenance(@RequestBody Maintenance a) {
        return maintenanceService.updateMaintenance(a);
    }

    @DeleteMapping("/supprimer/{id}")
    public void deleteMaintenance(@PathVariable Long id) {
        maintenanceService.deleteMaintenance(id);
    }

    @GetMapping("/get/{id}")
    public Maintenance getMaintenance(@PathVariable Long id) {
        return maintenanceService.getMaintenance(id);
    }

    @GetMapping("/getAll")
    public List<Maintenance> getAllMaintenances() {
        return maintenanceService.getAllMaintenances();
    }
}
