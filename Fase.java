package sistema_academico;

import java.util.ArrayList;
import java.util.List;


class Fase {
    private int numero;
    private List<Disciplina> disciplinasOfertadas;

    public Fase(int numero) {
        this.numero = numero;
        this.disciplinasOfertadas = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public List<Disciplina> getDisciplinasOfertadas() {
        return disciplinasOfertadas;
    }
}
