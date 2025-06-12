package model;

import java.util.HashSet;
import java.util.Set;

public class Minicurso extends Evento{
    private String materiasdeaopio;
    private int cargahoraria;
    private Set<Instrutor> instrutores;

    public Minicurso(String titulo, String data, String duracao, int orcamento, String local, Participante participante, String materiasdeaopio, int cargahoraria) {
        super(titulo, data, duracao, orcamento, local, participante);
        this.materiasdeaopio = materiasdeaopio;
        this.cargahoraria = cargahoraria;
        this.instrutores = new HashSet<Instrutor>();
    }

    public String getMateriasdeaopio() {
        return materiasdeaopio;
    }

    public void setMateriasdeaopio(String materiasdeaopio) {
        this.materiasdeaopio = materiasdeaopio;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public Set<Instrutor> getInstrutores() {
        return instrutores;
    }

    public void setInstrutores(Set<Instrutor> instrutores) {
        this.instrutores = instrutores;
    }

    public void addinstrutor(Instrutor instrutor) {
        this.instrutores.add(instrutor);
    }

    public void removeinstrutor(Instrutor instrutor) {
        this.instrutores.remove(instrutor);
    }
}
