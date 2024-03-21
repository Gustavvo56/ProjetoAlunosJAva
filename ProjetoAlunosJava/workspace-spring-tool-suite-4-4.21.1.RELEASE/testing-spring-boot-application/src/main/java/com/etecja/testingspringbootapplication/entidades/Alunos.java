package com.etecja.testingspringbootapplication.entidades;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Alunos implements Serializable{
	

	private static final long serialVersionUID = 1L;

	
	@Id
	private String matricula;
	private Integer cod_curso;
	private String nome;
	private Integer idade;
	private String endereco;
	private String email;
	private String cpf;
	private String rg;
	private Date dt_entrado;
	private Date dt_termino;
	private String trancado;
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Integer getCod_curso() {
		return cod_curso;
	}

	public void setCod_curso(Integer cod_curso) {
		this.cod_curso = cod_curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDt_entrado() {
		return dt_entrado;
	}

	public void setDt_entrado(Date dt_entrado) {
		this.dt_entrado = dt_entrado;
	}

	public Date getDt_termino() {
		return dt_termino;
	}

	public void setDt_termino(Date dt_termino) {
		this.dt_termino = dt_termino;
	}

	public String getTrancado() {
		return trancado;
	}

	public void setTrancado(String trancado) {
		this.trancado = trancado;
	}

	public Alunos(String matricula, Integer cod_curso, String nome, Integer idade, String endereco, String email,
			String cpf, String rg, Date dt_entrado, Date dt_termino, String trancado) {
		
		this.matricula = matricula;
		this.cod_curso = cod_curso;
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.email = email;
		this.cpf = cpf;
		this.rg = rg;
		this.dt_entrado = dt_entrado;
		this.dt_termino = dt_termino;
		this.trancado = trancado;
	}

	public Alunos() {
		
	}
	
	}

