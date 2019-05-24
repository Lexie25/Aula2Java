package com.br.exercicio;
import java.util.Scanner;
public class NegativoOuPositivo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o numero desejado:");
		int numero = scan.nextInt();
		
		if (numero>=0) {
			
			System.out.println("este numero é positivo");
		}else {
			System.out.println("Esse numero é negativo");
		}
	}

}
