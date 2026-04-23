//Eduardo Mateus de Azevedo RA 5456681
//Kayky Sena RA 5395551


package aula09;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class TelaEuro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtValor1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEuro frame = new TelaEuro();
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
	public TelaEuro() {
		setTitle("Converter de Real para Dólar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblValor1 = new JLabel("Digite o valor para converter:");
		lblValor1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValor1.setBounds(10, 87, 208, 20);
		contentPane.add(lblValor1);
		
		JLabel lblTitulo1 = new JLabel("Converter de Real para Euro");
		lblTitulo1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTitulo1.setBounds(212, 11, 206, 14);
		contentPane.add(lblTitulo1);
		
		txtValor1 = new JTextField();
		txtValor1.setBounds(228, 89, 86, 20);
		contentPane.add(txtValor1);
		txtValor1.setColumns(10);
		
		JTextArea txtAreaResultado1 = new JTextArea();
		txtAreaResultado1.setBounds(10, 167, 225, 97);
		contentPane.add(txtAreaResultado1);
		
		JLabel lblResultado1 = new JLabel("Resultado:");
		lblResultado1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResultado1.setBounds(10, 142, 86, 14);
		contentPane.add(lblResultado1);
		
		JButton btnConverter1 = new JButton("Converter");
		btnConverter1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conversor conversor = new Conversor();
				DecimalFormat df = new DecimalFormat("#.##");
				conversor.valorEuro = 6.10;
				double valorDigitado = Double.parseDouble(txtValor1.getText());
				double resultado = conversor.converterEuro(valorDigitado);
				
				txtAreaResultado1.setText("€ " + df.format(resultado));
			}
		});
		btnConverter1.setBounds(261, 201, 129, 63);
		contentPane.add(btnConverter1);
		
		JButton btnVoltar1 = new JButton("Voltar");
		btnVoltar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar1.setBounds(10, 319, 120, 39);
		contentPane.add(btnVoltar1);
		

	}

}
