package tn.esprit.elyes_chaouch_4ssa3.services.interfaces;

import tn.esprit.elyes_chaouch_4ssa3.entities.Paiement;
import java.util.List;

public interface IPaiementService {
    Paiement ajouterPaiement(Paiement a);
    Paiement updatePaiement(Paiement a);
    void deletePaiement(Long id);
    Paiement getPaiement(Long id);
    List<Paiement> getAllPaiements();
}
