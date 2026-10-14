package tn.esprit.elyes_chaouch_4ssa3.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.elyes_chaouch_4ssa3.reposetiries.EquipementReposotory;
import tn.esprit.elyes_chaouch_4ssa3.entities.Equipement;
import tn.esprit.elyes_chaouch_4ssa3.services.interfaces.IEquipementService;
import java.util.List;

@AllArgsConstructor
@Service
public class EquipementServiceImpl implements IEquipementService {
    EquipementReposotory equipementRepository;

    @Override
    public Equipement ajouterEquipement(Equipement a) {
        return equipementRepository.save(a);
    }

    @Override
    public Equipement updateEquipement(Equipement a) {
        return equipementRepository.save(a);
    }

    @Override
    public void deleteEquipement(Long id) {
        equipementRepository.deleteById(id);
    }

    @Override
    public Equipement getEquipement(Long id) {
        return equipementRepository.findById(id).get();
    }

    @Override
    public List<Equipement> getAllEquipements() {
        return equipementRepository.findAll();
    }
}
