package Cadastro;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;

import Consulta.ConsultaUsuario;

public class Cadastro extends JInternalFrame {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setTitle("Cadastro");
		setBounds(100, 100, 714, 345);
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 698, 311);
		getContentPane().add(tabbedPane);
		
		Cadastro_Fornecedor panelForne = new Cadastro_Fornecedor();
		tabbedPane.addTab("Fornecedor", null, panelForne, null);
		
		Cadastro_Produto panelProdu = new Cadastro_Produto();
		tabbedPane.addTab("Produto", null, panelProdu, null);
		
		TpPagPanel panelTpPag = new TpPagPanel();
		tabbedPane.addTab("Tipo Pagamento", null, panelTpPag, null);
		
		

	}
}
