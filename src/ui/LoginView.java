package ui;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

import utils.Almacen;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import ui.RegistrarView;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;
import java.awt.Button;
import java.awt.Panel;
import javax.swing.border.TitledBorder;

import models.Cliente;

import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;
import javax.swing.LayoutStyle.ComponentPlacement;


public class LoginView {

	private JFrame frameLoginView;
	private JLabel lblDNI;
	private JLabel lblPIN;
	private JButton btnIniciar;
	private JTextField tfDNI;
	private JButton btnRegistrar;
	private JPasswordField pfPIN;
	private JLabel lblBienvenido;
	private JPanel Pantalla;
	private Cliente cliente;
	

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
		this.cliente = cliente;
		this.frameLoginView.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameLoginView = new  JFrame();
		frameLoginView.getContentPane();
		configureUIComponents();		
		configureListeners();

		
	}

	/**
	 * Componentes View 
	 */
	private void configureUIComponents() {
		
		
		frameLoginView = new JFrame();		
		frameLoginView.getContentPane().setBackground(Color.RED);
		frameLoginView.getContentPane().setLayout(null);
		
		//TITULO
		frameLoginView.setTitle("Men\u00FA Inicial");
		frameLoginView.setBounds(100, 100, 411, 492);
		frameLoginView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//PANTALLA
		Pantalla = new JPanel();
		Pantalla.setBorder(null);
		Pantalla.setBackground(Color.WHITE);
		Pantalla.setBounds(0, 65, 397, 390);
		frameLoginView.getContentPane().add(Pantalla);
		
		//BOTONES
		btnIniciar = new JButton("INICIAR");
		btnIniciar.setBounds(101, 230, 180, 25);
		btnIniciar.setToolTipText("");
		btnIniciar.setForeground(Color.WHITE);
		btnIniciar.setBackground(new Color(102, 153, 204));
		btnIniciar.setFont(new Font("Alef", Font.BOLD, 14));
		
		
		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setBounds(101, 277, 180, 25);
		btnRegistrar.setForeground(Color.WHITE);
		btnRegistrar.setBackground(new Color(102, 153, 204));
		btnRegistrar.setFont(new Font("Alef", Font.BOLD, 14));
		
		//DENTRO DE PANTALLA
		//USERNAME
		lblDNI = new JLabel("DNI");
		lblDNI.setBounds(61, 58, 125, 25);
		lblDNI.setHorizontalAlignment(SwingConstants.LEFT);
		lblDNI.setFont(new Font("Alef", Font.PLAIN, 16));

		tfDNI = new JTextField();
		tfDNI.setBounds(61, 87, 256, 26);
		tfDNI.setFont(new Font("Courier New", Font.PLAIN, 13));
		tfDNI.setColumns(10);
		
		//PASSWORD
		pfPIN = new JPasswordField();
		pfPIN.setBounds(61, 167, 256, 25);
		pfPIN.setFont(new Font("Courier New", Font.PLAIN, 13));
		
		lblPIN = new JLabel("PIN");
		lblPIN.setBounds(61, 139, 125, 25);
		lblPIN.setHorizontalAlignment(SwingConstants.LEFT);
		lblPIN.setFont(new Font("Alef", Font.PLAIN, 16));
		
		Pantalla.setLayout(null);
		Pantalla.add(lblDNI);
		Pantalla.add(tfDNI);
		Pantalla.add(lblPIN);
		Pantalla.add(pfPIN);
		Pantalla.add(btnIniciar);
		Pantalla.add(btnRegistrar);
								
		lblBienvenido = new JLabel("BANK DAM");
		lblBienvenido.setBounds(126, 10, 144, 45);
		frameLoginView.getContentPane().add(lblBienvenido);
		lblBienvenido.setFont(new Font("Alef", Font.BOLD, 25));
		lblBienvenido.setForeground(new Color(255, 255, 255));

	}
	
	/**
	 * Métodos
	 */
	
	private void configureListeners() {
		
		//Hacemos que el boton de Iniciar compruebe (gracias al metodo) si los datos se encuentran en el Almacen y coinciden
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprobarDatos();
			}
		});
		
		//con intro se activa el btnIniciar
		btnIniciar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					comprobarDatos();
				}
			}
		});

		//con intro se simula la activacion del btnIniciar
		pfPIN.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {					
						comprobarDatos();							
				}
			}
		});
		
		//con intro se activa la RegistroView
		btnRegistrar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				new RegistrarView(frameLoginView);
			}
		});
		
		//Nos pasaría a la otra ventana para poder registrar nuestros datos en el almacen
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//eliminamos la ventana
				frameLoginView.setVisible(false);
				//llamamos a la RegistroView
				new RegistrarView(frameLoginView);
			}
		});
	}
	
	//Método para comprobar los datos del Inicio de Sesion
	private void comprobarDatos() {
		
				//Este String me devuelve lo que haya escrito en el tf de usuario y el siguiente en pfUsuername solo que la forma es distinta
				String dni = tfDNI.getText();
				String pin = new String (pfPIN.getPassword());
				int i;
				boolean encontrado = false;
				
				

				//Recorremos el array de los usuarios para poder comprobar lo siguiente:
				for (i = 0; i < Almacen.lista_clientes.size(); i++) {
					// Si xiste usuario
					if(Almacen.lista_clientes.get(i).getDni().equals(dni) && Almacen.lista_clientes.get(i).getPin().equals(pin)) {
						encontrado = true;
						cliente = Almacen.lista_clientes.get(i);
					}
				}
				
				//y si existe podrá iniciar sesión
				if(encontrado){
					JOptionPane.showMessageDialog(btnIniciar, "LOGIN CORRECTO \nBienvenidx " + cliente.getNombre());
					frameLoginView.setVisible(false);
					new BancaView(cliente);
				//o no.
				}else{
					JOptionPane.showMessageDialog(btnIniciar, "           LOGIN INCORRECTO. \nIntroduzca sus datos correctamente \no registrése si no posee una cuenta.");
					}														

	}	
}