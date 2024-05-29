package a3saulo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Task {

    private String titulo;
    private String descricao;
    private LocalDate prazo;
    

    public Task(String titulo, String descricao, LocalDate prazo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        
    
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

}
