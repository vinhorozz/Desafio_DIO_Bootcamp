package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Curso {

    private String titulo;
    private String descriao;
    private int cargahoraria;


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

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descriao='" + descriao + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }
}
