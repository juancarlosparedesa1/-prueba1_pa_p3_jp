package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.CuentaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class TransferenciaRepoImpl implements ITransferenciaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuentaBancaria);
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuentaBancaria);
	}

	@Override
	public CuentaBancaria buscar(CuentaBancaria numero) {
		
		// TODO Auto-generated method stub
		//return this.entityManager.find(CuentaBancaria, numero);
		return numero;
	}

	@Override
	public void borrar(CuentaBancaria numero) {
		// TODO Auto-generated method stub
		this.entityManager.remove(numero);
		
	}
	

}
