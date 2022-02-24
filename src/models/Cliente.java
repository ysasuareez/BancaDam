package models;

import javax.swing.JOptionPane;

public class Cliente {
	
	/*
	 * ATRIBUTOS
	 */
	private String nombre;
	private String apellidos;
	private String dni;
	private double sueldo;
	private String pin;
	private CuentaCorriente cuenta;
	
	/*
	 * CONSTRUCTOR
	 */
	public Cliente(String nombre, String apellidos, String dni, double sueldo, String pin) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.sueldo = sueldo;
		this.pin = pin;
		this.cuenta = new CuentaCorriente();			
	}
	
	/*
	 * G & S
	 */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public CuentaCorriente getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaCorriente cuenta) {
		this.cuenta = cuenta;
	}
	
	
	/*
	 * METODOS
	 */
	
	public double cobrarSueldo() {

		double saldoActual = cuenta.getSaldo();
		double newSaldo = saldoActual + sueldo;
		cuenta.setSaldo(newSaldo);
		return newSaldo;
							
	}
	

	
	public double sacarDinero(double cantidad) {				
		
			double saldoActual = cuenta.getSaldo();
			double newSaldo = saldoActual - cantidad;
			cuenta.setSaldo(newSaldo);			
			return newSaldo;
	}
		
			
	
	public int modificarDatos(String password, String sueldoNew) {		
		
		int resultado = 0;
			
		if(!password.isEmpty() && sueldoNew.isEmpty()) {
			pin = password;
			resultado = 1;
		} else if (password.isEmpty() && !sueldoNew.isEmpty()) {
			sueldo = Double.parseDouble(sueldoNew);
			resultado = 2;
		}else if(!password.isEmpty() && !sueldoNew.isEmpty()){
			pin = password;
			sueldo = Double.parseDouble(sueldoNew);
			resultado = 3;
		}else if(password.isEmpty() && sueldoNew.isEmpty()){
			resultado = 4;
		}
		
		return resultado;
		
	}

	
	
	public void verInfo() {
		System.out.print("  »» User Info [Nombre: " + nombre + " | Apellido: " + apellidos 
						+ " | DNI: " + dni + " | Sueldo: " + sueldo + " | Saldo: " + cuenta.getSaldo() + "]\n");
	}
		
	
}
