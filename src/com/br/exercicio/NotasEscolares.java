package com.br.exercicio;
import java.util.Scanner;
public class NotasEscolares {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é a primeira nota ? ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Qual é a segunda nota? ");
		double nota2 = scan.nextDouble();
		
		System.out.println("Qual é a terceira nota? ");
		double nota3 = scan.nextDouble();
		
		System.out.println("Qual é a quarta nota? ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		 
		if(media >=7.0) {
			
			System.out.println("Você foi aprovado, com media de " + media + ", parabéns !");
		}else {
			System.out.println("Você foi reprovado, com media de " + media );
			
		}
		
		
		
	}

}
