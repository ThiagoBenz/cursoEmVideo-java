package aula10;

public class Aluno extends Pessoa {

	private int matricula;
	private String curso;

	public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
		super(nome, idade, sexo);

		this.setCurso(curso);
		this.setMatricula(matricula);
	}

	/**
	 * @return the matricula
	 */
	public int getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}

}
