package br.com.alaim.projectJson;

import br.com.alaim.projectJson.repositories.TextoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MensageController {

    @Autowired
    private TextoRepository textoRepository;

    @GetMapping("/menssage")
    @ResponseBody
    public Texto getMessage() {
        Texto msg = new Texto("hello, word!");
        return msg;
    }

    @GetMapping
    public List<Texto> getAllUsers() {
        return textoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Texto getUserById(@PathVariable Long id) {
        return textoRepository.findById(id).get();

    }

    @PostMapping("/menssage")
    public Texto createTexto(Texto texto) {
        return textoRepository.save(texto);
    }

}
