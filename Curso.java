package sistema_academico;

import java.util.ArrayList;
import java.util.List;


class Curso {
    private String nome;
    private List<Fase> fases;

    public Curso(String nome) {
        this.nome = nome;
        this.fases = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Fase getFaseDoAluno(Aluno aluno) {
        for (Fase fase : fases) {
            for (Disciplina disciplina : fase.getDisciplinasOfertadas()) {
                if (aluno.getDisciplinasMatriculadas().contains((CharSequence) disciplina)) {
                    return fase;
                }
            }
        }
        return null;
    }
}