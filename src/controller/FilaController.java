package controller;

import model.Fila;

public class FilaController {
	
	int contador = 0;

	public void insereSenha(Fila f,Integer senha) {
		f.insert(senha);
	}

	public void atendimento(Fila fila, Fila filaPrioritarios) throws Exception {		
		if(contador == 3 || filaPrioritarios.isEmpty()) {
			if(fila.isEmpty()) throw new Exception("Não existem senhas para serem atendidas!");
			fila.remove();
			contador = 0;
			System.out.println("Senha fila removida");
		}
		else {
			filaPrioritarios.remove();
			contador++;
			System.out.println("Senha fila prioridade removida");
		}
	}
}
