package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Curso extends Conteudo{

    private int cargahoraria;


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

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargahoraria;
    }
}
