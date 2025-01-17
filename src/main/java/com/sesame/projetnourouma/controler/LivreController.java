package com.sesame.projetnourouma.controler;

import com.sesame.projetnourouma.entities.Livre;
import com.sesame.projetnourouma.service.ILivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livre")
public class LivreController {
    @Autowired
    private ILivreService livreService;
    @GetMapping("/getAll")
    public List<Livre> getAllLivres() {
        return livreService.retrieveAllLivres();
    }

    @GetMapping("/get/{id}")
    public Livre getLivreById(@PathVariable int id) {
        return livreService.retrieveLivreById(id);
    }

    @PostMapping("/add")
    public Livre addLivre(@RequestBody Livre livre) {
        return livreService.addLivre(livre);
    }

    @PutMapping("/update")
    public Livre updateLivre(@RequestBody Livre livre) {
        return livreService.updateLivre(livre);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteLivre(@PathVariable int id) {
        livreService.deleteLivreById(id);
    }
}

