package tn.esprit.elyes_chaouch_4ssa3.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.elyes_chaouch_4ssa3.reposetiries.AgenceReposotirie;
import tn.esprit.elyes_chaouch_4ssa3.entities.Agence;
import tn.esprit.elyes_chaouch_4ssa3.services.interfaces.IAgenceService;
import java.util.List;

@AllArgsConstructor
@Service
public class AgenceServiceImpl implements IAgenceService {
    AgenceReposotirie agenceRepository;

    @Override
    public Agence ajouterAgence(Agence a) {
        return agenceRepository.save(a);
    }

    @Override
    public Agence updateAgence(Agence a) {
        return agenceRepository.save(a);
    }

    @Override
    public void deleteAgence(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public Agence getAgence(Long id) {
        return agenceRepository.findById(id).get();
    }

    @Override
    public List<Agence> getAllAgences() {
        return agenceRepository.findAll();
    }
}
