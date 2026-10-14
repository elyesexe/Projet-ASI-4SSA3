package tn.esprit.elyes_chaouch_4ssa3.services.interfaces;

import tn.esprit.elyes_chaouch_4ssa3.entities.Maintenance;
import java.util.List;

public interface IMaintenanceService {
    Maintenance ajouterMaintenance(Maintenance a);
    Maintenance updateMaintenance(Maintenance a);
    void deleteMaintenance(Long id);
    Maintenance getMaintenance(Long id);
    List<Maintenance> getAllMaintenances();
}
