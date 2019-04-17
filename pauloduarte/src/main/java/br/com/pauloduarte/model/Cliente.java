package br.com.pauloduarte.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "tblclientes")
public class Cliente {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;	
	private String cpf; 	
	private char plano;
	private int vencimentofat;
	private double valorplano;
	private String email; 

	public Cliente()
	{
		
	}
	
	public Cliente(String nome, String cpf, char plano, int vencimentofat, String email, double valorplano)
	{
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.plano = plano;
		this.vencimentofat = vencimentofat;
		this.email = email;
		this.valorplano = valorplano; 
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public char getPlano() {
		return plano;
	}

	public void setPlano(char plano) {
		this.plano = plano;
	}

	public int getVencimentofat() {
		return vencimentofat;
	}

	public void setVencimentofat(int vencimentofat) {
		this.vencimentofat = vencimentofat;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getValorplano() {
		return valorplano;
	}

	public void setValorplano(double valorplano) {
		this.valorplano = valorplano;
	}

	
	
	
}
