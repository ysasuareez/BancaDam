package models;

import javax.swing.JOptionPane;

import utils.Almacen;

public class CuentaCorriente {

	/*
	 * ATRIBUTOS
	 */
		private int numCuenta;
		private double saldo;
		private Cliente cliente;
		
	/*
	 * CONSTRUCTOR
	 */
	public CuentaCorriente() {
		super();
		this.numCuenta = Almacen.lista_clientes.size() + 1435520;
		this.saldo = 0.0;
		this.cliente = cliente;
	}

	
	/*
	 * G & S
	 */
	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumCuenta() {
		return numCuenta;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setPersona(Cliente cliente) {
		this.cliente = cliente;
	}
	



	
	/*
	 * MÉTODOS
	 */
	public boolean dineroSufi(double cantidad) {
		if (saldo > cantidad ) {	
			return true;			
		}else {
			return false;
		}
	}
		
	public boolean hayDinero() {
		if (saldo > 0) {
			return true;
		}else {
			return false;
		}
	}

		
		
	/*
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "CuentaCorriente [NumCuenta = " + numCuenta + " | Saldo=" + saldo + " | Persona = " + cliente + "]";
	}
	
	
	
	
	
	
}
