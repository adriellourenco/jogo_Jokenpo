package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int escolhaUsuario;
		int escolhaMaquina;
		
		System.out.println("**********JOKENP�********** \n");
		System.out.println("Pedra - 1");
		System.out.println("Papel - 2");
		System.out.println("Tesoura - 3");
		
		System.out.println("Escolha uma op��o: ");
		escolhaUsuario = leitor.nextInt();
		
		leitor.close();
		System.out.println();
		
		if (escolhaUsuario>0 && escolhaUsuario<=3) {
			if (escolhaUsuario==1) {
				System.out.println("Voc� escolheu Pedra!");
			}
			else if (escolhaUsuario==2) {
				System.out.println("Voc� escolheu Papel!");
			}else {
				System.out.println("Voc� escolheu Tesoura!");
			}
			
			Random sorteio = new Random();
			escolhaMaquina = sorteio.nextInt(3) +1;
			
			if (escolhaMaquina==1) {
				System.out.println("A m�quina escolheu Pedra!");
			}else if (escolhaMaquina==2) {
				System.out.println("A m�quina escolheu Papel!");
			}else {
				System.out.println("A m�quina escolheu Tesoura!");
			}
			
		} else {
			System.out.println("Voc� n�o digitou um n�mero entre 1 e 3 para escolher uma op��o!");
		}

		
		
	}

}
