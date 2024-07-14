package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO=10;

    protected String titulo;
    protected String descriao;


    public abstract double calcularXp();

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
}
