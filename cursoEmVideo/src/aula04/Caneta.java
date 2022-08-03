package aula04;

public class Caneta {
	private String modelo;
	private double ponta;
	private String cor;
	private boolean tampada;
	
	
	public  Caneta() {
		tampar();
		setModelo("BIC");
		setCor("Azul");
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPonta() {
		return ponta;
	}
	public void setPonta(double ponta) {
		this.ponta = ponta;
	}
	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("SOBRE A CANETA:");
		System.out.println("modelo:"+this.getModelo());
		System.out.println("cor:");
		System.out.println("ponta:"+this.getPonta());
		System.out.println("tampada:"+this.isTampada());
		
	}
}
