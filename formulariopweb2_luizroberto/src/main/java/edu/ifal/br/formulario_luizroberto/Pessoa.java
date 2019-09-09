package edu.ifal.br.formulario_luizroberto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	protected String nome;
	protected String cpf;
	protected String sexo;
	protected String idade;

	public Pessoa(){
		super();
	}
	public Pessoa(String cpf, Long id, String sexo, String idade){
		super();
		this.cpf = cpf;
		this.id = id;
		this.sexo = sexo;
		this.idade = idade;
	}

	public String getModulu(){
		return getModulu();
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
}
