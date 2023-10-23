package sistema_academico;

class Professor {
    private String nome;
    private boolean presenca;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

	public boolean getPresenca() {
		return presenca;
	}
}

