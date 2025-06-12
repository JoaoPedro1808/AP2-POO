package model;

public class PessoaResponsavel {
    private String cpf;
    private String cod;

    public PessoaResponsavel(String cpf, String cod) {
        this.cpf = cpf;
        this.cod = cod;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
}
