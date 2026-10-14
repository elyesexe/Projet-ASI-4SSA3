package tn.esprit.elyes_chaouch_4ssa3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.elyes_chaouch_4ssa3.entities.Employe;
import tn.esprit.elyes_chaouch_4ssa3.services.interfaces.IEmployeService;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/employe")
public class EmployeController {
    IEmployeService employeService;

    @PostMapping("/ajouter")
    public Employe ajouterEmploye(@RequestBody Employe a) {
        return employeService.ajouterEmploye(a);
    }

    @PutMapping("/modifier")
    public Employe updateEmploye(@RequestBody Employe a) {
        return employeService.updateEmploye(a);
    }

    @DeleteMapping("/supprimer/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.deleteEmploye(id);
    }

    @GetMapping("/get/{id}")
    public Employe getEmploye(@PathVariable Long id) {
        return employeService.getEmploye(id);
    }

    @GetMapping("/getAll")
    public List<Employe> getAllEmployes() {
        return employeService.getAllEmployes();
    }
}
