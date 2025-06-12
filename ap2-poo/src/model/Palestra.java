package model;

public class Palestra extends Evento{
    private String nomepalestrante;
    private String emailpalestrante;
    private String instituicaopalestrante;

    public Palestra(String titulo, String data, String duracao, int orcamento, String local, Participante participante, String nomepalestrante, String emailpalestrante, String instituicaopalestrante) {
        super(titulo, data, duracao, orcamento, local, participante);
        this.nomepalestrante = nomepalestrante;
        this.emailpalestrante = emailpalestrante;
        this.instituicaopalestrante = instituicaopalestrante;
    }

    public String getNomepalestrante() {
        return nomepalestrante;
    }

    public void setNomepalestrante(String nomepalestrante) {
        this.nomepalestrante = nomepalestrante;
    }

    public String getEmailpalestrante() {
        return emailpalestrante;
    }

    public void setEmailpalestrante(String emailpalestrante) {
        this.emailpalestrante = emailpalestrante;
    }

    public String getInstituicaopalestrante() {
        return instituicaopalestrante;
    }

    public void setInstituicaopalestrante(String instituicaopalestrante) {
        this.instituicaopalestrante = instituicaopalestrante;
    }
}
