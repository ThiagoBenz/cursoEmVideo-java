package aula07;

import java.util.Random;

public class Luta {

	private Lutador desafiante;
	private Lutador desafiado;
	private int rounds;
	private boolean aprovada;

	/**
	 * @return the desafiante
	 */
	private Lutador getDesafiante() {
		return desafiante;
	}

	/**
	 * @param desafiante the desafiante to set
	 */
	private void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	/**
	 * @return the desafiado
	 */
	private Lutador getDesafiado() {
		return desafiado;
	}

	/**
	 * @param desafiado the desafiado to set
	 */
	private void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	/**
	 * @return the rounds
	 */
	public int getRounds() {
		return rounds;
	}

	/**
	 * @param rounds the rounds to set
	 */
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	/**
	 * @return the aprovada
	 */
	private boolean isAprovada() {
		return aprovada;
	}

	/**
	 * @param aprovada the aprovada to set
	 */
	private void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	public void marcarLuta(Lutador l1, Lutador l2) {

		this.setDesafiante(l1);
		this.setDesafiado(l2);

		if ((this.desafiante.getCategoria() == this.desafiado.getCategoria()) && (desafiante != desafiado)) {
			this.setAprovada(true);
			this.desafiante = l1;
			this.desafiado = l2;
			System.out.println("Luta marcada com sucesso!");
			System.out.println();
		} else {
			this.setDesafiado(null);
			this.setDesafiante(null);

			System.out.println("Luta nao pode ser marcada");
		}

	}

	public void lutar() {
		if (this.isAprovada()) {
			System.out.println("DESAFIANTE:");
			this.desafiado.apresentar();
			System.out.println();
			System.out.println("DESAFIADO:");
			this.desafiante.apresentar();

			Random rndmRandom = new Random();
			int vencedor = rndmRandom.nextInt(3);
			switch (vencedor) {
			case 0: // empate
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				System.out.println();
				System.out.println("luta empatada entre " + desafiante.getNome() + " e " + desafiado.getNome());
				break;
			case 1: // vitoria
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				System.out.println();
				System.out.println("Luta vencida pelo " + desafiante.getNome());
				break;
			case 2: // derrota
				this.desafiante.perderLuta();
				this.desafiado.ganharLuta();
				System.out.println();
				System.out.println( "Luta vencida pelo " + desafiado.getNome());
				break;
			default:
				break;
			}
		} else {
			System.out.println("Luta nao pode acontecer");
		}

	}

}
