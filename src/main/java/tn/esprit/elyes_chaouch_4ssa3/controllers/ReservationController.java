package tn.esprit.elyes_chaouch_4ssa3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.elyes_chaouch_4ssa3.entities.Reservation;
import tn.esprit.elyes_chaouch_4ssa3.services.interfaces.IReservationService;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/reservation")
public class ReservationController {
    IReservationService reservationService;

    @PostMapping("/ajouter")
    public Reservation ajouterReservation(@RequestBody Reservation a) {
        return reservationService.ajouterReservation(a);
    }

    @PutMapping("/modifier")
    public Reservation updateReservation(@RequestBody Reservation a) {
        return reservationService.updateReservation(a);
    }

    @DeleteMapping("/supprimer/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }

    @GetMapping("/get/{id}")
    public Reservation getReservation(@PathVariable Long id) {
        return reservationService.getReservation(id);
    }

    @GetMapping("/getAll")
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }
}
