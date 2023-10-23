package sistema_academico;

import java.util.ArrayList;
import java.util.List;

class OfertaDisciplina {
    public static List<Disciplina> getDisciplinasComputacao() {
        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(new Disciplina("Algoritmos e Estruturas de Dados", 100));
        disciplinas.add(new Disciplina("Banco de Dados", 75));
        disciplinas.add(new Disciplina("Programa��o Web", 90));
        disciplinas.add(new Disciplina("Sistemas Operacionais", 80));
        disciplinas.add(new Disciplina("Redes de Computadores", 100));
        disciplinas.add(new Disciplina("Intelig�ncia Artificial", 70));
        disciplinas.add(new Disciplina("Engenharia de Software", 85));
        disciplinas.add(new Disciplina("Seguran�a da Informa��o", 95));
        disciplinas.add(new Disciplina("Desenvolvimento Mobile", 70));
        disciplinas.add(new Disciplina("Computa��o em Nuvem", 80));

        return disciplinas;
    }

    public static List<Disciplina> getDisciplinasMatematica() {
        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(new Disciplina("C�lculo I", 90));
        disciplinas.add(new Disciplina("�lgebra Linear", 80));
        disciplinas.add(new Disciplina("Geometria Anal�tica", 70));
        disciplinas.add(new Disciplina("Estat�stica", 75));
        disciplinas.add(new Disciplina("Teoria dos N�meros", 65));
        disciplinas.add(new Disciplina("Equa��es Diferenciais", 80));
        disciplinas.add(new Disciplina("Geometria Diferencial", 70));
        disciplinas.add(new Disciplina("Matem�tica Discreta", 60));
        disciplinas.add(new Disciplina("Probabilidade", 75));
        disciplinas.add(new Disciplina("Topologia", 85));
        return disciplinas;
    }
    
    
}
