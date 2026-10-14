package tn.esprit.elyes_chaouch_4ssa3.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.elyes_chaouch_4ssa3.reposetiries.ContratReposotory;
import tn.esprit.elyes_chaouch_4ssa3.entities.Contrat;
import tn.esprit.elyes_chaouch_4ssa3.services.interfaces.IContratService;
import java.util.List;

@AllArgsConstructor
@Service
public class ContratServiceImpl implements IContratService {
    ContratReposotory contratRepository;

    @Override
    public Contrat ajouterContrat(Contrat a) {
        return contratRepository.save(a);
    }

    @Override
    public Contrat updateContrat(Contrat a) {
        return contratRepository.save(a);
    }

    @Override
    public void deleteContrat(Long id) {
        contratRepository.deleteById(id);
    }

    @Override
    public Contrat getContrat(Long id) {
        return contratRepository.findById(id).get();
    }

    @Override
    public List<Contrat> getAllContrats() {
        return contratRepository.findAll();
    }
}
