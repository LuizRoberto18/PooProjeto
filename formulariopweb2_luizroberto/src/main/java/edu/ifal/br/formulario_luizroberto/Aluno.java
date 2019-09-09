package edu.ifal.br.formulario_luizroberto;

import javax.persistence.Entity;

@Entity
public class Aluno extends Pessoa {

	private String email;
	private String modulo;
	private String[] areasPreferidas;
	private String senha;
	private String confirmacao;

	public Aluno(){

	}

	public Aluno(String cpf, Long id){
		super(cpf, id);
	}
	
	public Aluno(String cpf, Long id, String email){
		super(cpf, id);
		this.email = email;
	}

	@Override
	public String getNome(){
		return getNome();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public String[] getAreasPreferidas() {
		return areasPreferidas;
	}

	public void setAreasPreferidas(String[] areasPreferidas) {
		this.areasPreferidas = areasPreferidas;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmacao() {
		return confirmacao;
	}

	public void setConfirmacao(String confirmacao) {
		this.confirmacao = confirmacao;
	}

	public String getAreasPorString() {
		String ret = "";
		for (String var : areasPreferidas) {
			ret = ret + var + ",";
		}
		return ret;
	}

	public String getTodosCampos() {
		return getNome() + ", " + email + ", " + modulo + ", " + getAreasPorString();
	}

	@Override
	public String toString() {
		return getTodosCampos();
	}

}