package com.example.avion.controllers;

import com.example.avion.models.Passeport.Passeport;
import com.example.avion.models.Reservation.Reservation;
import com.example.avion.repositories.PasseportRepository;
import com.example.avion.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/passeports")
public class PasseportController {

    @Autowired
    private PasseportRepository passeportRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping("/insert")
    public String showInsertForm(Model model) {
        List<Reservation> reservations = reservationRepository.findAll();
        model.addAttribute("reservations", reservations);
        model.addAttribute("passeport", new Passeport()); // Crée un nouvel objet Passeport
        return "passeports/insert";
    }

    @PostMapping("/insert")
    public String insertPasseport(@RequestParam("reservation") int reservationId,
                                  @RequestParam("file") MultipartFile file) throws IOException {
        
        // Enregistrer le fichier
        String fileName = UUID.randomUUID().toString() + "-" + file.getOriginalFilename();
        File dest = new File("uploads/" + fileName);
        file.transferTo(dest);

        // Créer et enregistrer le passeport
        Passeport passeport = new Passeport();
        passeport.setSourcePath(fileName);
        Reservation reservation = reservationRepository.findById(reservationId)
                .orElseThrow(() -> new IllegalArgumentException("Réservation invalide"));

        if (reservation!=null) {
            passeport.setReservation(reservation);    
        }
        passeportRepository.save(passeport);

        return "redirect:/passeports"; // Redirige vers la page de liste des passeports
    }
}
