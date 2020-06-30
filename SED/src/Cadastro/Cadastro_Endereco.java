package Cadastro;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import model.Endereco;
import controller.EnderecoController;

import java.awt.Color;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro_Endereco extends JPanel { 
	private JTextField textRua, textNumero, textCidade, textBairro, textCep, textLogradouro;
	private JLabel lblEndereco, lblRua, lblNumero, lblCidade, lblEstado, lblCep, lblBairro, lblLogradouro; 
	private JButton Excluir, Editar, Salvar, Sair;
	

	
	JComboBox comboEstado;
	/**
	 * Create the panel.
	 */
	public Cadastro_Endereco() {
		setBackground(new Color(240, 255, 255));
		setLayout(null);
		
		lblEndereco = new JLabel("Endere\u00E7o");
		lblRua = new JLabel("Rua  :");
		lblNumero = new JLabel("Numero  :");
		lblCidade = new JLabel("Cidade  :");
		lblEstado = new JLabel("UF  :");
		lblCep = new JLabel("CEP  :");
		lblBairro = new JLabel("Bairro :");
		lblLogradouro = new JLabel("Logradouro   :");
		
		lblEndereco.setBounds(20, 11, 65, 14);
		lblRua.setBounds(20, 36, 61, 14);
		lblNumero.setBounds(208, 36, 84, 14);
		lblCidade.setBounds(197, 67, 59, 14);
		lblEstado.setBounds(406, 70, 23, 14);
		lblCep.setBounds(404, 39, 52, 14);
		lblBairro.setBounds(553, 39, 64, 14);
		lblLogradouro.setBounds(20, 71, 91, 13);
		
		Excluir = new JButton("Excluir");
		Editar = new JButton("Editar");
		Salvar = new JButton("Salvar");
		Salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Sair = new JButton("Sair");
		
		Excluir.setBounds(201, 116, 91, 23);
		Editar.setBounds(106, 116, 91, 23);
		Salvar.setBounds(10, 116, 91, 23);
		Sair.setBounds(587, 119, 91, 23);
		
		textNumero = new JTextField();
		textRua = new JTextField();
		textCidade = new JTextField();
		textBairro = new JTextField();
		textCep = new JTextField();
		textLogradouro = new JTextField();
		
		textNumero.setColumns(10);
		textRua.setColumns(10);
		textCidade.setColumns(10);
		textBairro.setColumns(10);
		textCep.setColumns(10);
		textLogradouro.setColumns(10);
		
		textNumero.setBounds(270, 33, 55, 20);
		textRua.setBounds(62, 33, 135, 20);
		textCidade.setBounds(252, 61, 77, 20);
		textBairro.setBounds(611, 36, 67, 20);
		textCep.setBounds(445, 36, 98, 20);
		textLogradouro.setBounds(99, 64, 88, 20);
		
		add(lblEndereco);
		add(lblRua);
		add(lblNumero);
		add(lblCidade);
		add(lblEstado);
		add(lblCep);
		add(lblBairro);
		add(lblLogradouro);
		
		add(Excluir);
		add(Editar);
		add(Salvar);
		add(Sair);
		
		add(textNumero);
		add(textRua);
		add(textCidade);
		add(textBairro);
		add(textCep);
		add(textLogradouro);
		
		comboEstado = new JComboBox();
		
		comboEstado.setBounds(442, 67, 105, 20);
		
		add(comboEstado);
		

	}
	private void getValores(int index) {
		List<Endereco> enderecoList = new EnderecoController().listaEndereco();
	     int registroAtual = 0;
        if (index <= enderecoList.size() - 1) {
            Endereco enderecoAtual = enderecoList.get(index);
            textRua.setText(enderecoAtual.getRua());
            textNumero.setText(String.valueOf(enderecoAtual.getNumero()));
            textCidade.setText(enderecoAtual.getCidade());
            textBairro.setText(enderecoAtual.getBairro());
            textCep.setText(String.valueOf(enderecoAtual.getCep()));
            textLogradouro.setText(enderecoAtual.getLogradouro());
        }
    }
}
