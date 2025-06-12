package model;

public class Organizador extends PessoaResponsavel{
    private String nome;
    private String email;
    private String funcao;

    public Organizador(String cpf, String cod, String nome, String email, String funcao) {
        super(cpf, cod);
        this.nome = nome;
        this.email = email;
        this.funcao = funcao;
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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
