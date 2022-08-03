package aula09;

public class Pessoa {
	private int idade;
	private String nome, sexo;

	public Pessoa(int idade, String nome, String sexo) {
		super();
		this.setIdade(idade);
		this.setNome(nome);
		this.setSexo(sexo);
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void fazerAniversario() {
		setIdade(getIdade() + 1);
	}

}
