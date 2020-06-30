package NFE;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JDesktopPane;

public class Lancamento_Produto extends JInternalFrame {
	private JTextField textNNota;
	private JTextField textChave;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lancamento_Produto frame = new Lancamento_Produto();
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
	public Lancamento_Produto() {
		setTitle("Lan\u00E7amento de Produtos");
		getContentPane().setBackground(new Color(240, 255, 255));
		setBounds(100, 100, 743, 347);
		getContentPane().setLayout(null);
		
		JDesktopPane dk = new JDesktopPane();
		dk.setBounds(736, 345, -745, -373);
		getContentPane().add(dk);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 55, 706, 238);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Codigo", "Codigo de Barras", "Nome", "Descri\u00E7\u00E3o", "Quantidade"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, String.class, Object.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(145);
		table.getColumnModel().getColumn(3).setPreferredWidth(186);
		scrollPane.setViewportView(table);
		
		JLabel lblNumero = new JLabel("Codigo Produto  :");
		lblNumero.setBounds(10, 14, 99, 14);
		getContentPane().add(lblNumero);
		
		textNNota = new JTextField();
		textNNota.setColumns(10);
		textNNota.setBounds(104, 11, 62, 20);
		getContentPane().add(textNNota);
		
		JLabel lblChaveDeAcesso = new JLabel("Quantidade  :");
		lblChaveDeAcesso.setBounds(214, 14, 83, 14);
		getContentPane().add(lblChaveDeAcesso);
		
		textChave = new JTextField();
		textChave.setColumns(10);
		textChave.setBounds(296, 11, 83, 20);
		getContentPane().add(textChave);
		
		

	}
}
