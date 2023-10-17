package br.com.alaim.projectJson;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MensageController {


    @GetMapping("/menssage")
    @ResponseBody
    public Texto getMessage() {
        Texto msg = new Texto("hello, word!");
        return msg;
    }


}
