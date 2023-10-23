package sistema_academico;

class RegistroAvaliacao {
    private Professor professor;
    private Aluno aluno;
    private double nota;

    public RegistroAvaliacao(Professor professor, Aluno aluno, double nota) {
        this.setProfessor(professor);
        this.setAluno(aluno);
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}
