package tn.esprit.elyes_chaouch_4ssa3.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.elyes_chaouch_4ssa3.reposetiries.EmployeReposotory;
import tn.esprit.elyes_chaouch_4ssa3.entities.Employe;
import tn.esprit.elyes_chaouch_4ssa3.services.interfaces.IEmployeService;
import java.util.List;

@AllArgsConstructor
@Service
public class EmployeServiceImpl implements IEmployeService {
    EmployeReposotory employeRepository;

    @Override
    public Employe ajouterEmploye(Employe a) {
        return employeRepository.save(a);
    }

    @Override
    public Employe updateEmploye(Employe a) {
        return employeRepository.save(a);
    }

    @Override
    public void deleteEmploye(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public Employe getEmploye(Long id) {
        return employeRepository.findById(id).get();
    }

    @Override
    public List<Employe> getAllEmployes() {
        return employeRepository.findAll();
    }
}
