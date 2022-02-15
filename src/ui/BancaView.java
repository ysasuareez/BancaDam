package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import utils.Almacen;
import java.awt.Font;
import ui.LoginView;
import java.awt.Color;
import java.awt.Panel;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.TitledBorder;

import models.Cliente;

import javax.swing.border.EtchedBorder;

public class BancaView {


	private JFrame frameBancaView;
	private JFrame frameLoginView;
	private JLabel lblNombre;
	private JLabel lblNombre1;
	private JFrame parent;
	private JLabel lblDNI;
	private JLabel lblDNI1;
	private JLabel lblSaldo;
	private JLabel lblSaldo1;
	private JButton btnCerrarSesion;
	private JButton btnCobrarSueldo;
	private JButton btnSacarDinero;
	private JButton btnVerDatos;
	private JButton btnModificar;
	private String username;
	private JLabel lblApellidos;
	private JLabel lblApellidos1;
	private JPanel PantallaMenu;
	private JLabel lblBienvenido;
	private Cliente cliente;
	private int indice;

	
	private JFrame frameDineroView;
	private JPanel PanelDinero;
	private JPanel Pantalla2;
	private JTextField lblCantidad;
	private JLabel lblPregunta;
	private JButton btnVolverBanca;
	private JButton btnSacar;
	private JPanel PanelVerNum;
	private JTextField NumeroCuenta;
	private JLabel lblTitNumero;
	private JButton btnVolver3;
	private JPanel PantallaModificar;
	private JLabel lblCambiarContra;
	private JButton btnVolver4;
	private JButton btnGuardar;
	private JLabel lblCambiarSueldo;
	private JTextField tfSueldoNew;
	private JPasswordField pfContraNew;


	/**
	 * Create the application. (Constructor)
	 */	
	public BancaView(Cliente cliente) {
		this.cliente = cliente;						
		initialize();	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		configureUIComponents();
		configureListeners();
	}
	

	/**
	 * Componentes View 
	 */
	private void configureUIComponents() {
		
		//PANEL MENU
		frameBancaView = new JFrame();
		frameBancaView.getContentPane().setBackground(Color.RED);
		frameBancaView.getContentPane();
		frameBancaView.getContentPane().setLayout(null);
		frameBancaView.setVisible(true);
		
		//TITULO
		frameBancaView.setTitle ("POKEDEX");
		frameBancaView.setBounds(100, 100, 411, 493);
		frameBancaView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//PANTALLA
		PantallaMenu = new JPanel();
		PantallaMenu.setBounds(0, 66, 397, 390);
		frameBancaView.getContentPane().add(PantallaMenu);
		PantallaMenu.setLayout(null);
		PantallaMenu.setForeground(Color.BLACK);
		PantallaMenu.setBorder(null);
		PantallaMenu.setBackground(Color.WHITE);
		
		//DATOS
		lblNombre = new JLabel ("NOMBRE:");
		lblNombre.setFont(new Font("Alef", Font.PLAIN, 16));
		lblNombre.setBounds(53, 10, 91, 31);
		PantallaMenu.add(lblNombre);
		lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblNombre1 = new JLabel (cliente.getNombre());
		lblNombre1.setForeground(Color.BLACK);
		lblNombre1.setFont(new Font("Alef", Font.PLAIN, 16));
		lblNombre1.setBounds(194, 17, 131, 24);
		PantallaMenu.add(lblNombre1);
		
		
		lblApellidos = new JLabel("APELLIDOS:");
		lblApellidos.setFont(new Font("Alef", Font.PLAIN, 16));
		lblApellidos.setBounds(53, 51, 91, 31);
		PantallaMenu.add(lblApellidos);
		lblApellidos.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblApellidos1 = new JLabel(cliente.getApellidos());
		lblApellidos1.setForeground(Color.BLACK);
		lblApellidos1.setFont(new Font("Alef", Font.PLAIN, 16));
		lblApellidos1.setBounds(194, 58, 131, 24);
		PantallaMenu.add(lblApellidos1);
		
		
		lblDNI = new JLabel ("DNI:");
		lblDNI.setFont(new Font("Alef", Font.PLAIN, 16));
		lblDNI.setBounds(53, 92, 94, 31);
		PantallaMenu.add(lblDNI);
		lblDNI.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblDNI1 = new JLabel (cliente.getDni());
		lblDNI1.setForeground(Color.BLACK);
		lblDNI1.setFont(new Font("Alef", Font.PLAIN, 16));
		lblDNI1.setBounds(194, 99, 131, 24);
		PantallaMenu.add(lblDNI1);
		

		lblSaldo = new JLabel ("SALDO:");
		lblSaldo.setFont(new Font("Alef", Font.PLAIN, 16));
		lblSaldo.setBounds(53, 133, 82, 31);
		PantallaMenu.add(lblSaldo);
		lblSaldo.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblSaldo1 = new JLabel (String.valueOf(cliente.getCuenta().getSaldo()));
		lblSaldo1.setForeground(Color.BLACK);
		lblSaldo1.setFont(new Font("Alef", Font.PLAIN, 16));
		lblSaldo1.setBounds(194, 140, 131, 24);
		PantallaMenu.add(lblSaldo1);
		
		
		//BOTONES
		btnCerrarSesion = new JButton("SALIR");
		btnCerrarSesion.setBounds(104, 330, 180, 24);
		PantallaMenu.add(btnCerrarSesion);
		btnCerrarSesion.setBackground(new Color(102, 153, 204));
		btnCerrarSesion.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCerrarSesion.setForeground(new Color(255, 255, 255));
		
		btnCobrarSueldo = new JButton("COBRAR SUELDO");
		btnCobrarSueldo.setForeground(Color.WHITE);
		btnCobrarSueldo.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCobrarSueldo.setBackground(new Color(102, 153, 204));
		btnCobrarSueldo.setBounds(104, 184, 180, 25);
		PantallaMenu.add(btnCobrarSueldo);
		
		btnSacarDinero = new JButton("SACAR DINERO");
		btnSacarDinero.setForeground(Color.WHITE);
		btnSacarDinero.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSacarDinero.setBackground(new Color(102, 153, 204));
		btnSacarDinero.setBounds(104, 219, 180, 25);
		PantallaMenu.add(btnSacarDinero);
		
		btnVerDatos = new JButton("VER N\u00BA CUENTA");
		btnVerDatos.setForeground(Color.WHITE);
		btnVerDatos.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVerDatos.setBackground(new Color(102, 153, 204));
		btnVerDatos.setBounds(104, 254, 180, 25);
		PantallaMenu.add(btnVerDatos);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setForeground(Color.WHITE);
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnModificar.setBackground(new Color(102, 153, 204));
		btnModificar.setBounds(104, 292, 180, 25);
		PantallaMenu.add(btnModificar);
				
		lblBienvenido = new JLabel("BANK DAM");
		lblBienvenido.setBounds(10, 10, 387, 45);
		frameBancaView.getContentPane().add(lblBienvenido);
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setForeground(Color.WHITE);
		lblBienvenido.setFont(new Font("Alef", Font.BOLD, 25));
		
		
		
		//PANEL VER NUMERO CUENTA
		PanelVerNum = new JPanel();
		PanelVerNum.setVisible(false);
		PanelVerNum.setLayout(null);
		PanelVerNum.setBackground(Color.WHITE);
		PanelVerNum.setBounds(0, 66, 397, 390);
		frameBancaView.getContentPane().add(PanelVerNum);
		
		NumeroCuenta = new JTextField(""+cliente.getCuenta().getNumCuenta());
		NumeroCuenta.setFont(new Font("Alef", Font.PLAIN, 15));
		NumeroCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		NumeroCuenta.setColumns(10);
		NumeroCuenta.setBounds(114, 135, 159, 37);
		PanelVerNum.add(NumeroCuenta);
		
		lblTitNumero = new JLabel("N\u00DAMERO DE CUENTA");
		lblTitNumero.setFont(new Font("Alef", Font.PLAIN, 16));
		lblTitNumero.setBounds(114, 91, 167, 44);
		PanelVerNum.add(lblTitNumero);
		
		btnVolver3 = new JButton("VOLVER");
		btnVolver3.setForeground(Color.WHITE);
		btnVolver3.setFont(new Font("Alef", Font.BOLD, 14));
		btnVolver3.setBackground(new Color(102, 153, 204));
		btnVolver3.setBounds(140, 182, 113, 31);
		PanelVerNum.add(btnVolver3);
		
		
		//PANEL SACAR DINERO
		PanelDinero = new JPanel();
		PanelDinero.setVisible(false);
		PanelDinero.setLayout(null);
		PanelDinero.setBackground(Color.RED);
		PanelDinero.setBounds(0, 66, 397, 390);
		frameBancaView.getContentPane().add(PanelDinero);
		
		Pantalla2 = new JPanel();
		Pantalla2.setLayout(null);
		Pantalla2.setForeground(Color.BLACK);
		Pantalla2.setBorder(null);
		Pantalla2.setBackground(Color.WHITE);
		Pantalla2.setBounds(0, 0, 397, 390);
		PanelDinero.add(Pantalla2);
		
		lblCantidad = new JTextField();
		lblCantidad.setColumns(10);
		lblCantidad.setBounds(119, 156, 159, 37);
		Pantalla2.add(lblCantidad);
		
		lblPregunta = new JLabel("CANTIDAD A SACAR:");
		lblPregunta.setFont(new Font("Alef", Font.PLAIN, 16));
		lblPregunta.setBounds(119, 107, 167, 44);
		Pantalla2.add(lblPregunta);
		
		btnVolverBanca = new JButton("VOLVER");
		btnVolverBanca.setForeground(Color.WHITE);
		btnVolverBanca.setFont(new Font("Alef", Font.BOLD, 14));
		btnVolverBanca.setBackground(new Color(102, 153, 204));
		btnVolverBanca.setBounds(212, 219, 113, 31);
		Pantalla2.add(btnVolverBanca);
		
		btnSacar = new JButton("SACAR");
		btnSacar.setForeground(Color.WHITE);
		btnSacar.setFont(new Font("Alef", Font.BOLD, 14));
		btnSacar.setBackground(new Color(102, 153, 204));
		btnSacar.setBounds(78, 219, 113, 31);
		Pantalla2.add(btnSacar);
		
		
		
		//PANEL MODIFICAR DATOS
		PantallaModificar = new JPanel();
		PantallaModificar.setVisible(false);
		PantallaModificar.setLayout(null);
		PantallaModificar.setForeground(Color.BLACK);
		PantallaModificar.setBorder(null);
		PantallaModificar.setBackground(Color.WHITE);
		PantallaModificar.setBounds(0, 66, 397, 390);
		frameBancaView.getContentPane().add(PantallaModificar);
		
		lblCambiarContra = new JLabel("CAMBIAR CONTRASE\u00D1A:");
		lblCambiarContra.setFont(new Font("Alef", Font.PLAIN, 16));
		lblCambiarContra.setBounds(104, 37, 268, 44);
		PantallaModificar.add(lblCambiarContra);
		
		btnVolver4 = new JButton("VOLVER");
		btnVolver4.setForeground(Color.WHITE);
		btnVolver4.setFont(new Font("Alef", Font.BOLD, 14));
		btnVolver4.setBackground(new Color(102, 153, 204));
		btnVolver4.setBounds(211, 256, 113, 31);
		PantallaModificar.add(btnVolver4);
		
		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setFont(new Font("Alef", Font.BOLD, 14));
		btnGuardar.setBackground(new Color(102, 153, 204));
		btnGuardar.setBounds(77, 256, 113, 31);
		PantallaModificar.add(btnGuardar);
		
		lblCambiarSueldo = new JLabel("CAMBIAR SUELDO:");
		lblCambiarSueldo.setFont(new Font("Alef", Font.PLAIN, 16));
		lblCambiarSueldo.setBounds(104, 139, 268, 44);
		PantallaModificar.add(lblCambiarSueldo);
		
		tfSueldoNew = new JTextField();
		tfSueldoNew.setColumns(10);
		tfSueldoNew.setBounds(104, 184, 188, 37);
		PantallaModificar.add(tfSueldoNew);
		
		pfContraNew = new JPasswordField();
		pfContraNew.setBounds(104, 79, 188, 37);
		PantallaModificar.add(pfContraNew);

	}
	
	/**
	 * MÉTODOS de cada botón
	 */
	private void configureListeners() {

		
			//Si presionas Cerrar Sesión se eliminará la ventana de pokedex y volverá a aprecer parent (en este caso es la LoginView)
			btnCerrarSesion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frameBancaView.dispose();
					new LoginView();
				}
			});
			
			
			btnCobrarSueldo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					double saldoActual = cliente.getCuenta().getSaldo();
					double sueldo = cliente.getSueldo();
					
					cliente.getCuenta().setSaldo(saldoActual + sueldo);
					JOptionPane.showMessageDialog(btnCobrarSueldo, "           SUELDO COBRADO CON ÉXITO.");
					lblSaldo1.setText(String.valueOf(saldoActual + sueldo));					
				}
			});
			

			btnSacarDinero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {		
				
					if (cliente.getCuenta().getSaldo() > 0) {									
						PantallaMenu.setVisible(false);
						PanelDinero.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(btnSacar, "           CANTIDAD INSUFICIENTE.");	
					}
				}
			});
			
			
			//BOTONES SACAR DINERO
			btnSacar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (cliente.getCuenta().getSaldo() > 0) {
						
						double saldoActual = cliente.getCuenta().getSaldo();
						double sueldoSacar = Double.parseDouble(lblCantidad.getText());
						
						cliente.getCuenta().setSaldo(saldoActual - sueldoSacar);
						lblSaldo1.setText(String.valueOf(saldoActual - sueldoSacar));	
						JOptionPane.showMessageDialog(btnSacar, "           CANTIDAD SACADA CON ÉXITO.");
						PantallaMenu.setVisible(true);
						PanelDinero.setVisible(false);
					}else {
						JOptionPane.showMessageDialog(btnSacar, "           CANTIDAD INSUFICIENTE.");
					}
				}
			});
			
			btnVolverBanca.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					PantallaMenu.setVisible(true);
					PanelDinero.setVisible(false);
				}
			});
			
			btnVerDatos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					PantallaMenu.setVisible(false);
					PanelVerNum.setVisible(true);
				}
			});
			
			btnVolver3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					PantallaMenu.setVisible(true);
					PanelVerNum.setVisible(false);
				}
			});
			

			btnModificar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					PantallaMenu.setVisible(false);
					PantallaModificar.setVisible(true);
				}
			});
			
			btnGuardar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String password = new String (pfContraNew.getPassword());
					
					if(!password.isEmpty() && tfSueldoNew.getText().isEmpty()) {
						cliente.setPin(password);
						JOptionPane.showMessageDialog(btnGuardar, "PIN MODIFICADO CON ÉXITO");
						PantallaMenu.setVisible(true);
						PantallaModificar.setVisible(false);
					} else if (password.isEmpty() && !tfSueldoNew.getText().isEmpty()) {
						cliente.setSueldo(Double.parseDouble(tfSueldoNew.getText()));
						JOptionPane.showMessageDialog(btnGuardar, "SUELDO MODIFICADO CON ÉXITO");
						PantallaMenu.setVisible(true);
						PantallaModificar.setVisible(false);
					}else if(!password.isEmpty() && !tfSueldoNew.getText().isEmpty()){
						cliente.setPin(password);
						cliente.setSueldo(Double.parseDouble(tfSueldoNew.getText()));
						JOptionPane.showMessageDialog(btnGuardar, "PIN Y SUELDO MODIFICADOS CON ÉXITO");
						PantallaMenu.setVisible(true);
						PantallaModificar.setVisible(false);
					}else if(password.isEmpty() && tfSueldoNew.getText().isEmpty()){
						JOptionPane.showMessageDialog(btnGuardar, "Rellene el/los campos que desea modificar");
					}
						

				}
			});
			
			btnVolver4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					PantallaMenu.setVisible(true);
					PantallaModificar.setVisible(false);
				}
			});
		
	}
}


