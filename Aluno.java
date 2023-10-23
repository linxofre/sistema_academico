package sistema_academico;

import java.util.ArrayList;
import java.util.List;

class Aluno {
    private String nome;
    private String matricula;
    private Curso curso;
    private List<Disciplina> disciplinasMatriculadas;

    public Aluno(String nome, String matricula, Curso curso) {
        this.nome = nome;
        this.setMatricula(matricula);
        this.curso = curso;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    public void matricularDisciplina(Disciplina disciplina) {
        this.disciplinasMatriculadas.add(disciplina);
    }

    public void registrarFrequencia(Disciplina disciplina, Professor professor, boolean presenca) {
        disciplina.registrarFrequencia(professor, this, presenca);
    }

    public void registrarAvaliacao(Disciplina disciplina, Professor professor, double nota) {
        disciplina.registrarAvaliacao(professor, this, nota);
    }

    public void exibirInformacoes() {
        System.out.println("Informações do Aluno:");
        System.out.println("1 - Nome do Aluno: " + nome);
        System.out.println("2 - Curso em que está matriculado: " + curso.getNome());
        Fase fase = curso.getFaseDoAluno(this);
        if (fase != null) {
            System.out.println("3 - Fase em que está: " + fase.getNumero());
        }
        System.out.println("4 - Matérias em que está matriculado:");
        for (Disciplina disciplina : disciplinasMatriculadas) {
            System.out.println("   - " + disciplina.getNome());
            System.out.println("   - Carga Horária: " + disciplina.getCargaHoraria() + " horas");
            System.out.println("   - Professor: " + (disciplina.getRegistroFrequencia() != null ? disciplina.getRegistroFrequencia().getNome() : "N/A"));
            System.out.println("   - Registro de Frequência: " + (disciplina.getRegistroFrequencia() != null ? disciplina.getRegistroFrequencia().getPresenca() : "N/A"));
            System.out.println("   - Registro de Avaliações:");
            for (RegistroAvaliacao registro : disciplina.getRegistrosAvaliacao()) {
                System.out.println("     - Nota: " + registro.getNota());
            }
        }
    }

	public String getDisciplinasMatriculadas() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}