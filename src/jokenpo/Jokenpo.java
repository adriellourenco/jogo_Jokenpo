package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int escolhaUsuario;
		int escolhaMaquina;
		
		System.out.println("**********JOKENPÔ********** \n");
		System.out.println("Pedra - 1");
		System.out.println("Papel - 2");
		System.out.println("Tesoura - 3");
		
		System.out.println("Escolha uma opção: ");
		escolhaUsuario = leitor.nextInt();
		
		leitor.close();
		System.out.println();
		
		if (escolhaUsuario>0 && escolhaUsuario<=3) {
			if (escolhaUsuario==1) {
				System.out.println("Você escolheu Pedra!");
			}
			else if (escolhaUsuario==2) {
				System.out.println("Você escolheu Papel!");
			}else {
				System.out.println("Você escolheu Tesoura!");
			}
			
			Random sorteio = new Random();
			escolhaMaquina = sorteio.nextInt(3) +1;
			
			if (escolhaMaquina==1) {
				System.out.println("A máquina escolheu Pedra!");
			}else if (escolhaMaquina==2) {
				System.out.println("A máquina escolheu Papel!");
			}else {
				System.out.println("A máquina escolheu Tesoura!");
			}
			
		} else {
			System.out.println("Você não digitou um número entre 1 e 3 para escolher uma opção!");
		}

		
		
	}

}
