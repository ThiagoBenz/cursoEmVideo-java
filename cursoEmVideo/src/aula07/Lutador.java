package aula07;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private double peso;
	private double altura;
	private String categoria;
	private int vitorias, derrotas, empates;

	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
			int empates) {

		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.setPeso(peso);
		this.altura = altura;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	// ---------------------------------------------------------------------------------

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	private void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the nacionalidade
	 */
	private String getNacionalidade() {
		return nacionalidade;
	}

	/**
	 * @param nacionalidade the nacionalidade to set
	 */
	private void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	/**
	 * @return the idade
	 */
	private int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	private void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the peso
	 */
	private double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	private void setPeso(double peso) {
		this.peso = peso;
		setCategoria(peso);
	}

	/**
	 * @return the altura
	 */
	private double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	private void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return this.categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	private void setCategoria(Double peso) {
		if (peso < 52.2) {
			this.categoria = "Invalido";
		} else if ((peso >= 52.2) && (peso <= 70.3)) {
			this.categoria = "Leve";
		} else if ((peso > 70.3) && (peso < 83.9)) {
			this.categoria = "Medio";
		} else if (peso < 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Invalido";
		}

	}

	/**
	 * @return the vitorias
	 */
	private int getVitorias() {
		return vitorias;
	}

	/**
	 * @param vitorias the vitorias to set
	 */
	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	/**
	 * @return the derrotas
	 */
	private int getDerrotas() {
		return derrotas;
	}

	/**
	 * @param derrotas the derrotas to set
	 */
	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	/**
	 * @return the empates
	 */
	private int getEmpates() {
		return empates;
	}

	/**
	 * @param empates the empates to set
	 */
	private void setEmpates(int empates) {
		this.empates = empates;
	}
	// ----------------------------------------------------------------------

	public void apresentar() {
		System.out.println("----APRESENTACAO----");
		System.out.println("Nome: " + getNome());
		System.out.println("Nacionalidade: " + getNacionalidade());
		System.out.println("Idade: " + getIdade());
		System.out.println("Altura: " + getAltura());
		System.out.println("Peso: "+getPeso());
		System.out.println("Vitorias: "+getVitorias());
		System.out.println("Derrotas: "+getDerrotas());
		System.out.println("Empates: "+getEmpates());

	}

	public void Status() {
		System.out.println("------------------------");
		System.out.println("Nome: " + getNome());
		System.out.println("Vitorias: "+getVitorias());
		System.out.println("Derrotas: "+getDerrotas());
		System.out.println("Empates: "+getEmpates());


	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

}
