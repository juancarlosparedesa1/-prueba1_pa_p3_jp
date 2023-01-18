package com.example.demo.correccion.service;

import com.example.demo.correccion.modelo.Cuenta;

public interface ICuentaService {

	public void crear(Cuenta cuentaBanciaria);

	public void modificar(Cuenta cuentaBanciaria);

	public Cuenta buscar(String numero);

	public void borrar(String numero);

}