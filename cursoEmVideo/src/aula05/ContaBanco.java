package aula05;

public class ContaBanco {

	public int numConta;
	private String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public void estadoAtual() {
		
		System.out.println("-------------------------");
		System.out.println("Conta: " +this.getNumConta());
		System.out.println("Dono: " +this.getDono());
		System.out.println("tipo: " +this.getTipo());
		System.out.println("Saldo: " +this.getSaldo());
		System.out.println("Status: " +this.isStatus());

	}

	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);

	}

	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
			System.out.println("conta aberta");
		} else if (t == "CP") {
			this.setSaldo(150);
			System.out.println("conta aberta");

		}
	}

	public void fecharConta(int num) {
		if (this.getSaldo() == 0) {
			this.setStatus(false);
			System.out.println("conta fechada");
			return;
		} else {
			System.out.println("impossivel fechar conta! verifique o saldo");
		}
	}

	public void depositar(double d) {
		if (this.isStatus()) {
			this.setSaldo(this.getSaldo() + d);
		} else {
			System.out.println("impossivel depositar");
		}
	}

	public void sacar(double d) {
		if (this.isStatus()) {
			if (this.getSaldo() >= d) {
				this.setSaldo(this.getSaldo() - d);
			} else {
				System.out.println("saldo insuficiente");
			}

		} else {
			System.out.println("impossivel sacar!");
		}

	}

	public void pagarMensal() {
		
		if (this.isStatus() != true) {
			System.out.println("Conta fechada!");
			return;
		} else {
			int v = 0;
			if (this.getTipo() == "CC") {
				v = 12;
			} else if (this.getTipo() == "CP") {
				v = 20;
			}
			this.setSaldo(this.getSaldo() - v);
		}

	}

	/**
	 * @return the numConta
	 */
	public int getNumConta() {
		return numConta;
	}

	/**
	 * @param numConta the numConta to set
	 */
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the dono
	 */
	public String getDono() {
		return dono;
	}

	/**
	 * @param dono the dono to set
	 */
	public void setDono(String dono) {
		this.dono = dono;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

}
