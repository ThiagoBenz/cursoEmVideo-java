package aula09;

public class Livro implements Publicacao {

	private String livro, autor;
	private boolean aberto;
	private int totPaginas, pagAtual;
	private Pessoa leitor;

	public Livro(String livro, String autor, int totPaginas, Pessoa leitor) {
		super();
		this.setLivro(livro);
		this.setAutor(autor);
		this.setTotPaginas(totPaginas);
		this.setLeitor(leitor);
		this.setAberto(false);
		this.setPagAtual(0);
	}

	public void detalhes() {
		System.out.println("--------------------------");
		System.out.println("Livro: " + this.getLivro());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de paginas: " + getTotPaginas());
		System.out.println("Lido por " + this.getLeitor().getNome() + " de " + this.getLeitor().getIdade()
				+ " anos e do sexo " + this.getLeitor().getSexo());
		System.out.println("Pagina Atual: " + this.getPagAtual());
	}

	@Override
	public void abrir() {
		if (!aberto) {
			this.setAberto(true);
		} else {
			return;
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		if (aberto) {
			this.setAberto(false);
		} else {
			return;
		}
	}

	@Override
	public void folhear(int p) {
		// TODO Auto-generated method stub
		if (aberto && p>0) {
			this.setPagAtual(p);

		}

	}

	@Override
	public void avancarPag() {
		// TODO Auto-generated method stub
		if (aberto) {
			this.setPagAtual(getPagAtual() + 1);

		}

	}

	@Override
	public void voltarPag() {
		// TODO Auto-generated method stub
		if (getPagAtual() > 0) {
			this.setPagAtual(getPagAtual() - 1);
		}

	}

	/**
	 * @return the livro
	 */
	public String getLivro() {
		return livro;
	}

	/**
	 * @param livro the livro to set
	 */
	public void setLivro(String livro) {
		this.livro = livro;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the aberto
	 */
	public boolean isAberto() {
		return aberto;
	}

	/**
	 * @param aberto the aberto to set
	 */
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	/**
	 * @return the totPaginas
	 */
	public int getTotPaginas() {
		return totPaginas;
	}

	/**
	 * @param totPaginas the totPaginas to set
	 */
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	/**
	 * @return the pagAtual
	 */
	public int getPagAtual() {
		return pagAtual;
	}

	/**
	 * @param pagAtual the pagAtual to set
	 */
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	/**
	 * @return the leitor
	 */
	public Pessoa getLeitor() {
		return leitor;
	}

	/**
	 * @param leitor the leitor to set
	 */
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

}
