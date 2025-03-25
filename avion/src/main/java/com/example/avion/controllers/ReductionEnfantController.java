package com.example.avion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.avion.models.PromtionEnfant.ReductionEnfant;
import com.example.avion.repositories.ReductionEnfantRepository;

import java.util.List;

@Controller
@RequestMapping("/reductions")
public class ReductionEnfantController {

    private final ReductionEnfantRepository repository;

    public ReductionEnfantController(ReductionEnfantRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String getAllReductions(Model model) {
        List<ReductionEnfant> reductions = repository.findAll();
        model.addAttribute("reductions", reductions);
        return "reductions/list";  // Correspond à /templates/reductions/list.html
    }

    @GetMapping("/ajouter")
    public String showAddForm(Model model) {
        model.addAttribute("reduction", new ReductionEnfant());
        return "reductions/add";  // Correspond à /templates/reductions/add.html
    }

    @PostMapping("/ajouter")
    public String addReduction(@ModelAttribute ReductionEnfant reduction) {
        repository.save(reduction);
        return "redirect:/reductions";
    }

    @GetMapping("/supprimer/{id}")
    public String deleteReduction(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/reductions";
    }
}
