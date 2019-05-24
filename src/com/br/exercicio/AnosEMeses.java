package com.br.exercicio;
import java.util.Scanner;
public class AnosEMeses {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int controle = 1;
		
		while (controle > 1) {
			
			System.out.println("Quantos anos você tem?");
			int anos = scan.nextInt();
			System.out.println("Quantos meses ?");
			int meses = scan.nextInt();
			System.out.println("Quantos dias?");
			int dias = scan.nextInt();
			
			int idadeTotalDias = (((anos*365)+ meses * 30)+ dias);
			System.out.println("Sua idade é :" +idadeTotalDias + "dias.");
			System.out.println("Digite 1 para continuar o programa ou 0 para sair ");
			controle = scan.nextInt();
		}
		
		
		
		
		
	}

}
