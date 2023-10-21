package br.com.alaim.projectJson.entities;
import jakarta.persistence.*;

@Entity
@Table(name="tb_texto")
public class Texto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "menssage")
    private String menssage;

    public Texto(){
    }
    public Texto(Long id, String menssage) {
        this.id = id;
        this.menssage = menssage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMenssage() {
        return menssage;
    }

    public void setMenssage(String menssage) {
        this.menssage = menssage;
    }


    public String messageTexto(String msg){
        return msg;
    }


}
