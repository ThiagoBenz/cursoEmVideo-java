package aula03;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;

	
	public void status() {
		System.out.println("modelo: "+this.modelo);
		System.out.println("cor: "+this.cor);
		System.out.println("ponta: "+this.ponta);
		System.out.println("carga: "+this.carga);
		System.out.println("tampada: "+this.tampada);
	}
	
	public void rabiscar() {
		if (tampada==true) {
			System.out.println("erro! caneta esta tampada!");
		} else {
			System.out.println("caneta tampada!");
		}
	}
	
	private void tampar() {
		this.tampada = true;
	}
	
	private void destampar() {
		this.tampada = false;
	}
	
}
