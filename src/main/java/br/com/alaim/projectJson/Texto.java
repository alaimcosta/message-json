package br.com.alaim.projectJson;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity(name="tb_texto")
public class Texto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String menssage;


    public Texto(String menssage) {
        this.menssage = menssage;
    }

    public String getMessage() {
        return menssage;
    }
}
