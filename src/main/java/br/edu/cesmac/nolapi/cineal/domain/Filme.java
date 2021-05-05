package br.edu.cesmac.nolapi.cineal.domain;

import javax.persistence.*;

@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFilme;
    private String titulo;
    private String subtitulo;
    private String ano;
    private String produtor;
    private String genero;
    private String idade;
    private String duracao;
    private String resolucao;

    @OneToOne
    private Sessao sessao;

    public Filme(){

    }

    public Filme(Long idFilme, String titulo, String subtitulo, String ano, String produtor, String genero, String idade, String duracao, String resolucao){
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.ano = ano;
        this.produtor = produtor;
        this.genero = genero;
        this.idade = idade;
        this.duracao = duracao;
        this.resolucao = resolucao;
    }

    public Long getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(Long idFilme) {
        this.idFilme = idFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

}
