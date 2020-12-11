package Trabalho3;

public class teste {
	public static void main(String[] args) {

		// Os nomes dos vertices sao numeros inteiros.
		
		// exemplo 1 - Com ciclo
		Grafo g1 = new Grafo(2);
		g1.addArresta(1, 0);
		g1.addArresta(0, 0);

		System.out.println("-------------- Exemplo 1 --------------");
		new AlgoritmoRobertsEFlores(g1);
		System.out.println();

		// exemplo 2 - Sem ciclo
		Grafo g2 = new Grafo(5);
		g2.addArresta(0, 1);
		g2.addArresta(0, 2);
		g2.addArresta(0, 3);
		g2.addArresta(1, 2);
		g2.addArresta(1, 3);
		g2.addArresta(2, 3);
		g2.addArresta(4, 2);

		System.out.println("-------------- Exemplo 2 --------------");
		new AlgoritmoRobertsEFlores(g2);
	}
}
