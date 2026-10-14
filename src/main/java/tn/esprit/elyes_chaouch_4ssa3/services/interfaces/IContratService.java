package tn.esprit.elyes_chaouch_4ssa3.services.interfaces;

import tn.esprit.elyes_chaouch_4ssa3.entities.Contrat;
import java.util.List;

public interface IContratService {
    Contrat ajouterContrat(Contrat a);
    Contrat updateContrat(Contrat a);
    void deleteContrat(Long id);
    Contrat getContrat(Long id);
    List<Contrat> getAllContrats();
}
