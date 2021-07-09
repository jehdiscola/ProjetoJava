package br.com.generation.ProjetoJava;

import java.util.Scanner;

public class Cadastro {
	
	Scanner read = new Scanner(System.in);
	Usuario user1 = new Usuario();
		
	public void login() {
		System.out.println("Insira seu login: ");
		user1.setNome(read.nextLine());
		System.out.println("Insira sua senha: ");
		user1.setSenha(read.nextLine());
		}	
			
	public void Cadastramento(){	
		
		System.out.println("Faça seu cadastro! ");
		System.out.println("Insira seu Nome: ");
		user1.setNome(read.nextLine());
		System.out.println("Insira seu email: ");
		user1.setEmail(read.nextLine());
		System.out.println("Insira seu senha: ");
		user1.setSenha(read.nextLine());
	}
	
	public void Doacao() {
		System.out.println("===========Doador===========\n");
		System.out.println("O que voce deseja doar\n1-Alimentos não perecíveis"
				+ "\n2-Roupas \n3-Brinquedos \n4-Farmacia \n5-Outros");
		int numero = 0 ;
		numero = read.nextInt();
		switch (numero) {
			case 1:
				System.out.println("Alimentos não Perecíveis");
				System.out.println("\nQuantos Alimentos deseja doar?");
				user1.setAlimentos(read.nextInt());
				break;
			case 2:
				System.out.println("Roupas");
				System.out.println("Quantas Roupas deseja doar?");
				user1.setRoupas(read.nextInt());
				break;
			case 3:
				System.out.println("Brinquedos");
				System.out.println("Quantos Brinquedos deseja doar?");
				user1.setBrinquedos(read.nextInt());
				break;
			case 4:
				System.out.println("Farmácia");
				System.out.println("Quantos produtos você deseja doar?");
				user1.setFarmacia(read.nextInt());
				break;
			case 5:
				System.out.println("Outros");
				System.out.println("Digite o que deseja doar: ");
				
				System.out.println("Quantos produtos deseja doar?");
				user1.setOutros(read.nextInt());
				break;
				
		}
	}
	public void Demanda() {			
		System.out.println("==========Amparado ou Beneficiário==========");
		System.out.println("\nO que voce deseja Receber: \n1-Alimentos não Perecíveis"
				+ "\n2-Roupas \n3-Brinquedos \n4-Farmácia \n5-Outros");
		int numero = 0 ;
		numero = read.nextInt();
		switch (numero) {
			case 1:
				System.out.println("Alimentos");
				System.out.println("Quantos Alimentos deseja Receber?");
				user1.setAlimentos(read.nextInt());
				break;
			case 2:
				System.out.println("Roupas");
				System.out.println("Quantas Roupas deseja Receber?");
				user1.setRoupas(read.nextInt());
				break;
			case 3:
				System.out.println("Brinquedos");
				System.out.println("Quantos Brinquedos deseja Receber?");
				user1.setBrinquedos(read.nextInt());
				break;
			case 4:
				System.out.println("Farmácia");
				System.out.println("Quantos produtos deseja Receber?");
				user1.setFarmacia(read.nextInt());
				break;
			case 5:
				System.out.println("Outros");
				System.out.println("Quantos produtos deseja Receber?");
				// Como fazer para ler int e char - Excluir Outros ???
				user1.setOutros(read.nextInt());
				break;
		}
	}
	public void MessagemDoador() {
		System.out.println();
		System.out.println(user1.getNome()+" Você Doará:\n");
		if (user1.getAlimentos()!=0) {
			System.out.println("*"+user1.getAlimentos()+" Alimentos não Perecíveis\n");
		}
		if (user1.getRoupas()!=0) {
			System.out.println("*"+user1.getRoupas()+" Roupas\n");
		}
		if(user1.getBrinquedos()!=0) {
			System.out.println("*"+user1.getBrinquedos()+" Brinquedos\n");
		}
		if(user1.getFarmacia()!=0) {
			System.out.println("*"+user1.getFarmacia()+" Farmácia\n");
		}
		if(user1.getOutros()!=0) {
			System.out.println("*"+user1.getOutros()+" Outros\n");
		}
		System.out.println("Muito obrigade, "+user1.getNome()+ "por sua doação.\nSua ajuda fará diferença em muitas vidas.");
	}
	public void MessagemReceptor() {
		System.out.println();
		System.out.println(user1.getNome()+"Você receberá:\n");
		if (user1.getAlimentos()!=0) {
			System.out.println("*"+user1.getAlimentos()+" Alimentos não Perecíveis\n");
		}
		if (user1.getRoupas()!=0) {
			System.out.println("*"+user1.getRoupas()+" Roupas\n");
		}
		if(user1.getBrinquedos()!=0) {
			System.out.println("*"+user1.getBrinquedos()+" Brinquedos\n");
		}
		if(user1.getFarmacia()!=0) {
			System.out.println("*"+user1.getFarmacia()+" Farmácia\n");
		}
		if(user1.getOutros()!=0) {
			System.out.println("*"+user1.getOutros()+" Outros\n");
		}
		System.out.println("Obrigade, "+user1.getNome()+" por confiar no processo.\nEntraremos em contato em breve "+
				"para informar a disponibilidade de suas necessidades.");
		
	}
	
}
	
