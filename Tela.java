//Eduardo Mateus de Azevedo RA 5456681
//Kayky Sena RA 5395551


package aula09;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela() {
		setTitle("Conversor de moedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 427);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Selecione a moeda para converter");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTitulo.setBounds(138, 11, 249, 14);
		contentPane.add(lblTitulo);
		
		JButton btnDolar = new JButton("Dólar");
		btnDolar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaDolar telaDolar = new TelaDolar();
				telaDolar.setVisible(true);
			}
		});
		btnDolar.setBounds(10, 94, 115, 62);
		contentPane.add(btnDolar);
		
		JButton btnEuro = new JButton("Euro");
		btnEuro.setForeground(new Color(0, 0, 0));
		btnEuro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TelaEuro telaEuro = new TelaEuro();
					telaEuro.setVisible(true);
			}
		});
		btnEuro.setBounds(138, 94, 128, 62);
		contentPane.add(btnEuro);

	}
}
