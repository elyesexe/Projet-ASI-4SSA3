package tn.esprit.elyes_chaouch_4ssa3.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.elyes_chaouch_4ssa3.reposetiries.ReservationReoposotory;
import tn.esprit.elyes_chaouch_4ssa3.entities.Reservation;
import tn.esprit.elyes_chaouch_4ssa3.services.interfaces.IReservationService;
import java.util.List;

@AllArgsConstructor
@Service
public class ReservationServiceImpl implements IReservationService {
    ReservationReoposotory reservationRepository;

    @Override
    public Reservation ajouterReservation(Reservation a) {
        return reservationRepository.save(a);
    }

    @Override
    public Reservation updateReservation(Reservation a) {
        return reservationRepository.save(a);
    }

    @Override
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public Reservation getReservation(Long id) {
        return reservationRepository.findById(id).get();
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }
}
