package tn.esprit.elyes_chaouch_4ssa3.reposetiries;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.elyes_chaouch_4ssa3.entities.Paiement;

public interface PaiementReposotory extends JpaRepository<Paiement, Long>{
}
