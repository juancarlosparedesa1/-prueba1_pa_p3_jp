package com.example.demo.service;

import com.example.demo.modelo.CuentaBancaria;

public interface ITransferenciaService {

	//CRUD
		public void Realizar(CuentaBancaria cuentaBancaria);
		//public  
		public void actualizar(CuentaBancaria cuentaBancaria);
		
		public CuentaBancaria buscar(CuentaBancaria numero);
		
		public void borrar(CuentaBancaria numero);
}
