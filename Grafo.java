package Trabalho3;

public class Grafo {
	private Vertice[] vertices;

	public Vertice[] getVertices() {
		return vertices;
	}

	public void setVertices(Vertice[] vertices) {
		this.vertices = vertices;
	}

	public Grafo(int v) {
		vertices = new Vertice[v];
		for (int i = 0; i < v; i++) {
			vertices[i] = new Vertice(i);
		}
	}

	public void addArresta(int v1, int v2) {
		vertices[v1].getAdj().add(vertices[v2]);
		if (v1 != v2)
			vertices[v2].getAdj().add(vertices[v1]);
	}
}
