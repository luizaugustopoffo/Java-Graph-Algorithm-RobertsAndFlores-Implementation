package Trabalho3;

import java.util.LinkedList;

public class AlgoritmoRobertsEFlores {
	private LinkedList<Vertice> listaVertices;
	private int qtdVerticesGrafo;
	private Vertice verticeInicial;
	private boolean ehHamiltoniano;

	public AlgoritmoRobertsEFlores(Grafo g) {
		ehHamiltoniano = false;
		listaVertices = new LinkedList<>();
		qtdVerticesGrafo = g.getVertices().length;

		// O algoritmo de RobertsEFlores implementado aqui define o 0 como vertice
		// inicial, porém algoritmo funciona comecando por qualquer vertice.
		verticeInicial = g.getVertices()[0];

		listaVertices.add(verticeInicial);
		percorreVertice(verticeInicial);

		if (!ehHamiltoniano) {
			imprimeResultado();
		}
	}

	private void percorreVertice(Vertice v) {
		for (int i = 0; i < v.getAdj().size(); i++) {

			if (ehHamiltoniano) {
				break;
			}

			Vertice verticeAdj = v.getAdj().get(i);

			if (!listaVertices.contains(verticeAdj)) {
				listaVertices.add(verticeAdj);

				// Verifica se encontrou um ciclo hamiltoniano
				if (listaVertices.size() == qtdVerticesGrafo
						&& listaVertices.get(0).getAdj().contains(listaVertices.get(listaVertices.size() - 1))) {
					ehHamiltoniano = true;
					imprimeResultado();
				}
				percorreVertice(verticeAdj);
			}

			if (i == v.getAdj().size() - 1) {
				listaVertices.removeLast();
			}
		}
	}

	private void imprimeResultado() {
		if (ehHamiltoniano) {
			System.out.print("O Grafo é Hamiltoniano e o Ciclo Hamiltoniano é: ");
			for (Vertice vertice : listaVertices) {
				System.out.print(vertice.getNome() + " ");
			}
			System.out.print(verticeInicial.getNome());
		} else {
			System.out.println("O Grafo não é Hamiltoniano.");
		}
	}
}
