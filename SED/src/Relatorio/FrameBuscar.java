package Relatorio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameBuscar extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameBuscar frame = new FrameBuscar();
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
	public FrameBuscar() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Busca de Usu\u00E1rios");
		setBounds(100, 100, 450, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 90, 434, 81);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Codigo", "Nome", "CPF"
			}
		) {
			Class[] columnTypes = new Class[] {
				Long.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(61);
		table.getColumnModel().getColumn(1).setPreferredWidth(199);
		table.getColumnModel().getColumn(2).setPreferredWidth(123);
		scrollPane.setViewportView(table);
		
		JLabel lblNome = new JLabel("Nome  :");
		lblNome.setBounds(0, 11, 46, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(56, 8, 121, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCpf = new JLabel("Cpf  :");
		lblCpf.setBounds(197, 11, 46, 14);
		contentPane.add(lblCpf);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(229, 8, 99, 20);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(154, 51, 89, 23);
		contentPane.add(btnNewButton);
	}
}
