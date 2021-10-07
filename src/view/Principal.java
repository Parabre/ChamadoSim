package view;

import javax.swing.JOptionPane;

import controller.FilaController;
import model.Fila;

public class Principal {

	public static void main(String[] args) throws Exception {
		FilaController controller = new FilaController();
		Fila fila = new Fila();
		Fila filaPrioritarios = new Fila();

		boolean exibeMenu = true;
		while (exibeMenu) { 
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das opções \n "
					+ "1- Inserir senha na fila \n 2- Inserir senha na fila prioritária" + "\n 3- Chamar atendimento" + "\n 4- Sair"));
			
			switch (opcao) {
			case 1:
				int senhaFila = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma nova senha"));
				controller.insereSenha(fila, senhaFila);
				break;
			case 2:
				int senhaPrioritarios = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma nova senha"));
				controller.insereSenha(filaPrioritarios, senhaPrioritarios);
				break;
			case 3:
				controller.atendimento(fila, filaPrioritarios);
				break;
			case 4:
				exibeMenu = false;				
				break;
			default:
				System.err.println("Escolha uma opção entre 1 a 3");
				break;
			}
		}

	}
}
