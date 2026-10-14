package tn.esprit.elyes_chaouch_4ssa3.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.elyes_chaouch_4ssa3.reposetiries.VehiculeReposotory;
import tn.esprit.elyes_chaouch_4ssa3.entities.Vehicule;
import tn.esprit.elyes_chaouch_4ssa3.services.interfaces.IVehiculeService;
import java.util.List;

@AllArgsConstructor
@Service
public class VehiculeServiceImpl implements IVehiculeService {
    VehiculeReposotory vehiculeRepository;

    @Override
    public Vehicule ajouterVehicule(Vehicule a) {
        return vehiculeRepository.save(a);
    }

    @Override
    public Vehicule updateVehicule(Vehicule a) {
        return vehiculeRepository.save(a);
    }

    @Override
    public void deleteVehicule(Long id) {
        vehiculeRepository.deleteById(id);
    }

    @Override
    public Vehicule getVehicule(Long id) {
        return vehiculeRepository.findById(id).get();
    }

    @Override
    public List<Vehicule> getAllVehicules() {
        return vehiculeRepository.findAll();
    }
}
