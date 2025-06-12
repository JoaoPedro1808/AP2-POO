package model;

public class Instrutor extends PessoaResponsavel{
    private String nome;
    private String email;
    private String formacao;
    private String especializacao;
    private Minicurso minicurso;

    public Instrutor(String cpf, String cod, String nome, String email, String formacao, String especializacao, Minicurso minicurso) {
        super(cpf, cod);
        this.nome = nome;
        this.email = email;
        this.formacao = formacao;
        this.especializacao = especializacao;
        this.minicurso = minicurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public Minicurso getMinicurso() {
        return minicurso;
    }

    public void setMinicurso(Minicurso minicurso) {
        this.minicurso = minicurso;
    }
}
