package tn.esprit.elyes_chaouch_4ssa3.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.elyes_chaouch_4ssa3.reposetiries.MaintenanceReopsotory;
import tn.esprit.elyes_chaouch_4ssa3.entities.Maintenance;
import tn.esprit.elyes_chaouch_4ssa3.services.interfaces.IMaintenanceService;
import java.util.List;

@AllArgsConstructor
@Service
public class MaintenanceServiceImpl implements IMaintenanceService {
    MaintenanceReopsotory maintenanceRepository;

    @Override
    public Maintenance ajouterMaintenance(Maintenance a) {
        return maintenanceRepository.save(a);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance a) {
        return maintenanceRepository.save(a);
    }

    @Override
    public void deleteMaintenance(Long id) {
        maintenanceRepository.deleteById(id);
    }

    @Override
    public Maintenance getMaintenance(Long id) {
        return maintenanceRepository.findById(id).get();
    }

    @Override
    public List<Maintenance> getAllMaintenances() {
        return maintenanceRepository.findAll();
    }
}
