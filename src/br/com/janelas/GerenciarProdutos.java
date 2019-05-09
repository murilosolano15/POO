package br.com.janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.loja.Categoria;
import com.loja.Fornecedor;
import com.loja.Produto;

public class GerenciarProdutos extends JFrame {
	
	//Elementos para a categoria
	static JLabel lblIdCat = new JLabel("Id Categoria:");
	static JLabel lblNomeCat = new JLabel("Nome Categoria:");
	static JLabel lblDescCat = new JLabel("Descri��o:");
	
	
	static JTextField txtIdCat = new JTextField();
	static JTextField txtNomeCat = new JTextField();
	static JTextField txtDescCat = new JTextField();
	
	static JButton btnCadCat = new JButton("Cadastrar Categoria");
	
	
	//Elementos para o fornecedor
	static JLabel lblIdFor = new JLabel("Id Fornecedor:");
	static JLabel lblRS = new JLabel("Raz�o Social:");
	static JLabel lblCnpj = new JLabel("CNPJ:");
	
	
	static JTextField txtIdFor = new JTextField();
	static JTextField txtRS = new JTextField();
	static JTextField txtCnpj = new JTextField();
	
	static JButton btnCadFor = new JButton("Cadastrar Fornecedor");
	
	
	//Elementos para produtos 
	static JLabel lblIdPr = new JLabel("Id Produto:");
	static JLabel lblNomePr = new JLabel("Nome do Produto:");
	static JLabel lblDescPr = new JLabel("Descri��o Produto:");
	static JLabel lblCategoria = new JLabel("Selecione uma Categoria:");
	static JLabel lblFornecedor = new JLabel("Selecione um Fornecedor:");
	static JLabel lblPrecoPr = new JLabel("Pre�o do Produto:");
	
	
	static JTextField txtIdPr = new JTextField();
	static JTextField txtNomePr = new JTextField();
	static JTextField txtDescPr = new JTextField();
	static JTextField txtCategoria = new JTextField();
	static JTextField txtFornecedor = new JTextField();
	static JTextField txtPrecoPr = new JTextField();
	
	static JButton btnCadPr = new JButton("Cadastrar Produto");
	
	
	public static void main(String[] args) {
		JFrame gerenciar = new JFrame();
		gerenciar.setTitle("Gerenciar Produtos");//titulo da pagina
		gerenciar.setSize(700,600);//tamanho da janela
		gerenciar.setLocationRelativeTo(null);//deixar a tela no centro
		gerenciar.setDefaultCloseOperation(EXIT_ON_CLOSE);//sair da memoria
		gerenciar.setResizable(false);//janela sempre do mesmo tamanho e nao permite redirecionamento
		
		//Definir o gerenciamento do layout como absoluto, ou seja, nulo
		gerenciar.getContentPane().setLayout(null);
		
		lblIdCat.setBounds(10, 10, 150,30);
		gerenciar.add(lblIdCat);
		
		txtIdCat.setBounds(10,45,100,30);
		gerenciar.add(txtIdCat);
		
		lblNomeCat.setBounds(10, 75, 150, 30);
		gerenciar.add(lblNomeCat);
		
		txtNomeCat.setBounds(10,110,160,30);
		gerenciar.add(txtNomeCat);
		
		lblDescCat.setBounds(10,145,150,30);
		gerenciar.add(lblDescCat);
		
		txtDescCat.setBounds(10,175,160,30);
		gerenciar.add(txtDescCat);
		
		btnCadCat.setBounds(10,220,160,30);
		gerenciar.add(btnCadCat);
		
		//---------------------CADASTRAR FORNECEDOR-------------------
		
		lblIdFor.setBounds(10,285,165,30);
		gerenciar.add(lblIdFor);
		txtIdFor.setBounds(10,315,100,30);
		gerenciar.add(txtIdFor);
		lblRS.setBounds(10,345,165,30);
		gerenciar.add(lblRS);
		txtRS.setBounds(10,375,165,30);
		gerenciar.add(txtRS);
		lblCnpj.setBounds(10,408,165,30);
		gerenciar.add(lblCnpj);
		txtCnpj.setBounds(10,438,165,30);
		gerenciar.add(txtCnpj);
		btnCadFor.setBounds(10,485,165,30);
		gerenciar.add(btnCadFor);
		
		//---------------------CADASTRAR PRODUTO------------------------
		
		lblIdPr.setBounds(240,10,160,30);
		gerenciar.add(lblIdPr);
		txtIdPr.setBounds(240,45,100,30);
		gerenciar.add(txtIdPr);
		
		lblNomePr.setBounds(240,75,160,30);
		gerenciar.add(lblNomePr);
		txtNomePr.setBounds(240,110,430,30);
		gerenciar.add(txtNomePr);
		
		lblDescPr.setBounds(240,142,160,30);
		gerenciar.add(lblDescPr);
		txtDescPr.setBounds(240,174,430,110);
		gerenciar.add(txtDescPr);
		
		lblCategoria.setBounds(240,287,160,30);
		gerenciar.add(lblCategoria);
		txtCategoria.setBounds(240,317,430,30);
		gerenciar.add(txtCategoria);
		
		lblFornecedor.setBounds(240,347,430,30);
		gerenciar.add(lblFornecedor);
		txtFornecedor.setBounds(240,377,430,30);
		gerenciar.add(txtFornecedor);
		
		lblPrecoPr.setBounds(240,407,430,30);
		gerenciar.add(lblPrecoPr);
		txtPrecoPr.setBounds(240,437,100,30);
		gerenciar.add(txtPrecoPr);
		
		btnCadPr.setBounds(240,485,165,30);
		gerenciar.add(btnCadPr);
		
		//------------ desabiltar os controles textfield do
		//------------fornecedor e produtos 
		//------------
		
		txtIdFor.setEnabled(false);
		txtRS.setEnabled(false);
		txtCnpj.setEnabled(false);
		btnCadFor.setEnabled(false);
		
		txtIdPr.setEnabled(false);
		txtNomePr.setEnabled(false);
		txtDescPr.setEnabled(false);
		txtFornecedor.setEnabled(false);
		txtCategoria.setEnabled(false);
		txtPrecoPr.setEnabled(false);
		btnCadPr.setEnabled(false);
		
		//============= Vamos criar o objeto categoria e
		//============= passar os dados do formulario para
		//============= o objeto criado
		Categoria cat = new Categoria();
		
		//---- Vamos fazer a passagem dos dados para o objeto
		//---- no momento em que clicarmos no bot�o de cadastro
		btnCadCat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cat.setId(Integer.parseInt(txtIdCat.getText()));
				cat.setNome(txtNomeCat.getText());
				cat.setDescricao(txtDescCat.getText());
				
				//-----desabilitar as caixas da categoria;
				txtIdCat.setEnabled(false);
				txtNomeCat.setEnabled(false);
				txtDescCat.setEnabled(false);
				btnCadCat.setEnabled(false);
				//-----habilitar as caixas do fornecedor 
			
				txtIdFor.setEnabled(true);
				txtRS.setEnabled(true);
				txtCnpj.setEnabled(true);
				btnCadFor.setEnabled(true);
			}
		});
		
		//---- Vamos instanciar a classe fornecedor e passar
		//---- os dados para o objeto no momento em que 
		//---- o botao de cadastro for clicado
		Fornecedor f = new Fornecedor();
		
		btnCadFor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setId(Integer.parseInt(txtIdFor.getText()));
				f.setRazaoSocial(txtRS.getText());
				f.setCnpj(txtCnpj.getText());
				
				//--------dasabilitar as caixas do fornecedor 
				txtIdFor.setEnabled(false);
				txtRS.setEnabled(false);
				txtCnpj.setEnabled(false);
				btnCadFor.setEnabled(false);
				
				//-- habilitar os controles produto 
				txtIdPr.setEnabled(true);
				txtNomePr.setEnabled(true);
				txtDescPr.setEnabled(true);
				txtFornecedor.setEnabled(true);
				txtCategoria.setEnabled(true);
				txtPrecoPr.setEnabled(true);
				btnCadPr.setEnabled(true);
				
				
			}
		});
			
		
		//----- Vamos criar um objeto baseado em
		//----- produtos para passar os dados momento do clique
		//----- bot�o cadastro
		
		Produto pr = new  Produto();
		btnCadPr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pr.setId(Integer.parseInt(txtIdPr.getText()));
				pr.setNome(txtNomePr.getText());
				pr.setDescricao(txtDescPr.getText());
				pr.setCategoria(cat);
				pr.setFornecedor(f);
				pr.setPreco(Double.parseDouble(txtPrecoPr.getText()));
				
				//--------- Dasabilitar os controles do produto 
				txtIdPr.setEnabled(false);
				txtNomePr.setEnabled(false);
				txtDescPr.setEnabled(false);
				txtFornecedor.setEnabled(false);
				txtCategoria.setEnabled(false);
				txtPrecoPr.setEnabled(false);
				btnCadPr.setEnabled(false);
				//---- Caixa de confirma��o
				JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
				
				//Habilitar Categorias 
				txtIdCat.setEnabled(true);
				txtNomeCat.setEnabled(true);
				txtDescCat.setEnabled(true);
				btnCadCat.setEnabled(true);
				
			}
		});
		
		
		
		
		
		
		
		gerenciar.setVisible(true);
		

	}

}
