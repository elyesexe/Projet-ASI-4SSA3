package tn.esprit.elyes_chaouch_4ssa3.services.interfaces;

import tn.esprit.elyes_chaouch_4ssa3.entities.Reservation;
import java.util.List;

public interface IReservationService {
    Reservation ajouterReservation(Reservation a);
    Reservation updateReservation(Reservation a);
    void deleteReservation(Long id);
    Reservation getReservation(Long id);
    List<Reservation> getAllReservations();
}
