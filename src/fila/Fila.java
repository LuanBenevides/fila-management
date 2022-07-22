package fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Queue<Usuario> filaUsuario = new LinkedList<>();
		int controleExecMenu = 0;
		int backToMenu;
		
		while(controleExecMenu == 0) {
			int escolha;
			
			System.out.println("Escolha uma opcao: ");
			System.out.println("1 - Inserir usuario na fila;");
			System.out.println("2 - Consultar a fila atual;");
			System.out.println("3 - Chamar o proximo na fila");
			escolha = entrada.nextInt();
			
			switch(escolha) {
				case 1:
					String nome, matricula, atendimento;
					
					System.out.println("Cadastro na fila iniciado: ");
					System.out.println("Informe o seu nome: ");
					nome = entrada.next();
					
					System.out.println("Informe a sua matricula: ");
					matricula = entrada.next();
					
					System.out.println("Informe o que deseja: ");
					atendimento = entrada.next();
					
					filaUsuario.add(new Usuario(nome, matricula, atendimento));
					System.out.println("Usuário inserido com sucesso!");
					System.out.println("Deseja retornar ao menu?");
					System.out.println("1 - Sim / 2 - Nao");
					backToMenu = entrada.nextInt();
					
					if(backToMenu == 1) {
						controleExecMenu = 0;
					}else if(backToMenu == 2) {
						backToMenu = 1;
					}
				break;
				case 2:
					System.out.println("Fila atual:");
					int indexador = 0;
					for(Usuario userPercorre: filaUsuario) {
						indexador++;
						
						System.out.println("--------------------------------------");
						System.out.println("Posicao na fila: " + indexador);
						System.out.println("Usuario: " + userPercorre.nome);
						System.out.println("Matricula: " + userPercorre.matricula);
						System.out.println("Atendimento: " + userPercorre.atendimento);
					}
				break;
				case 3:
					Usuario chamada = filaUsuario.poll();
					System.out.println("Chamada no painel: ");
					System.out.println("Sr (a): " + chamada.nome);
					System.out.println("Matricula: " + chamada.matricula);
					System.out.println("Atendimento: " + chamada.atendimento);
					
				break;
			}
		}
		
		entrada.close();
	}
}