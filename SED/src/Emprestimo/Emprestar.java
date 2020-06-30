package Emprestimo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

public class Emprestar extends JInternalFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emprestar frame = new Emprestar();
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
	public Emprestar() {
		setTitle("Emprestimo e Requisi\u00E7\u00E3o");
		setBounds(100, 100, 721, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 695, 313);
		contentPane.add(tabbedPane);
		
		Novo_Emprestimo emprestimo = new Novo_Emprestimo();
		tabbedPane.addTab("Emprestimo", null, emprestimo, null);
		
		Requisicao requisicao = new Requisicao();
		tabbedPane.addTab("Requisi\u00E7\u00E3o", null, requisicao, null);
	}
}
