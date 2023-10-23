package sistema_academico;

import java.util.ArrayList;
import java.util.List;

class OfertaDisciplina {
    public static List<Disciplina> getDisciplinasComputacao() {
        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(new Disciplina("Algoritmos e Estruturas de Dados", 100));
        disciplinas.add(new Disciplina("Banco de Dados", 75));
        disciplinas.add(new Disciplina("Programação Web", 90));
        disciplinas.add(new Disciplina("Sistemas Operacionais", 80));
        disciplinas.add(new Disciplina("Redes de Computadores", 100));
        disciplinas.add(new Disciplina("Inteligência Artificial", 70));
        disciplinas.add(new Disciplina("Engenharia de Software", 85));
        disciplinas.add(new Disciplina("Segurança da Informação", 95));
        disciplinas.add(new Disciplina("Desenvolvimento Mobile", 70));
        disciplinas.add(new Disciplina("Computação em Nuvem", 80));

        return disciplinas;
    }

    public static List<Disciplina> getDisciplinasMatematica() {
        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(new Disciplina("Cálculo I", 90));
        disciplinas.add(new Disciplina("Álgebra Linear", 80));
        disciplinas.add(new Disciplina("Geometria Analítica", 70));
        disciplinas.add(new Disciplina("Estatística", 75));
        disciplinas.add(new Disciplina("Teoria dos Números", 65));
        disciplinas.add(new Disciplina("Equações Diferenciais", 80));
        disciplinas.add(new Disciplina("Geometria Diferencial", 70));
        disciplinas.add(new Disciplina("Matemática Discreta", 60));
        disciplinas.add(new Disciplina("Probabilidade", 75));
        disciplinas.add(new Disciplina("Topologia", 85));
        return disciplinas;
    }
    
    
}
