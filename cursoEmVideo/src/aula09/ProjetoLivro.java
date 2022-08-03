package aula09;

public class ProjetoLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];

		p[0] = new Pessoa(22, "Thiago", "M");

		l[0] = new Livro("Manga", "Massami Kurumada", 1500, p[0]);
		
		l[0].abrir();
		l[0].avancarPag();
		l[0].detalhes();
	}

}
