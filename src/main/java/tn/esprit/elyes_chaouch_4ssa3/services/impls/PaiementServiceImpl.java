package tn.esprit.elyes_chaouch_4ssa3.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.elyes_chaouch_4ssa3.reposetiries.PaiementReposotory;
import tn.esprit.elyes_chaouch_4ssa3.entities.Paiement;
import tn.esprit.elyes_chaouch_4ssa3.services.interfaces.IPaiementService;
import java.util.List;

@AllArgsConstructor
@Service
public class PaiementServiceImpl implements IPaiementService {
    PaiementReposotory paiementRepository;

    @Override
    public Paiement ajouterPaiement(Paiement a) {
        return paiementRepository.save(a);
    }

    @Override
    public Paiement updatePaiement(Paiement a) {
        return paiementRepository.save(a);
    }

    @Override
    public void deletePaiement(Long id) {
        paiementRepository.deleteById(id);
    }

    @Override
    public Paiement getPaiement(Long id) {
        return paiementRepository.findById(id).get();
    }

    @Override
    public List<Paiement> getAllPaiements() {
        return paiementRepository.findAll();
    }
}
