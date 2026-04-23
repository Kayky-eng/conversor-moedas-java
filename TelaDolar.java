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
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TelaDolar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDolar frame = new TelaDolar();
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
	public TelaDolar() {
		setTitle("Converter de Real para Dólar");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 533, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Converter de Real para Dólar");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTitulo.setBounds(151, 11, 212, 14);
		contentPane.add(lblTitulo);
		
		JLabel lblValor = new JLabel("Digite o valor para converter:");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValor.setBounds(10, 55, 217, 19);
		contentPane.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setBounds(227, 54, 86, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JTextArea txtAreaResultado = new JTextArea();
		txtAreaResultado.setEditable(false);
		txtAreaResultado.setBounds(10, 139, 192, 75);
		contentPane.add(txtAreaResultado);
		
		JLabel lblResultado = new JLabel("Resultado:\r\n");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResultado.setBounds(10, 114, 92, 14);
		contentPane.add(lblResultado);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conversor conversor = new Conversor();
				DecimalFormat df = new DecimalFormat("#.##");
				conversor.valorDolar = 5.23;
				double valorDigitado = Double.parseDouble(txtValor.getText());
				double resultado = conversor.converterDolar(valorDigitado);
				
				txtAreaResultado.setText("$ " + df.format(resultado));
			}
		});
		btnConverter.setBackground(new Color(128, 255, 128));
		btnConverter.setBounds(224, 140, 111, 74);
		contentPane.add(btnConverter);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(new Color(128, 255, 128));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setBounds(10, 236, 89, 23);
		contentPane.add(btnVoltar);

	}
}
