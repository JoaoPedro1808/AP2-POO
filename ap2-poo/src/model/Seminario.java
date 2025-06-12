package model;

public class Seminario extends Evento{
    private String apresentacaotema;
    private String apresentacaoaluno;
    private String nomeorientador;

    public Seminario(String titulo, String data, String duracao, int orcamento, String local, Participante participante, String apresentacaotema, String apresentacaoaluno, String nomeorientador) {
        super(titulo, data, duracao, orcamento, local, participante);
        this.apresentacaotema = apresentacaotema;
        this.apresentacaoaluno = apresentacaoaluno;
        this.nomeorientador = nomeorientador;
    }

    public String getApresentacaotema() {
        return apresentacaotema;
    }

    public void setApresentacaotema(String apresentacaotema) {
        this.apresentacaotema = apresentacaotema;
    }

    public String getApresentacaoaluno() {
        return apresentacaoaluno;
    }

    public void setApresentacaoaluno(String apresentacaoaluno) {
        this.apresentacaoaluno = apresentacaoaluno;
    }

    public String getNomeorientador() {
        return nomeorientador;
    }

    public void setNomeorientador(String nomeorientador) {
        this.nomeorientador = nomeorientador;
    }
}
