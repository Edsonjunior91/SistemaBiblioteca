package Consulta;


import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JPasswordField;
import controller.UsuarioController;
import model.Usuario;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

public class ConsultaUsuario extends JPanel {
	private JTextField textnome, textCPF, textCodigo, textrg;
	private JLabel lblNomeCompleto, lblRg, lblCpf, lblCodigo;    
	private JButton btnsair, btnBuscar;
	
	/**
	 * Create the panel.
	 */
	public ConsultaUsuario() {
		setBackground(new Color(240, 255, 255));
		setLayout(null);
		
		lblNomeCompleto = new JLabel("Nome Completo  :");
		lblRg = new JLabel("RG  :");
		lblCpf = new JLabel("CPF  :");
		lblCodigo = new JLabel("Codigo  :");
		
		lblNomeCompleto.setBounds(288, 14, 107, 14);
		lblRg.setBounds(380, 52, 31, 14);
		lblCpf.setBounds(14, 55, 46, 14);
		lblCodigo.setBounds(14, 14, 50, 14);
		add(lblNomeCompleto);
		add(lblRg);
		add(lblCpf);
		add(lblCodigo);
		
		textnome = new JTextField();
		textCPF = new JTextField();
		textCodigo = new JTextField();
		textrg = new JTextField();
		
		textnome.setColumns(10);
		textCPF.setColumns(10);
		textCodigo.setColumns(10);
		textrg.setColumns(10);
		
		textnome.setBounds(405, 11, 247, 20);
		textCPF.setBounds(52, 52, 118, 20);
		textCodigo.setBounds(74, 11, 96, 20);
		textrg.setBounds(421, 49, 129, 20);
	
		add(textnome);	
		add(textCPF);
		add(textCodigo);
		add(textrg);
		btnsair = new JButton("Sair");
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UsuarioController uc = new UsuarioController();
					Usuario u;
					try {
						u = uc.buscaContatoPorCPF(textCPF.getText());
						textnome.setText(u.getNome());
						textCodigo.setText(String.valueOf(u.getId_pessoa()));
						textrg.setText(u.getRg());
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		});
		btnsair.setBounds(445, 144, 91, 23);
		btnBuscar.setBounds(52, 144, 91, 23);
		add(btnsair);
		add(btnBuscar);
	}
}
