package com.example.demo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name=cuenta)
public class CuentaBancaria {
	@Id
	@Column(name=cuent_num)//pk
	private String numero;
	
	@Column(name=cuent_tipo)
	private String tipo;
	
	@Column(name=cuent_saldo)
	private BigDecimal saldo;
	
	@Column(name=cuent_cedul)
	private String cedula_Propietario;
	
	
	//getters and setters
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	public String getCedula_Propietario() {
		return cedula_Propietario;
	}
	public void setCedula_Propietario(String cedula_Propietario) {
		this.cedula_Propietario = cedula_Propietario;
	}
	
}


