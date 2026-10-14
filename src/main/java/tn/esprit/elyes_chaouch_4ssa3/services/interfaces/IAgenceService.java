package tn.esprit.elyes_chaouch_4ssa3.services.interfaces;

import tn.esprit.elyes_chaouch_4ssa3.entities.Agence;
import java.util.List;

public interface IAgenceService {
    Agence ajouterAgence(Agence a);
    Agence updateAgence(Agence a);
    void deleteAgence(Long id);
    Agence getAgence(Long id);
    List<Agence> getAllAgences();
}
