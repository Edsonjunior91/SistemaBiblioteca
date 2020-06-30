package Login;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import Inicio.Inicio;
import Senha.Alterar_Senha;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;



public class Login {

	private JFrame frmAcessoAoSistema;
	private JPasswordField passwordSenha;
	private JTextField textUsuario;
	private JButton btnAlterarSenha, btnEntrar;
	private JLabel lblSenha, lblUsurio, lblDigiteSeuUsurio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmAcessoAoSistema.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAcessoAoSistema = new JFrame();
		frmAcessoAoSistema.setResizable(false);
		frmAcessoAoSistema.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Edson\\Desktop\\Colegio padre carmel.jpg"));
		frmAcessoAoSistema.getContentPane().setFont(frmAcessoAoSistema.getContentPane().getFont().deriveFont(11f));
		frmAcessoAoSistema.setFont(new Font("Tahoma", Font.PLAIN, 11));
		frmAcessoAoSistema.getContentPane().setBackground(new Color(245, 255, 250));
		frmAcessoAoSistema.setTitle("Acesso ao Sistema");
		frmAcessoAoSistema.setBounds(100, 100, 458, 231);
		frmAcessoAoSistema.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmAcessoAoSistema.getContentPane().setLayout(null);
		
		passwordSenha = new JPasswordField();
		passwordSenha.setFont(passwordSenha.getFont().deriveFont(11f));
		passwordSenha.setBounds(232, 98, 172, 20);
		frmAcessoAoSistema.getContentPane().add(passwordSenha);
		
		lblSenha = new JLabel("Senha :");
		lblSenha.setFont(lblSenha.getFont().deriveFont(11f));
		lblUsurio = new JLabel("Usu\u00E1rio  :");
		lblUsurio.setFont(lblUsurio.getFont().deriveFont(11f));
		lblDigiteSeuUsurio = new JLabel("Digite seu usu\u00E1rio e senha para entrar no sistema:");
		lblDigiteSeuUsurio.setFont(lblDigiteSeuUsurio.getFont().deriveFont(11f));
		
		lblSenha.setBounds(176, 101, 63, 14);
		lblUsurio.setBounds(176, 73, 63, 14);
		lblDigiteSeuUsurio.setBounds(150, 31, 298, 14);
		
		frmAcessoAoSistema.getContentPane().add(lblSenha);
		frmAcessoAoSistema.getContentPane().add(lblUsurio);
		//frmAcessoAoSistema.getContentPane().add(btnEntrar);
		frmAcessoAoSistema.getContentPane().add(lblDigiteSeuUsurio);
		
		textUsuario = new JTextField();
		textUsuario.setFont(textUsuario.getFont().deriveFont(11f));
		
		textUsuario.setBounds(232, 67, 172, 20);
		
		frmAcessoAoSistema.getContentPane().add(textUsuario);
		
		textUsuario.setColumns(10);
		
		btnAlterarSenha = new JButton("Alterar Senha");
		btnAlterarSenha.setFont(btnAlterarSenha.getFont().deriveFont(11f));
		btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(btnEntrar.getFont().deriveFont(11f));
		
		btnAlterarSenha.setBounds(291, 142, 113, 23);
		btnEntrar.setBounds(154, 142, 113, 23);
		
		frmAcessoAoSistema.getContentPane().add(btnAlterarSenha);
		frmAcessoAoSistema.getContentPane().add(btnEntrar);
		
		JLabel lblImagem = new JLabel("imagem");
		lblImagem.setIcon(new ImageIcon("C:\\Users\\Edson\\workspace\\SED\\Colegio padre carmelo.jpg"));
		lblImagem.setBounds(10, 26, 134, 139);
		frmAcessoAoSistema.getContentPane().add(lblImagem);
		
		btnAlterarSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Alterar_Senha altSenha= new Alterar_Senha();
				altSenha.setResizable(true); 
				altSenha.setSize(330,240);
				altSenha.setVisible(true);
			}
		});
		
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Inicio inicio= new Inicio();
				inicio.setSize(1000,1000);
				inicio.setState(inicio.MAXIMIZED_BOTH);
				inicio.setVisible(true);
				frmAcessoAoSistema.setVisible(false);
			}
		});
	}
}
