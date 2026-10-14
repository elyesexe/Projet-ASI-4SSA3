package tn.esprit.elyes_chaouch_4ssa3.services.interfaces;

import tn.esprit.elyes_chaouch_4ssa3.entities.Employe;
import java.util.List;

public interface IEmployeService {
    Employe ajouterEmploye(Employe a);
    Employe updateEmploye(Employe a);
    void deleteEmploye(Long id);
    Employe getEmploye(Long id);
    List<Employe> getAllEmployes();
}
