package tn.esprit.elyes_chaouch_4ssa3.services.interfaces;

import tn.esprit.elyes_chaouch_4ssa3.entities.Equipement;
import java.util.List;

public interface IEquipementService {
    Equipement ajouterEquipement(Equipement a);
    Equipement updateEquipement(Equipement a);
    void deleteEquipement(Long id);
    Equipement getEquipement(Long id);
    List<Equipement> getAllEquipements();
}
