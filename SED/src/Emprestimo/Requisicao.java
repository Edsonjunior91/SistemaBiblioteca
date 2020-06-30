package Emprestimo;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class Requisicao extends JPanel {
	private JTextField txtCdrequisicao, txtNome, txtCPF, txtCDUsuário;
	private JTable table;
	private JLabel lblCodRequ, lblNome, lblCPF, lblCodUsu;
	private JPanel panel;
	private JLabel label;
	private JTextField textField;
	private JButton button;
	private JLabel label_1;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public Requisicao() {
		setBackground(new Color(245, 255, 250));
		setLayout(null);
		
		lblCodRequ = new JLabel("Codigo Requisicao  :");
		lblNome = new JLabel("Nome  :");
		lblCPF = new JLabel("CPF  : ");
		lblCodUsu = new JLabel("Codigo Usu\u00E1rio   :");
		
		lblCodUsu.setBounds(467, 53, 106, 14);
		lblCodRequ.setBounds(10, 14, 106, 14);
		lblNome.setBounds(10, 53, 46, 14);
		lblCPF.setBounds(268, 53, 46, 14);
		
		add(lblCodRequ);
		add(lblNome);
		add(lblCodUsu);
		add(lblCPF);
		
		txtCdrequisicao = new JTextField();
		txtNome = new JTextField();
		txtCPF = new JTextField();
		txtCDUsuário = new JTextField();
		
		txtCDUsuário.setColumns(10);
		txtCdrequisicao.setColumns(10);
		txtNome.setColumns(10);
		txtCPF.setColumns(10);
		
		txtCDUsuário.setBounds(573, 50, 105, 20);
		txtCdrequisicao.setBounds(126, 11, 86, 20);
		txtNome.setBounds(64, 50, 194, 20);
		txtCPF.setBounds(302, 50, 144, 20);
		
		add(txtCdrequisicao);
		add(txtCDUsuário);
		add(txtNome);
		add(txtCPF);
		
		JButton btnAceito = new JButton("Aceito");
		btnAceito.setBounds(10, 258, 89, 23);
		add(btnAceito);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 160, 436, 59);
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
			},
			new String[] {
				"Codigo", "Codigo Barras", "Nome", "Quantidade"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(62);
		table.getColumnModel().getColumn(1).setPreferredWidth(116);
		scrollPane.setViewportView(table);
		
		
		
		
		
		
		
		
		
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(109, 258, 89, 23);
		add(btnCancelar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(578, 258, 89, 23);
		add(btnSair);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(20, 78, 436, 82);
		add(panel);
		
		label = new JLabel("Codigo Produto  :");
		label.setBounds(36, 18, 106, 14);
		panel.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(144, 15, 58, 20);
		panel.add(textField);
		
		button = new JButton("Gravar");
		button.setFont(button.getFont().deriveFont(11f));
		button.setBounds(195, 48, 89, 23);
		panel.add(button);
		
		label_1 = new JLabel("Quantidade  :");
		label_1.setBounds(212, 18, 78, 14);
		panel.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(304, 15, 72, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(589, 102, 89, 20);
		add(textField_2);
		
		JLabel lblDataDeRequisio = new JLabel("Data de Requisi\u00E7\u00E3o   :");
		lblDataDeRequisio.setBounds(467, 105, 126, 14);
		add(lblDataDeRequisio);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(208, 258, 89, 23);
		add(btnBuscar);

	}
}
