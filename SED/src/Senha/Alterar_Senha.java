package Senha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Alterar_Senha extends JFrame {
	private JPasswordField pwdNova1, pwdNova2, pwdAntiga;
	private JLabel lblNova1, lblNova2, lblAntiga;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alterar_Senha frame = new Alterar_Senha();
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
	public Alterar_Senha() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Alterar Senha");
		setBounds(100, 100, 330, 240);
		getContentPane().setLayout(null);
		
		lblNova1 = new JLabel("Nova Senha  :");
		lblNova2 = new JLabel("Digite novamente  :");
		lblAntiga = new JLabel("Senha Antiga  :");
		
		lblNova1.setBounds(25, 80, 149, 14);
		lblNova2.setBounds(25, 106, 149, 14);
		lblAntiga.setBounds(25, 55, 134, 14);
		
		getContentPane().add(lblNova1);
		getContentPane().add(lblNova2);
		getContentPane().add(lblAntiga);
		
		pwdNova1 = new JPasswordField();
		pwdNova2 = new JPasswordField();
		pwdAntiga = new JPasswordField();
		
		pwdNova1.setBounds(142, 77, 100, 20);
		pwdNova2.setBounds(142, 103, 100, 20);
		pwdAntiga.setBounds(142, 49, 100, 20);
		
		getContentPane().add(pwdNova1);
		getContentPane().add(pwdNova2);
		getContentPane().add(pwdAntiga);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSalvar.setBounds(153, 151, 89, 23);
		getContentPane().add(btnSalvar);
		
		
		
		
		
		
		
		

	}
}
