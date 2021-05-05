package br.edu.cesmac.nolapi.cineal.domain;

import javax.persistence.*;

@Entity
public class Sessao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSessao;
    private String tipoFilme;
    private String horario;
    private String data;
    private String sala;

    @ManyToOne
    private Filme filme;

    public Sessao(){

    }

    public Sessao(Long idSessao, String tipoFilme, String horario, String data, String sala){
        this.idSessao = idSessao;
        this.tipoFilme = tipoFilme;
        this.horario = horario;
        this.data = data;
        this.sala = sala;
    }

    public Long getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(Long idSessao) {
        this.idSessao = idSessao;
    }

    public String getTipoFilme() {
        return tipoFilme;
    }

    public void setTipoFilme(String tipoFilme) {
        this.tipoFilme = tipoFilme;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
