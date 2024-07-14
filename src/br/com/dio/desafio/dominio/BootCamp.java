package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {
 private  String nome;
 private  String descricao;
 private final LocalDate dateInicial=LocalDate.now();//não será possivel alteração posterio
 private final LocalDate dataFinal=dateInicial.plusDays(45);//não será possivel alteração posterio

        private Set<Dev>DevsInscritos= new HashSet<>();
        private Set<Conteudo>conteudos=new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDateInicial() {
        return dateInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return DevsInscritos;
    }

    public void setDevsInscritos(Set<Dev> DevsInscritos) {
        this.DevsInscritos = DevsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(getNome(), bootCamp.getNome()) && Objects.equals(getDescricao(), bootCamp.getDescricao()) && Objects.equals(getDateInicial(), bootCamp.getDateInicial()) && Objects.equals(getDataFinal(), bootCamp.getDataFinal()) && Objects.equals(getDevsInscritos(), bootCamp.getDevsInscritos()) && Objects.equals(getConteudos(), bootCamp.getConteudos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getDateInicial(), getDataFinal(), getDevsInscritos(), getConteudos());
    }
}
