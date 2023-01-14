package com.example.demo.repo;

import com.example.demo.modelo.CuentaBancaria;

public interface ITransferenciaRepo {
	//CRUD
	public void insertar(CuentaBancaria cuentaBancaria);
	//public  
	public void actualizar(CuentaBancaria cuentaBancaria);
	
	public CuentaBancaria buscar(CuentaBancaria numero);
	
	public void borrar(CuentaBancaria numero);

}
