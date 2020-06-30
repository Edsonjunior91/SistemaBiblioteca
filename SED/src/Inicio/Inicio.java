package Inicio;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;

import Cadastro.Cadastro;
import Consulta.FrameConsulta;
import Emprestimo.Emprestar;
import NFE.Lancamento_Nota;
import NFE.Lancamento_Produto;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.BevelBorder;

import java.awt.Font;
import java.awt.Toolkit;
import java.util.Locale;
import java.awt.Frame;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Dialog.ModalExclusionType;

public class Inicio extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		getContentPane().setBackground(new Color(147, 112, 219));
		setBackground(new Color(216, 191, 216));
		setAlwaysOnTop(true);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Edson\\Desktop\\Colegio padre carmelo.jpg"));
		setFont(new Font("Arial Black", Font.PLAIN, 10));
		setTitle("Sistema de Empr\u00E9stimo e Devolu\u00E7\u00E3o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 861, 617);
		
		JMenuBar BarraMenu = new JMenuBar();
		setJMenuBar(BarraMenu);
		
		JMenu Arquivo = new JMenu("Arquivo");
		BarraMenu.add(Arquivo);
		
		JMenuItem mntmImpressora_1 = new JMenuItem("Impressora");
		Arquivo.add(mntmImpressora_1);
		
		JMenu Cadastro = new JMenu("Cadastro");
		BarraMenu.add(Cadastro);
		
		final JDesktopPane Dkinicial = new JDesktopPane();
		Dkinicial.setBackground(new Color(245, 245, 245));
		Dkinicial.setAutoscrolls(true);
		Dkinicial.setLocale(new Locale("pt", "BR"));
		Dkinicial.setBounds(0, 0, 1366, 687);
		getContentPane().add(Dkinicial);
		
		JLabel lblImagem = new JLabel("Imagem");
		lblImagem.setIcon(new ImageIcon("C:\\Users\\Edson\\workspace\\SED\\Logo SED.jpg"));
		lblImagem.setBounds(0, 0, 1366, 652);
		Dkinicial.add(lblImagem);
		
		JMenuItem mntmCadastro = new JMenuItem("Cadastro ");
		mntmCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cadastro cadastro= new Cadastro();
				cadastro.setClosable(true);
                cadastro.setIconifiable(true);
                cadastro.setResizable(true);
				Dkinicial.add(cadastro); 
				cadastro.setSize(714,345);
				cadastro.setVisible(true);
			}
		});
		Cadastro.add(mntmCadastro);
		
		JMenu mnNotasFiscais = new JMenu("Notas Fiscais");
		BarraMenu.add(mnNotasFiscais);
		
		JMenuItem mntmEntrada = new JMenuItem("Entrada");
		mntmEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					Lancamento_Nota NtEntrada= new Lancamento_Nota();
					NtEntrada.setClosable(true);
					NtEntrada.setIconifiable(true);
					NtEntrada.setResizable(true);
					Dkinicial.add(NtEntrada); 
					NtEntrada.setSize(749,672);
					NtEntrada.setVisible(true);
			}
			
		});
		mnNotasFiscais.add(mntmEntrada);
		
		
		JMenu mnEmprestimo = new JMenu("Empr\u00E9stimo");
		BarraMenu.add(mnEmprestimo);
		
		JMenuItem mntmEmprestimo = new JMenuItem("Empr\u00E9stimo");
		mntmEmprestimo.setHorizontalAlignment(SwingConstants.TRAILING);
		mntmEmprestimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Emprestar emprestar= new Emprestar();
				emprestar.setClosable(true);
				emprestar.setIconifiable(true);
				emprestar.setResizable(true);
				Dkinicial.add(emprestar); 
				emprestar.setSize(721,352);
				emprestar.setVisible(true);
			}
		});
		mnEmprestimo.add(mntmEmprestimo);
		
		JMenu mnConsulta = new JMenu("Consulta");
		BarraMenu.add(mnConsulta);
		
		JMenuItem mntmConsulta = new JMenuItem("Consulta");
		mntmConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FrameConsulta consulta= new FrameConsulta();
				consulta.setClosable(true);
				consulta.setIconifiable(true);
				consulta.setResizable(true);
				Dkinicial.add(consulta); 
				consulta.setSize(678,256);
				consulta.setVisible(true);
			
			}
		});
		mnConsulta.add(mntmConsulta);
		getContentPane().setLayout(null);
		
	}
}
