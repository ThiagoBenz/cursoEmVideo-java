package aula06;

import java.util.Iterator;

public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;

	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	/**
	 * @return the volume
	 */
	private int getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	private void setVolume(int volume) {
		this.volume = volume;
	}

	/**
	 * @return the ligado
	 */
	private boolean isLigado() {
		return ligado;
	}

	/**
	 * @param ligado the ligado to set
	 */
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	/**
	 * @return the tocando
	 */
	private boolean isTocando() {
		return tocando;
	}

	/**
	 * @param tocando the tocando to set
	 */
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	public void status() {
		System.out.println("volume: " + getVolume());
		System.out.println("ligado:" + isLigado());
		System.out.println("tocando" + isTocando());
	}

	@Override
	public void ligar() {
		this.setLigado(true);

	}

	@Override
	public void desligar() {
		this.setLigado(false);

	}

	@Override
	public void abrirMenu() {
		System.out.println("ligado: " + isLigado());
		System.out.println("tocando: " + isTocando());
		System.out.print("volume: " + getVolume());
		for (int i = 0; i < getVolume(); i += 5) {
			System.out.print(" -");

		}
	}

	@Override
	public void fecharMenu() {
		// TODO Auto-generated method stub
		System.out.println("fechando menu...");
	}

	@Override
	public void maisVolume() {
		// TODO Auto-generated method stub
		if (this.isLigado()) {
			this.setVolume(getVolume() + 5);
		}
	}

	@Override
	public void menosVoume() {
		// TODO Auto-generated method stub
		if (this.isLigado()) {
			this.setVolume(getVolume() - 5);
		}
	}

	@Override
	public void ligarMudo() {
		if (this.isLigado() && this.getVolume()>0) {
			this.setVolume(0);	
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void desligarMudo() {
		if (isLigado() && getVolume() ==0) {
			this.setVolume(50);
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void play() {
		if (this.isLigado() && !(this.isTocando())) {
			this.setTocando(true);
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		if (this.isLigado() && this.isTocando()) {
			this.setTocando(false);
		}
		// TODO Auto-generated method stub

	}

}
