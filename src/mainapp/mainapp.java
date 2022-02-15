package mainapp;

import java.util.ArrayList;
import java.util.Scanner;

import models.CuentaCorriente;
import ui.LoginView;
import utils.Almacen;
import models.Cliente;

public class mainapp {

	public static void main(String[] args) {
		
		Almacen.lista_clientes.add(new Cliente ("Ysabel", "Suarez", "1", 1500, "1"));
		Almacen.lista_clientes.add(new Cliente ("Alvaro", "Gonz", "2", 1000, "2"));
		new LoginView();
	}

}
