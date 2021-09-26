package br.ufg.inf.fs.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Usuario {

	private static final long serialVersionUID = 1L;

	@Id
	private String login;
	
	private String nome;
	
	private String senha;
	
	@ManyToMany
	@JoinTable(name="usuario_regra",
		joinColumns =  @JoinColumn(name="login", referencedColumnName = "login"),
		inverseJoinColumns = @JoinColumn(name="regra", referencedColumnName = "regra")
	)
	private List<Regra> regras;
	
	public Usuario(String login, String nome, String senha, List<Regra> regras) {
		super();
		this.login = login;
		this.nome = nome;
		this.senha = senha;
		this.regras = regras;
	}

	public Usuario() {
		super();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Regra> getRegras() {
		return regras;
	}

	public void setRegras(List<Regra> regras) {
		this.regras = regras;
	}	

}
