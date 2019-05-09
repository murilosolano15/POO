package br.com.janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.classes.Usuario;

public class GerenciarUsuarios extends JFrame{

	public static void main(String[] args) {
		
		//instancia da classe JFrame
		JFrame janela = new JFrame();
		janela .setSize(505,400);//tamanho da janela
		janela.setTitle("Gerenciar Usuarios");//titulo da janela
		janela.setLocationRelativeTo(null);//alinha a janela no centro da tela
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);//fechar quando apertar o "X"	
		janela.setResizable(false); //impede que a jenela seja redimensionado
		
		//Vamos chamar o gerenciador de layout do java
		//usaremos o gerenciador null(nulo). isso fará com que 
		//o gerenciador seja encarado como absolute(absoluto)
		janela.getContentPane().setLayout(null);
		
		//Agora podemos criar nossos componentes e posicioná-los 
		//da maneira que quisermos
		JButton btnCadastrar = new JButton("Cadastrar");
		
		/*
		 * O fato de você ter configurado o gerenciador de layout
		 * como null(absolute) lhe permite posicionar os elementos(componentes)
		 * em qualquer parte da tela usando coordenadas:
		 * x -> posicão horizontal
		 * y -> posicão vertical
		 * widht -> largura
		 * height -> altura
		 */
		btnCadastrar.setBounds(10, 300, 150, 30);
		//Para adicionar o botao a janela iremos usar 
		//o comando add e passar como parâmetro o componente 
		//que neste caso é o btnCadastrar
		janela.add(btnCadastrar);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.setBounds(170, 300, 150, 30);
		janela.add(btnLogar);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(330, 300, 150, 30);
		janela.add(btnLogout);
		
		//Vamos inserir as labels a janela 
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(10, 50, 100, 30);
		janela.add(lblLogin);
		
		//Vamos inserir a TextFields a janela
		JTextField txtLogin = new JTextField();
		txtLogin.setBounds(120, 50, 330, 30);
		janela.add(txtLogin);
		
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(10, 100, 100, 30);
		janela.add(lblSenha);
		
		JPasswordField txtSenha = new JPasswordField();
		txtSenha.setBounds(120, 100, 330, 30);
		janela.add(txtSenha);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setBounds(10, 160, 100, 30);
		janela.add(lblStatus);
		
		
		JTextField txtStatus = new JTextField();
		txtStatus.setBounds(120, 150, 330, 130);
		janela.add(txtStatus);
		
		
		/*
		 *Vamos adicionar a ação de click ao botão cadastrar e realizar
		 *a chamada do método cadastrar que está na classe Usuario 
		 */
		
		Usuario us = new Usuario();  
		
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				us.login = txtLogin.getText();//pegar o que foi escrito na caixa do login
				us.senha = txtSenha.getText();//pegar o que foi escrito na caixa da senha
				txtStatus.setText(us.cadastrar());us.cadastrar();
				
			}
		});
		
		btnLogar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				txtStatus.setText(us.logar());
				
			}
		});
		
		btnLogout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				txtStatus.setText(us.logout());
				
			}
		});
		
		
		janela.setVisible(true);
		

	}

}
