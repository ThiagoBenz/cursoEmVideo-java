package aula10;

public class Pessoa {

	private int idade;
	private String sexo, nome;

	public Pessoa(String nome, int idade, String sexo) {

		this.setIdade(idade);
		this.setSexo(sexo);
		this.setNome(nome);
	}

	public void fazerAniv() {
		this.setIdade(getIdade() + 1);
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
}
