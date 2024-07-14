package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {

    private String titulo;
    private String descriao;
    private LocalDate data;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescriao() {
        return descriao;
    }

    public void setDescriao(String descriao) {
        this.descriao = descriao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentorias{" +
                "titulo='" + titulo + '\'' +
                ", descriao='" + descriao + '\'' +
                ", data=" + data +
                '}';
    }
}
