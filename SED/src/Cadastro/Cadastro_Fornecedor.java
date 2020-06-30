package Cadastro;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSeparator;

import java.awt.Color;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.xml.soap.Text;

import controller.FornecedorController;
import model.Endereco;
import model.Fornecedor;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.TextEvent;



public class Cadastro_Fornecedor extends JPanel {
	
	
	private JTextField textFantasia, textRazao, textCodigo, textIEstadual, textCnpj,
    		   textTelefone, textCriacaoDat, textDataCad, textLogradouro, textRua, textNumero, textCidade, textBairro, textCEP;
	private JLabel lblNomeFantasia,  lblInscEstadual, lblDataCadastro, lblRazoSocial, lblCodigo, lblCnpj, lblEmpresaDesde, lblTelefone,
		   lblRua,lblEndereco,lblLogradouro, lblCidade,lblNumero,lblCEP,lblUF,lblBairro;
	private JSeparator separator;
	private JButton btnSalvar,btnEditar, btnExcluir, btnSair;
	private JComboBox cBoxEstado;
   

	public Cadastro_Fornecedor() {
		
		
		
		setBackground(new Color(240, 255, 255));
		setLayout(null);
		lblNomeFantasia = new JLabel("Nome Fantasia  :");
		lblInscEstadual = new JLabel("Insc. Estadual  :");
		lblRazoSocial = new JLabel("Raz\u00E3o Social  :");
		lblCodigo = new JLabel("Codigo  :");
		lblCnpj = new JLabel("CNPJ  :");
		lblTelefone = new JLabel("Telefone  :");
		lblEmpresaDesde = new JLabel("Empresa Desde  :");
		lblDataCadastro = new JLabel("Data Cadastro :");
		lblEndereco = new JLabel("Endere\u00E7o");
		lblLogradouro = new JLabel("Logradouro   :");
		lblCEP = new JLabel("CEP  :");
		lblCidade = new JLabel("Cidade  :");
		lblUF = new JLabel("UF  :");
		lblNumero = new JLabel("Numero  :");
		lblBairro = new JLabel("Bairro :");
		lblRua = new JLabel("Rua  :");
		
		lblNomeFantasia.setBounds(334, 17, 105, 14);
		lblInscEstadual.setBounds(431, 42, 105, 14);
		lblRazoSocial.setBounds(14, 39, 91, 14);
		lblCodigo.setBounds(14, 14, 52, 14);
		lblCnpj.setBounds(14, 64, 46, 14);
		lblTelefone.setBounds(491, 67, 77, 14);
		lblEmpresaDesde.setBounds(14, 89, 110, 14);
		lblDataCadastro.setBounds(491, 92, 98, 14);
		lblBairro.setBounds(553, 179, 64, 14);
		lblEndereco.setBounds(20, 151, 65, 14);
		lblRua.setBounds(20, 176, 61, 14);
		lblLogradouro.setBounds(20, 211, 91, 13);
		lblCEP.setBounds(404, 179, 52, 14);
		lblUF.setBounds(406, 210, 23, 14);
		lblCidade.setBounds(197, 207, 59, 14);
		lblNumero.setBounds(208, 176, 84, 14);
	
		add(lblCnpj);
		add(lblRazoSocial);
		add(lblCodigo);
		add(lblInscEstadual);
		add(lblNomeFantasia);
		add(lblTelefone);
		add(lblEmpresaDesde);
		add(lblDataCadastro);
		add(lblEndereco);
		add(lblRua);
		add(lblLogradouro);
		add(lblCidade);
		add(lblNumero);
		add(lblCEP);
		add(lblUF);
		add(lblBairro);
		
		textRazao = new JTextField();
		textFantasia = new JTextField();
		textCodigo = new JTextField();
		textIEstadual = new JTextField();
		textCnpj = new JTextField();
		textTelefone = new JTextField();
		textCriacaoDat = new JTextField();
		textDataCad = new JTextField();
		textBairro = new JTextField();
		textCEP = new JTextField();
		textCidade = new JTextField();
		textLogradouro = new JTextField();
		textRua = new JTextField();
		textNumero = new JTextField();
		
		textRazao.setBounds(101, 36, 159, 20);
		textFantasia.setBounds(431, 14, 247, 20);
		textCodigo.setBounds(71, 11, 86, 20);
		textIEstadual.setBounds(528, 39, 150, 20);
		textCnpj.setBounds(82, 61, 159, 20);
		textTelefone.setBounds(565, 64, 113, 20);
		textCriacaoDat.setBounds(134, 86, 86, 20);
		textDataCad.setBounds(592, 91, 86, 20);
		textLogradouro.setBounds(99, 204, 88, 20);
		textRua.setBounds(62, 173, 135, 20);
		textBairro.setBounds(611, 176, 67, 20);
		textCEP.setBounds(445, 176, 98, 20);
		textCidade.setBounds(252, 201, 77, 20);
		textNumero.setBounds(270, 173, 55, 20);
		
		textRazao.setColumns(10);
		textFantasia.setColumns(10);
		textCodigo.setColumns(10);
		textIEstadual.setColumns(10);
		textCnpj.setColumns(10);
		textTelefone.setColumns(10);
		textCriacaoDat.setColumns(10);
		textDataCad.setColumns(10);
		textLogradouro.setColumns(10);
		textRua.setColumns(10);
		textBairro.setColumns(10);
		textCEP.setColumns(10);
		textCidade.setColumns(10);
		textNumero.setColumns(10);
		
		add(textRazao);
		add(textFantasia);
		add(textCodigo);
		add(textIEstadual);
		add(textCnpj);
		add(textTelefone);
		add(textCriacaoDat);
		add(textDataCad);
		add(textCEP);
		add(textLogradouro);
		add(textRua);
		add(textNumero);
		add(textCidade);
		add(textCEP);
		add(textBairro);
		
		separator = new JSeparator();
		
		separator.setBounds(0, 133, 688, 2);
		
		add(separator);
		
		
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Fornecedor f = new Fornecedor();
				Endereco e = new Endereco();
				f.setCNPJ(textCnpj.getText());
				f.setFantasia(textFantasia.getText());
				f.setRazaoSocial(textRazao.getText());
				f.setInsc_Est(textIEstadual.getText());
				f.setTelefone(textTelefone.getText());
				//f.setDataCriacao(new SimpleDateFormat("dd/MM/yyyy").format(f.getDataCriacao()));
				//f.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").format(f.getDataCadastro()));
				e.setBairro(textBairro.getText());
				e.setCep(textCEP.getText());
				e.setCidade(textCidade.getText());
				//e.setEstado(cBoxEstado.get());
				e.setLogradouro(textLogradouro.getText());
				e.setNumero(textNumero.getText());
				e.setRua(textRua.getText());
			
				f.setEndereco(e);
				FornecedorController fc = new FornecedorController();
				try {
					fc.salvar(f);
				} catch (SQLException | ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		

		btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Fornecedor f = new Fornecedor();
				Endereco e = new Endereco();
				f.setCNPJ(textCnpj.getText());
				f.setFantasia(textFantasia.getText());
				f.setRazaoSocial(textRazao.getText());
				f.setInsc_Est(textIEstadual.getText());
				f.setTelefone(textTelefone.getText());
				//f.setDataCriacao(new SimpleDateFormat("dd/MM/yyyy").format(f.getDataCriacao()));
				//f.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").format(f.getDataCadastro()));
				e.setBairro(textBairro.getText());
				e.setCep(textCEP.getText());
				e.setCidade(textCidade.getText());
				//e.setEstado(cBoxEstado.get());
				e.setLogradouro(textLogradouro.getText());
				e.setNumero(textNumero.getText());
				e.setRua(textRua.getText());
			
				f.setEndereco(e);
				FornecedorController fc = new FornecedorController();
			}
		});

		btnExcluir = new JButton("Excluir");
		
		btnSair = new JButton("Sair");
		
		btnSalvar.setBounds(10, 256, 91, 23);
		btnSair.setBounds(587, 259, 91, 23);
		btnExcluir.setBounds(201, 256, 91, 23);
		btnEditar.setBounds(106, 256, 91, 23);
		
		
		add(btnSalvar);
		add(btnExcluir);
		add(btnEditar);
		add(btnSair);
		
		
		cBoxEstado = new JComboBox();
		cBoxEstado.setBounds(442, 207, 105, 20);
		add(cBoxEstado);
		
	
	}
}
