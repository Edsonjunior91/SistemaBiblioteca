package Emprestimo;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import controller.EmprestimoController;
import model.Emprestimo;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Novo_Emprestimo extends JPanel {
	private JTextField textNome,textCPF,textDtEmpr, textDtDev,textCod;
	private JTable table;
	private JLabel lblNome, lblCpf, lblDataEmprestimo, lblDataDevoluo, lblCodigoEmprestimo;
	private JButton btnEmprestar, btnDevolver, btnSair, btnCancelar;
	private JTextField textCodProd;
	private JTextField textQuant;

	/**
	 * Create the panel.
	 */
	private Date formatarData(String data) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return new Date( formatter.parse(data).getTime() );
    }
	public Novo_Emprestimo() {
		setBackground(new Color(245, 255, 250));
		setLayout(null);
		
		lblNome = new JLabel("Nome  :");
		lblCpf = new JLabel("CPF  : ");
		lblDataEmprestimo = new JLabel("Data Emprestimo  :");
		lblDataDevoluo = new JLabel("Data Devolu\u00E7\u00E3o  :");
		lblCodigoEmprestimo = new JLabel("Codigo Emprestimo   :");
		
		lblNome.setBounds(10, 50, 46, 14);
		lblCpf.setBounds(268, 50, 46, 14);
		lblDataEmprestimo.setBounds(456, 50, 106, 14);
		lblDataDevoluo.setBounds(468, 221, 106, 14);
		lblCodigoEmprestimo.setBounds(10, 11, 106, 14);
		
		add(lblNome);
		add(lblCpf);
		add(lblDataEmprestimo);
		add(lblDataDevoluo);
		add(lblCodigoEmprestimo);
		
		textNome = new JTextField();
		textCPF = new JTextField();
		textDtEmpr = new JTextField();
		textDtDev = new JTextField();
		textCod = new JTextField();
		
		textCPF.setBounds(302, 47, 144, 20);
		textNome.setBounds(64, 47, 194, 20);
		textDtEmpr.setBounds(565, 47, 119, 20);
		textDtDev.setBounds(564, 218, 119, 20);
		textCod.setBounds(126, 8, 64, 20);
		
		textNome.setColumns(10);
		textCPF.setColumns(10);
		textDtEmpr.setColumns(10);
		textDtDev.setColumns(10);
		textCod.setColumns(10);
		
		add(textNome);
		add(textCPF);
		add(textDtEmpr);
		add(textDtDev);
		add(textCod);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 161, 436, 74);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Codigo", "Codigo de Barra", "Nome", "Quantidade"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(131);
		scrollPane.setViewportView(table);

		btnEmprestar = new JButton("Emprestar");
		btnEmprestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Emprestimo e = new Emprestimo();
				//e.setId_emprestimo(Long.valueOf(textCod.getText()));
				e.setNome(textNome.getText());
				e.setCpf(textCPF.getText());
				e.setQuantidade(Integer.valueOf(textQuant.getText()));
				try {
					e.setDatEmprest(formatarData(textDtEmpr.getText()));
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				EmprestimoController ec = new EmprestimoController();
				try{
					ec.emprestar(e);
				}catch(SQLException | ParseException e1){
					e1.printStackTrace();
				}
				
				
			}
		});
		btnDevolver = new JButton("Devolver");
		btnSair = new JButton("Sair");
		btnCancelar = new JButton("Cancelar");
		
		btnEmprestar.setBounds(10, 255, 89, 23);
		btnDevolver.setBounds(302, 255, 89, 23);
		btnSair.setBounds(565, 255, 89, 23);
		btnCancelar.setBounds(205, 255, 89, 23);
		
		add(btnEmprestar);
		add(btnDevolver);
		add(btnSair);
		add(btnCancelar);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 75, 436, 82);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblCodigoProduto = new JLabel("Codigo Produto  :");
		lblCodigoProduto.setBounds(36, 18, 106, 14);
		panel.add(lblCodigoProduto);
		
		textCodProd = new JTextField();
		textCodProd.setBounds(144, 15, 58, 20);
		panel.add(textCodProd);
		textCodProd.setColumns(10);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setBounds(195, 48, 89, 23);
		panel.add(btnGravar);
		btnGravar.setFont(btnGravar.getFont().deriveFont(11f));
		
		JLabel lblQuantidade = new JLabel("Quantidade  :");
		lblQuantidade.setBounds(212, 18, 78, 14);
		panel.add(lblQuantidade);
		
		textQuant = new JTextField();
		textQuant.setBounds(304, 15, 72, 20);
		panel.add(textQuant);
		textQuant.setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(109, 255, 89, 23);
		add(btnConsultar);

	}
}
