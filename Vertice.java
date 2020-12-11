package Trabalho3;

import java.util.LinkedList;

public class Vertice {
	private LinkedList<Vertice> adj;
	private int nome;

	public Vertice(int nome) {
		this.nome = nome;
		adj = new LinkedList<>();
	}
	
	public LinkedList<Vertice> getAdj() {
		return adj;
	}

	public void setAdj(LinkedList<Vertice> adj) {
		this.adj = adj;
	}

	public int getNome() {
		return nome;
	}

	public void setNome(int nome) {
		this.nome = nome;
	}
}