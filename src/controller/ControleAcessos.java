package controller;

import model.*;

public class ControleAcessos {

	Lista[] tabelaEspalhamento;

	public ControleAcessos(int andares) {
		tabelaEspalhamento = new Lista[andares];

		for (int i = 0; i < andares; i++) {
			tabelaEspalhamento[i] = new Lista();
		}
	}

	public void cadastrar(Morador morador) {
		int hash = morador.hashCode();
		Lista l = tabelaEspalhamento[hash];
		l.addFirst(morador);
		System.out.println(
				"Nome: " + morador.getNomeM() + " - Apartamento: " + morador.getNumAp() + " cadastrado!!!");

	}

	public void consultar(Morador morador) throws Exception {
		int hash = morador.hashCode();
		Lista l = tabelaEspalhamento[hash];
		int tamanho = l.size();
		int cont = 0;
		System.out.println("Resultado da consulta: ");
		for (int i = 0; i < tamanho; i++) {
			Morador mor = (Morador) l.get(i);
			if (mor.getNumAp() == morador.getNumAp() && mor.getNomeM().contains(morador.getNomeM())) {
				System.out.println(l.get(i));
				cont = cont++;
			}
		}
		if (cont <= 0) {
			System.out.println("Morador não encontrado!!!");
		}
	}

	public void excluir(Morador morador) throws Exception {
		int hash = morador.hashCode();
		Lista l = tabelaEspalhamento[hash];
		int tamanho = l.size();

		for (int i = 0; i < tamanho; i++) {
			Morador mor = (Morador) l.get(i);
			if (mor.getNumAp() == morador.getNumAp() && mor.getNomeM().contains(morador.getNomeM())) {
				l.remove(i);
				System.out.println("Morador removido!!!");
				break;
			}
		}
		System.out.println("Morador não encontrado!!!");
	}

	public void listar(int andar) throws Exception {
		Lista l = tabelaEspalhamento[andar - 1];
		int tamanho = l.size();
		System.out.println("Listagem: ");
		if (l.size() == 0) {
			System.out.println("Nenhum morador neste andar!!!");
		} else {
			for (int i = 0; i < tamanho; i++) {
				System.out.println(l.get(i));
			}
		}
	}
}
