package sistema_academico;

import java.util.ArrayList;
import java.util.List;


class Disciplina {
    private String nome;
    private List<Professor> professores;
    private Professor registroFrequencia;
    private Professor registroAvaliacao;
    private List<RegistroFrequencia> registrosFrequencia;
    private List<RegistroAvaliacao> registrosAvaliacao;
    private int cargaHoraria;

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.professores = new ArrayList<>();
        this.registrosFrequencia = new ArrayList<>();
        this.registrosAvaliacao = new ArrayList<>();
    
    }

    public void adicionarProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public void registrarFrequencia(Professor professor, Aluno aluno, boolean presenca) {
        if (professores.contains(professor)) {
            RegistroFrequencia registro = new RegistroFrequencia(professor, aluno, presenca);
            registrosFrequencia.add(registro);
            registroFrequencia = professor;
            System.out.println("Frequência registrada por " + professor.getNome());
        } else {
            System.out.println("Este professor não está autorizado a registrar frequência para esta disciplina.");
        }
    }

    public void registrarAvaliacao(Professor professor, Aluno aluno, double nota) {
        if (professores.contains(professor)) {
            RegistroAvaliacao registro = new RegistroAvaliacao(professor, aluno, nota);
            registrosAvaliacao.add(registro);
            setRegistroAvaliacao(professor);
            System.out.println("Avaliação registrada por " + professor.getNome());
        } else {
            System.out.println("Este professor não está autorizado a registrar avaliações para esta disciplina.");
        }
    }

    public String getNome() {
        return nome;
    }

    public Professor getRegistroFrequencia() {
        return registroFrequencia;
    }

    public List<RegistroAvaliacao> getRegistrosAvaliacao() {
        return registrosAvaliacao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

	public Professor getRegistroAvaliacao() {
		return registroAvaliacao;
	}

	public void setRegistroAvaliacao(Professor registroAvaliacao) {
		this.registroAvaliacao = registroAvaliacao;
	}
}
