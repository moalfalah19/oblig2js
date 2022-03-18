package com.example.obligjs2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@RequestMapping("/api")
@RestController
public class KundeController {

    private final List<Kunde> alleKunder = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreKunde(Kunde innKunde){
        alleKunder.add(innKunde);
    }

    @GetMapping("/hentAlle")
    public List<Kunde> hentAlle(){
        return alleKunder;
    }

@GetMapping("/nullstil")
    public void nullstil() {
        alleKunder.clear();

    }
}