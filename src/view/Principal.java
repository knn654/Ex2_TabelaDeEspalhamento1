package view;

import javax.swing.JOptionPane;

import controller.ControleAcessos;
import model.Morador;

public class Principal {

	public static void main(String[] args) throws Exception {
		ControleAcessos tabela = new ControleAcessos(10);
		int opc = 0;
		String nome, modelo, cor, placa;
		int numAp, andar;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Opções:\n1 - Adicionar morador\n"
					+ "2 - Remover morador\n"
					+ "3 - Buscar morador\n"
					+ "4 - Listar moradores \n"
					+ "9 - Encerrar"));
			
			switch (opc) {
			case 1:
				numAp = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do apartamento: "));
				if (numAp < 100 || numAp > 999) {
					System.out.println("Número inválido!!!");
					break;
				}
				nome = JOptionPane.showInputDialog("Digite o nome do morador: ");
				modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ");
				cor = JOptionPane.showInputDialog("Digite a cor do carro: ");
				placa = JOptionPane.showInputDialog("Digite a placa do carro: ");
				Morador novoM = new Morador(numAp, nome, modelo, cor, placa);
				tabela.cadastrar(novoM);
				break;
			case 2:
				numAp = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do apartamento: "));
				if (numAp < 100 || numAp > 999) {
					System.out.println("Número inválido!!!");
					break;
				}
				nome = JOptionPane.showInputDialog("Digite o nome do morador: ");
				novoM = new Morador(numAp, nome, null, null, null);
				tabela.excluir(novoM);
				break;
			case 3:
					numAp = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do apartamento: "));
					if (numAp < 100 || numAp > 999) {
						System.out.println("Número inválido!!!");
						break;
					}
					nome = JOptionPane.showInputDialog("Digite o nome do morador: ");
					novoM = new Morador(numAp, nome, null, null, null);
					tabela.consultar(novoM);
					break;
			case 4:
				andar = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do andar (de 1 a 9): "));
				if (andar < 1 || andar > 9) {
					System.out.println("Número inválido!!!");
					break;
				}
				tabela.listar(andar);
				break;
			}
		} while (opc != 9);
	}
}
