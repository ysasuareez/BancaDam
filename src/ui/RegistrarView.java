package ui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import models.Cliente;
import utils.Almacen;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;


import javax.swing.border.EtchedBorder;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class RegistrarView {

	private JFrame frameRegistrarView;
	private JLabel lblNombre;
	private JTextField tfNombre;
	private JLabel lblNewPin;
	private JLabel lblNewPin2;
	private JButton btnVolverLogin;
	private JFrame parent;
	private JButton btnRegistrarNew;
	private JPasswordField pfPIN;
	private JPasswordField pfPIN2;
	private JLabel lblBienvenido;
	private JPanel Pantalla;	
	private Cliente cliente;
	private JTextField tfApellidos;
	private JLabel lblApellidos;
	private JLabel lblDNI;
	private JLabel lblSueldo;
	private JTextField tfDNI;
	private JTextField tfSueldo;
	/**
	 * Create the application.
	 */
	public RegistrarView(JFrame parent) {
		initialize();
		this.parent = parent;	
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
		frameRegistrarView = new JFrame();		
		frameRegistrarView.getContentPane().setBackground(Color.RED);
		frameRegistrarView.getContentPane().setLayout(null);
		
		frameRegistrarView.setTitle("Men\u00FA Registro");
		frameRegistrarView.setBounds(100, 100, 411, 493);
		frameRegistrarView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameRegistrarView.setVisible(true);
		
		lblBienvenido = new JLabel("BANK DAM");
		lblBienvenido.setBounds(10, 10, 387, 45);
		frameRegistrarView.getContentPane().add(lblBienvenido);
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setForeground(Color.WHITE);
		lblBienvenido.setFont(new Font("Alef", Font.BOLD, 25));
		
		Pantalla = new JPanel();
		Pantalla.setBounds(0, 66, 397, 390);
		frameRegistrarView.getContentPane().add(Pantalla);
		Pantalla.setLayout(null);
		Pantalla.setForeground(Color.BLACK);
		Pantalla.setBorder(null);
		Pantalla.setBackground(Color.WHITE);
		
		
		
		//LABLE que indica que tiene que escribir el nuevo username
		lblNombre = new JLabel("NOMBRE");
		lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombre.setFont(new Font("Alef", Font.PLAIN, 16));
		lblNombre.setBounds(61, 44, 91, 31);
		Pantalla.add(lblNombre);
		
		//donde se escribe el nuevo username
		tfNombre = new JTextField();
		tfNombre.setFont(new Font("Courier New", Font.PLAIN, 13));
		tfNombre.setBounds(194, 45, 131, 24);
		Pantalla.add(tfNombre);
		tfNombre.setColumns(10);
		
		
		
		//LABLE que indica que tiene que escribir la nueva contraseña
		lblNewPin = new JLabel("PIN");
		lblNewPin.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewPin.setFont(new Font("Alef", Font.PLAIN, 16));
		lblNewPin.setBounds(61, 202, 93, 31);
		Pantalla.add(lblNewPin);
		
		//donde se escribe la nueva contraseña
		pfPIN = new JPasswordField();
		pfPIN.setFont(new Font("Courier New", Font.PLAIN, 13));
		pfPIN.setBounds(194, 208, 131, 24);
		Pantalla.add(pfPIN);
		
		
		
		//LABLE que indica que tiene que repetir la nueva contraseña
		lblNewPin2 = new JLabel("REPETIR PIN");
		lblNewPin2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewPin2.setFont(new Font("Alef", Font.PLAIN, 16));
		lblNewPin2.setBounds(61, 243, 98, 31);
		Pantalla.add(lblNewPin2);
		
		//donde se repite
		pfPIN2 = new JPasswordField();
		pfPIN2.setFont(new Font("Courier New", Font.PLAIN, 13));
		pfPIN2.setBounds(194, 249, 131, 24);
		Pantalla.add(pfPIN2);
		
		lblApellidos = new JLabel("APELLIDOS");
		lblApellidos.setHorizontalAlignment(SwingConstants.LEFT);
		lblApellidos.setFont(new Font("Alef", Font.PLAIN, 16));
		lblApellidos.setBounds(61, 79, 93, 31);
		Pantalla.add(lblApellidos);
		
		tfApellidos = new JTextField();
		tfApellidos.setFont(new Font("Courier New", Font.PLAIN, 13));
		tfApellidos.setColumns(10);
		tfApellidos.setBounds(194, 85, 131, 24);
		Pantalla.add(tfApellidos);
		
		lblDNI = new JLabel("DNI");
		lblDNI.setHorizontalAlignment(SwingConstants.LEFT);
		lblDNI.setFont(new Font("Alef", Font.PLAIN, 16));
		lblDNI.setBounds(61, 120, 93, 31);
		Pantalla.add(lblDNI);
		
		lblSueldo = new JLabel("SUELDO");
		lblSueldo.setHorizontalAlignment(SwingConstants.LEFT);
		lblSueldo.setFont(new Font("Alef", Font.PLAIN, 16));
		lblSueldo.setBounds(61, 161, 98, 31);
		Pantalla.add(lblSueldo);
		
		btnRegistrarNew = new JButton("REGISTRAR");
		btnRegistrarNew.setBounds(104, 298, 180, 24);
		Pantalla.add(btnRegistrarNew);
		btnRegistrarNew.setForeground(new Color(255, 255, 255));
		btnRegistrarNew.setFont(new Font("Alef", Font.BOLD, 14));
		btnRegistrarNew.setBackground(new Color(102, 153, 204));
		
		
		
		//BOTON registrar que añadira los campos en el arraylist
		btnVolverLogin = new JButton("VOLVER");
		btnVolverLogin.setBounds(104, 332, 180, 24);
		Pantalla.add(btnVolverLogin);
		btnVolverLogin.setFont(new Font("Alef", Font.BOLD, 14));
		btnVolverLogin.setForeground(new Color(255, 255, 255));
		btnVolverLogin.setBackground(new Color(102, 153, 204));
		
		tfDNI = new JTextField();
		tfDNI.setBounds(194, 126, 131, 24);
		Pantalla.add(tfDNI);
		
		tfSueldo = new JTextField();
		tfSueldo.setBounds(194, 167, 131, 24);
		Pantalla.add(tfSueldo);
		tfDNI.setColumns(10);
		
			
				
	}
	
		/**
		 * Métodos
		 */
		private void configureListeners() {
			
			//El botón de registrar si todo funciona haría visible de nuevo la pagina de Login
			btnVolverLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frameRegistrarView.dispose();
					parent.setVisible(true);
					
				}				
			});
			
			//con intro se active el btnRegistrar
			pfPIN2.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						//Llamamos al método que controlará los datos.
						introducirDatos();
						
						
					}
				}
			});
			
			//Dará paso al registro si todo es correcto
			btnRegistrarNew.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//Llamamos al método que controlará los datos.
					introducirDatos();
				}
			});
			
			//con intro se activa el btnIniciar
			btnRegistrarNew.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						introducirDatos();
					}
				}
			});
			
			
		}

			
		
		//Metodo para controlar que los datos de Registro
		private void introducirDatos() {
			
			//Creamos las variables necesarias
			String nombre = tfNombre.getText();
			String apellidos = tfApellidos.getText();
			String dni = tfDNI.getText();
			int sueldo = Integer.parseInt(tfSueldo.getText());
			String pin = new String (pfPIN.getPassword());
			String pin2 = new String (pfPIN2.getPassword());
			boolean existe = false; 
			
			//Si las dos contraseñas instroducidas son distintas, lanzará mensaje y no se hará nada mas
			if (!pin.equals(pin2)) {												
				JOptionPane.showMessageDialog(btnRegistrarNew, "Las constraseñas no son iguales, vuelve a intentarlo.");
			//Si son iguales, valorará que no exista ningun username igual y además te indicará cuales son tus opciones en ese caso
			} else {		
				for(int i = 0; i < Almacen.lista_clientes.size(); i++) {
					if(Almacen.lista_clientes.get(i).getDni().equals(dni)) {
						JOptionPane.showMessageDialog(btnRegistrarNew, "Este usuario ya existe. \nCambie de username o vaya al Login");
						existe = true;
					}else {
						//El usuario no exite y además sus contraseñas son iguales, pasariamos a lo siguiente:
						existe = false;
					}
				}	
					//Se puede crear el usuario por lo que se añade al arrayList de users que tenemos en Almacén
					if(existe == false) {
						Almacen.lista_clientes.add(new Cliente(nombre, apellidos, dni, sueldo, pin));
						JOptionPane.showMessageDialog(btnRegistrarNew, "Usuario creado con éxito. \nBienvenidx " + nombre);
						//Además nos llevará a la página de LoginView para pode iniciar sesión.
						frameRegistrarView.dispose();
						parent.setVisible(true);
					
				}												
			}					
		}
}