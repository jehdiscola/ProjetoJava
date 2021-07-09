package br.com.generation.ProjetoJava;

import java.util.Scanner;

public class TestaTudo{

	private static final char Continuar = 0;

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		Cadastro cad1 = new Cadastro ();
		Usuario user1 = new Usuario();
		
		System.out.println("BEM VINDES!!!");
		System.out.println("NOME PROJETO");
		System.out.println("================");
		
		System.out.println("Você já tem cadastro?");
		System.out.println("1 - SIM | 2 - NÃO");
		int resposta = read.nextInt();
		if (resposta ==1 ) {
			cad1.login();
			
		}
		else{
			cad1.Cadastramento();
			
		}
		
		System.out.println("Escolha seu perfil");
		
			System.out.println("1 - Apoiador | 2 - Amparado ou Beneficiário"); 
			int res =read.nextInt();
			if(res == 1 ) {
				cad1.Doacao();
			}
			else{
				cad1.Demanda();
			}
			
			do {	
			System.out.println("Deseja Fazer mais uma Doação/Receber?\n 1- SIM | 2- NAO");
			int Continuar = 0;
			Continuar = read.nextInt();
			if (Continuar == 2 ){
				break;
			}
			if (res == 1) {
				cad1.Doacao();
			}
			else {
				cad1.Demanda();
			}
			
		}	while(Continuar != 2);
			
			if (res ==1) {	
			cad1.MessagemDoador();
		}
			else {
			cad1.MessagemReceptor();
		}


	}

}
