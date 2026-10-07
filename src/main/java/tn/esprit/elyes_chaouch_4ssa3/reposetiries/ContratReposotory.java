package tn.esprit.elyes_chaouch_4ssa3.reposetiries;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.elyes_chaouch_4ssa3.entities.Contrat;

public interface ContratReposotory extends JpaRepository<Contrat, Long> {
}
