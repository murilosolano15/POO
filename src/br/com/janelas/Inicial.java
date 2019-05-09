package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Inicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicial frame = new Inicial();
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
	public Inicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPessoaJuridica = new JButton("Pessoa Juridica");
		btnPessoaJuridica.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPessoaJuridica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrarJuridica jpf = new cadastrarJuridica();
				jpf.setVisible(true);
				
			}
		});
		
		btnPessoaJuridica.setBounds(233, 110, 156, 43);
		contentPane.add(btnPessoaJuridica);
		
		JButton btnPessoafisica = new JButton("Pessoa Fisica");
		btnPessoafisica.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPessoafisica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrarFisica jpf = new cadastrarFisica();
				jpf.setVisible(true);
			}
			
		});
		
		btnPessoafisica.setBounds(46, 110, 156, 43);
		contentPane.add(btnPessoafisica);
	}
}
