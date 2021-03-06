package model;

import java.util.List;

public class Filme implements Cloneable {
    private String nome;
    private String id;
    private String lancamento;
    private String sinopse;
    private String duracao;
    private String nacionalidade;
    private List<String> diretor;
    private List<String> elenco;

    public Filme(String nome, String id, String lancamento, String sinopse, String duracao, String nacionalidade) {
        this.nome = nome;
        this.id = id;
        this.lancamento = lancamento;
        this.sinopse = sinopse;
        this.duracao = duracao;
        this.nacionalidade = nacionalidade;
    }

    @Override
    public Filme clone() throws CloneNotSupportedException {
        Filme clonado = (Filme) super.clone();
        return clonado;
    }

    public String infoFilme() {
        return "Filme{'" +
                nome + '\'' +
                ", Ano de lançamento: '" + lancamento + '\'' +
                ", Sinopse: '" + sinopse + '\'' +
                ", Duração: '" + duracao + '\'' +
                ", Nacionalidade: '" + nacionalidade + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public List<String> getDiretor() {
        return diretor;
    }

    public void setDiretor(List<String> diretor) {
        this.diretor = diretor;
    }

    public List<String> getElenco() {
        return elenco;
    }

    public void setElenco(List<String> elenco) {
        this.elenco = elenco;
    }
}
