package Cadastro;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import controller.TpPagController;
import model.TipoPagamento;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.text.ParseException;

public class TpPagPanel extends JPanel {
	private JTextField textCodigo;
	private JTextField textTpPag;

	/**
	 * Create the panel.
	 */
	public TpPagPanel() {
		setLayout(null);
		
		JLabel lblCod = new JLabel("Codigo  :");
		lblCod.setBounds(10, 24, 52, 14);
		add(lblCod);
		
		textCodigo = new JTextField();
		textCodigo.setColumns(10);
		textCodigo.setBounds(67, 21, 63, 20);
		add(textCodigo);
		
		JLabel lblTipoDePagamento = new JLabel("Tipo de Pagamento  :");
		lblTipoDePagamento.setBounds(296, 24, 119, 14);
		add(lblTipoDePagamento);
		
		textTpPag = new JTextField();
		textTpPag.setColumns(10);
		textTpPag.setBounds(425, 21, 253, 20);
		add(textTpPag);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TipoPagamento tp = new TipoPagamento();
				tp.setNome_pag(textTpPag.getText());
				TpPagController tpc= new TpPagController();
				try{
					tpc.salvar(tp);
				}catch(SQLException | ParseException e1){
					e1.printStackTrace();
				}
			}
		});
		btnSalvar.setBounds(10, 98, 91, 23);
		add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(106, 98, 91, 23);
		add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(201, 98, 91, 23);
		add(btnExcluir);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(587, 101, 91, 23);
		add(btnSair);

	}

}
