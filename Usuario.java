package br.com.generation.ProjetoJava;

public class Usuario {
	
	//Atributos
	private String nome;
	private int idade;
	private int telefone;
	private String email; // login
	private String senha;
	private int alimentos = 0;
	private int roupas = 0;
	private int brinquedos = 0;
	private int farmacia = 0;
	private int outros = 0;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getAlimentos() {
		return alimentos;
	}
	public void setAlimentos(int alimentos) {
		this.alimentos = alimentos;
	}
	public int getRoupas() {
		return roupas;
	}
	public void setRoupas(int roupas) {
		this.roupas = roupas;
	}
	public int getBrinquedos() {
		return brinquedos;
	}
	public void setBrinquedos(int brinquedos) {
		this.brinquedos = brinquedos;
	}
	public int getFarmacia() {
		return farmacia;
	}
	public void setFarmacia(int farmacia) {
		this.farmacia = farmacia;
	}
	public int getOutros() {
		return outros;
	}
	public void setOutros(int outros) {
		this.outros = outros;
	}
	

	
}