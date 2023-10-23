package sistema_academico;

class RegistroFrequencia {
    private Professor professor;
    private Aluno aluno;
    private boolean presenca;

    public RegistroFrequencia(Professor professor, Aluno aluno, boolean presenca) {
        this.setProfessor(professor);
        this.setAluno(aluno);
        this.setPresenca(presenca);
    }

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public boolean isPresenca() {
		return presenca;
	}

	public void setPresenca(boolean presenca) {
		this.presenca = presenca;
	}
}

