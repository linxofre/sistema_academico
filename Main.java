package sistema_academico;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Engenharia de Computação");
        Curso curso2 = new Curso("Matemática");
        Fase fase1 = new Fase(1);
        Fase fase2 = new Fase(2);
        
        List<Disciplina> disciplinasComputacao = OfertaDisciplina.getDisciplinasComputacao();
        List<Disciplina> disciplinasMatematica = OfertaDisciplina.getDisciplinasMatematica();
        
        Professor professor1 = new Professor("Profª. Mary");
        Professor professor2 = new Professor("Profª. Dani");
        Professor professor3 = new Professor("Prof. Survelino");
        
        Aluno aluno1 = new Aluno("Ricardo", "12345", curso1);
        Aluno aluno2 = new Aluno("Marcia", "52461", curso1);
        Aluno aluno3 = new Aluno("Anúbia", "98754", curso2);

        fase1.getDisciplinasOfertadas().addAll(disciplinasComputacao.subList(0, 5));
        fase2.getDisciplinasOfertadas().addAll(disciplinasMatematica.subList(0, 5));

        for (Disciplina disciplina : fase1.getDisciplinasOfertadas()) {
            disciplina.adicionarProfessor(professor1);
            aluno1.matricularDisciplina(disciplina);
            aluno1.registrarFrequencia(disciplina, professor1, true);
            aluno1.registrarAvaliacao(disciplina, professor1, 9.0);
            
            aluno2.matricularDisciplina(disciplina);
            aluno2.registrarFrequencia(disciplina, professor2, true);
            aluno2.registrarAvaliacao(disciplina, professor2, 5.0);
        }
        for (Disciplina disciplina : fase1.getDisciplinasOfertadas()) {
            disciplina.adicionarProfessor(professor3);
            aluno3.matricularDisciplina(disciplina);
            aluno3.registrarFrequencia(disciplina, professor3, true);
            aluno3.registrarAvaliacao(disciplina, professor3, 6.0); 
        }

        aluno1.exibirInformacoes();
        aluno2.exibirInformacoes();
        aluno3.exibirInformacoes();
    }
}
