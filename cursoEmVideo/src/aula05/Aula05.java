package aula05;

public class Aula05 {

	public static void main(String[] args) {
		
		ContaBanco p1 = new ContaBanco();
		
		p1.setNumConta(111);
		p1.setDono("Thiago");
		p1.abrirConta("CC");
		
		ContaBanco p2 =  new ContaBanco();
		p2.setDono("Creuza");
		p2.abrirConta("CP");
		
		p1.depositar(300);
		p2.depositar(500);
		
		p1.estadoAtual();
		p2.estadoAtual();
		

	}

}
