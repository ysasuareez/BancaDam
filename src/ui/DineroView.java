package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import models.Cliente;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DineroView {

	private JFrame frameDineroView;
	private JFrame parent;
	private JLabel lblBienvenido;
	private Cliente cliente;
	private JPanel Pantalla2;
	private JTextField tfContra;
	private JLabel lblCambiarContra;
	private JButton btnVolverBanca;
	private JButton btnGuardar;
	private JLabel lblCambiarSueldo;
	private JTextField tfSueldo;


	/**
	 * Create the application.
	 */
	public DineroView(JFrame parent, Cliente cliente) {
		this.parent = parent;
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
	
	private void configureUIComponents() {
		frameDineroView = new JFrame();
		frameDineroView.getContentPane().setBackground(Color.RED);
		frameDineroView.setBounds(100, 100, 411, 493);
		frameDineroView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameDineroView.getContentPane().setLayout(null);
		frameDineroView.setVisible(true);
		
		lblBienvenido = new JLabel("BANK DAM");
		lblBienvenido.setBounds(10, 11, 387, 45);
		frameDineroView.getContentPane().add(lblBienvenido);
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setForeground(Color.WHITE);
		lblBienvenido.setFont(new Font("Alef", Font.BOLD, 25));
		
		Pantalla2 = new JPanel();
		Pantalla2.setLayout(null);
		Pantalla2.setForeground(Color.BLACK);
		Pantalla2.setBorder(null);
		Pantalla2.setBackground(Color.WHITE);
		Pantalla2.setBounds(0, 66, 397, 390);
		frameDineroView.getContentPane().add(Pantalla2);
		
		tfContra = new JTextField();
		tfContra.setColumns(10);
		tfContra.setBounds(104, 82, 188, 37);
		Pantalla2.add(tfContra);
		
		lblCambiarContra = new JLabel("CAMBIAR CONTRASE\u00D1A:");
		lblCambiarContra.setFont(new Font("Alef", Font.PLAIN, 16));
		lblCambiarContra.setBounds(104, 37, 268, 44);
		Pantalla2.add(lblCambiarContra);
		
		btnVolverBanca = new JButton("VOLVER");
		btnVolverBanca.setForeground(Color.WHITE);
		btnVolverBanca.setFont(new Font("Alef", Font.BOLD, 14));
		btnVolverBanca.setBackground(new Color(102, 153, 204));
		btnVolverBanca.setBounds(211, 256, 113, 31);
		Pantalla2.add(btnVolverBanca);
		
		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setFont(new Font("Alef", Font.BOLD, 14));
		btnGuardar.setBackground(new Color(102, 153, 204));
		btnGuardar.setBounds(77, 256, 113, 31);
		Pantalla2.add(btnGuardar);
		
		lblCambiarSueldo = new JLabel("CAMBIAR SUELDO:");
		lblCambiarSueldo.setFont(new Font("Alef", Font.PLAIN, 16));
		lblCambiarSueldo.setBounds(104, 139, 268, 44);
		Pantalla2.add(lblCambiarSueldo);
		
		tfSueldo = new JTextField();
		tfSueldo.setColumns(10);
		tfSueldo.setBounds(104, 184, 188, 37);
		Pantalla2.add(tfSueldo);
	}
	
	private void configureListeners() {
	}
}
