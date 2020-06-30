package Cadastro;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import controller.ProdutoController;
import model.Produto;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.text.ParseException;

public class Cadastro_Produto extends JPanel {
	private JTextField txtNome, txtCodBarra, txtCodigo, txtDatCad, txtDescricao;
	private JLabel lblNome, lblDescricao, lblCodigoDeBarra, lblCodigoProduto, lblDataCadastro;  
	private JButton btnsalvar, btnexcluir, btneditar, btnsair;
	/**
	 * Create the panel.
	 */
	public Cadastro_Produto() {
		setBackground(new Color(240, 255, 255));
		setLayout(null);
		
		lblNome = new JLabel("Nome:");
		lblDescricao = new JLabel("Descri\u00E7\u00E3o  :");
		lblCodigoDeBarra = new JLabel("Codigo de Barra  :");
		lblCodigoProduto = new JLabel("Codigo Produto  :");
		lblDataCadastro = new JLabel("Data Cadastro :");
		
		lblNome.setBounds(505, 14, 57, 14);
		lblDescricao.setBounds(406, 45, 71, 14);
		lblCodigoDeBarra.setBounds(14, 39, 113, 14);
		lblCodigoProduto.setBounds(14, 14, 113, 14);
		lblDataCadastro.setBounds(485, 77, 97, 14);
		
		add(lblNome);
		add(lblDescricao);
		add(lblCodigoDeBarra);
		add(lblCodigoProduto);
		add(lblDataCadastro);
		
		txtNome = new JTextField();
		txtCodBarra = new JTextField();
		txtCodigo = new JTextField();
		txtDatCad = new JTextField();
		txtDescricao = new JTextField();
		
		txtNome.setColumns(10);
		txtCodBarra.setColumns(10);
		txtCodigo.setColumns(10);
		txtDatCad.setColumns(10);
		txtDescricao.setColumns(10);
		
		txtNome.setBounds(555, 11, 107, 20);
		txtCodBarra.setBounds(125, 36, 159, 20);
		txtCodigo.setBounds(126, 11, 86, 20);
		txtDatCad.setBounds(576, 74, 86, 20);
		txtDescricao.setBounds(477, 42, 185, 20);
		
		add(txtCodBarra);
		add(txtNome);
		add(txtCodigo);
		add(txtDatCad);
		add(txtDescricao);
		
		btnsalvar = new JButton("Salvar");
		btnsalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Produto p = new Produto ();
				
				p.setNome(txtNome.getText());
				p.setDescricao(txtDescricao.getText());
				p.setCodBar(txtCodBarra.getText());
				
				ProdutoController pc = new ProdutoController();
				try {
					pc.Salvar(p);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnexcluir = new JButton("Excluir");
		btneditar = new JButton("Editar");
		btnsair = new JButton("Sair");

		btnsalvar.setBounds(14, 221, 91, 23);
		btnexcluir.setBounds(209, 221, 91, 23);
		btneditar.setBounds(110, 221, 91, 23);
		btnsair.setBounds(571, 221, 91, 23);
		
		add(btnsalvar);
		add(btnexcluir);
		add(btneditar);
		add(btnsair);
	}

}
