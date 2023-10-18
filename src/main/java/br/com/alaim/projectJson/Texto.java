package br.com.alaim.projectJson;

import jakarta
import lombok.Data;

@Data
@Entity("tb")
public class Texto {

    private String menssage;


    public Texto(String menssage) {
        this.menssage = menssage;
    }

    public String getMessage() {
        return menssage;
    }
}
