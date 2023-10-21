package br.com.alaim.projectJson.controller;

import br.com.alaim.projectJson.entities.Texto;
import br.com.alaim.projectJson.repositories.TextoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menssage")
public class MensageController {

    @Autowired
    private TextoRepository textoRepository;

//    @GetMapping("/")
//    @ResponseBody
//    public Texto getTexto() {
//        Texto msg = new Texto("hello, word!");
//        return msg;
//    }
    @GetMapping("/{id}")
    public Texto getUserById(@PathVariable Long id) {
        return textoRepository.findById(id).get();

    }
    @PostMapping("/")
    public Texto createTexto(Texto texto) {
        return textoRepository.save(texto);
    }

}
