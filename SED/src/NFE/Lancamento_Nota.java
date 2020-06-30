package NFE;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.JDesktopPane;

import controller.FornecedorController;
import controller.LancamentController;
import controller.TpPagController;
import dao.TpPagDao;
import model.Fornecedor;
import model.NotaEnt;
import model.Produto;
import model.TipoPagamento;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import NFE.Lancamento_Produto;

public class Lancamento_Nota extends JInternalFrame {

	private JPanel contentPane;
	private JTextField textNumero, textChave, textDtEmissao, textSerie, textVencimento, textCDFornec, textRazao, textCNPJ, 
								   textInscEst, textDtReceb, textVlProd, textVlTot;
	public Object setVisible;
	private JLabel lblNumero, lblChaveDeAcesso, lblDataEmisso, lblSrie, lblVenc, lblForPagm, lblCodForn, lblRazao, lblCnpj,
		           lblInscEst, lblDtRec, lblVProduto, lblVtotal;
	private static JComboBox comboFormPag = new JComboBox();
	TipoPagamento tp = new TipoPagamento();

	/**
	 * Launch the application.
	 */
	private Date formatarData(String data) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return new Date( formatter.parse(data).getTime() );
    }
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lancamento_Nota frame = new Lancamento_Nota();
					 //carregaCombo();
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
	public Lancamento_Nota() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
				carregaCombo();
			}
		});
		setIconifiable(true);
		setTitle("Lan\u00E7amento de Notas");
		setBounds(100, 100, 761, 672);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 255));
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 743, 258);
		contentPane.add(panel);

		lblNumero = new JLabel("Numero :");
		lblChaveDeAcesso = new JLabel("Chave de acesso : ");
		lblDataEmisso = new JLabel("Data Emiss\u00E3o :");
		lblSrie = new JLabel("S\u00E9rie :");
		lblVenc = new JLabel("Vencimento  :");
		lblVenc.setFont(lblVenc.getFont().deriveFont(11f));
		lblForPagm = new JLabel("Forma  de pagamento   :");
		lblCodForn = new JLabel("Codigo Fornecedor  :");
		lblCodForn.setFont(lblCodForn.getFont().deriveFont(11f));
		lblRazao = new JLabel("Raz\u00E3o Social :");
		lblCnpj = new JLabel("CNPJ  :");
		lblCnpj.setFont(new Font("Tahoma", lblCnpj.getFont().getStyle(), 11));
		lblInscEst = new JLabel("Inscri\u00E7\u00E3o Estadual : ");
		lblDtRec = new JLabel("Data Recebimento :");
		lblVtotal = new JLabel("Valor Total:");
		lblVProduto = new JLabel("Valor dos Produtos:");
		lblVProduto.setFont(lblVProduto.getFont().deriveFont(11f));
		
		lblNumero.setFont(lblNumero.getFont().deriveFont(11f));
		lblVtotal.setFont(lblVtotal.getFont().deriveFont(11f));
		
		lblDataEmisso.setBounds(228, 11, 86, 14);
		lblChaveDeAcesso.setBounds(398, 11, 103, 14);
		lblNumero.setBounds(10, 11, 63, 14);
		lblVenc.setBounds(10, 36, 81, 14);
		lblSrie.setBounds(143, 11, 37, 14);
		lblRazao.setBounds(349, 61, 81, 14);
		lblCodForn.setBounds(10, 86, 124, 14);
		lblCnpj.setBounds(10, 61, 46, 14);
		lblDtRec.setBounds(521, 39, 126, 14);
		lblForPagm.setBounds(188, 36, 143, 14);
		lblInscEst.setBounds(491, 86, 124, 14);
		lblVtotal.setBounds(10, 170, 69, 14);
		lblVProduto.setBounds(7, 147, 112, 14);
		
		panel.add(lblNumero);
		panel.add(lblChaveDeAcesso);
		panel.add(lblDataEmisso);
		panel.add(lblVenc);
		panel.add(lblSrie);
		panel.add(lblForPagm);
		panel.add(lblCnpj);
		panel.add(lblInscEst);
		panel.add(lblDtRec);
		panel.add(lblRazao);
		panel.add(lblCodForn);
		panel.add(lblVtotal);
		panel.add(lblVProduto);
		
		textNumero = new JTextField();
		textChave = new JTextField();
		textDtEmissao = new JTextField();
		textSerie = new JTextField();
		textVencimento = new JTextField();
		textCDFornec = new JTextField();
		textRazao = new JTextField();
		textInscEst = new JTextField();
		textDtReceb = new JTextField();
		textVlProd = new JTextField();
		textVlTot = new JTextField();
		
		
		textNumero.setColumns(10);
		textChave.setColumns(10);
		textDtEmissao.setColumns(10);
		textSerie.setColumns(10);
		textVencimento.setColumns(10);
		textCDFornec.setColumns(10);
		textRazao.setColumns(10);
		textInscEst.setColumns(10);
		textDtReceb.setColumns(10);
		textVlProd.setColumns(10);
		textVlTot.setColumns(10);
		
		textVlProd.setBounds(127, 144, 78, 20);
		textNumero.setBounds(67, 8, 54, 20);
		textChave.setBounds(511, 8, 212, 20);
		textDtEmissao.setBounds(315, 8, 73, 20);
		textSerie.setBounds(180, 8, 38, 20);
		textVencimento.setBounds(94, 33, 86, 20);
		textCDFornec.setBounds(124, 83, 73, 20);
		textRazao.setBounds(445, 58, 278, 20);
		textInscEst.setBounds(610, 83, 113, 20);
		textDtReceb.setBounds(637, 36, 86, 20);
		textVlTot.setBounds(127, 167, 78, 20);
		
		panel.add(textNumero);
		panel.add(textChave);
		panel.add(textDtEmissao);
		panel.add(textSerie);
		panel.add(textVencimento);
		textCNPJ = new JTextField();
		textCNPJ.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if(!textCNPJ.getText().isEmpty()){
					Fornecedor f = new Fornecedor();
					FornecedorController fc = new FornecedorController();
					
						try {
							f= fc.buscaFornecedorporCnpj(textCNPJ.getText());
							textInscEst.setText(f.getInsc_Est());
							textCDFornec.setText(String.valueOf(f.getId()));
							textRazao.setText(f.getRazaoSocial());
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}	
				}
			}
		});
		textCNPJ.setColumns(10);
		textCNPJ.setBounds(54, 58, 162, 20);
		panel.add(textCNPJ);
		panel.add(textCDFornec);
		panel.add(textRazao);
		panel.add(textInscEst);
		panel.add(textDtReceb);
		panel.add(textVlProd);
		panel.add(textVlTot);
		
		
		comboFormPag.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				//TpPagController tpc = new TpPagController();
				
				tp = (TipoPagamento)comboFormPag.getSelectedItem();
			
			}
		});
		comboFormPag.setBounds(325, 33, 105, 20);
		panel.add(comboFormPag);
	
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 119, 752, 2);
		panel.add(separator);
		JButton btnProduto = new JButton("Produtos");
		btnProduto.setBounds(195, 215, 91, 23);
		panel.add(btnProduto);
		
		final JDesktopPane dkproduto = new JDesktopPane();
		dkproduto.setBounds(0, 253, 743, 347);
		contentPane.add(dkproduto);
				
						JButton btnSalvar = new JButton("Salvar");
						btnSalvar.setBounds(10, 611, 91, 23);
						contentPane.add(btnSalvar);
						JButton btnEditar = new JButton("Editar");
						btnEditar.setBounds(106, 611, 91, 23);
						contentPane.add(btnEditar);
						JButton btnExcluir = new JButton("Excluir");
						btnExcluir.setBounds(306, 611, 91, 23);
						contentPane.add(btnExcluir);
						JButton btnSair = new JButton("Sair");
						btnSair.setBounds(642, 611, 91, 23);
						contentPane.add(btnSair);
				
				btnSalvar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Lancamento_Produto lp = new Lancamento_Produto();
						NotaEnt notaent = new NotaEnt();
						Produto p = new Produto();
						//TipoPagamento tp = new TipoPagamento();
						notaent.setNumero(textNumero.getText());
						notaent.setCod_ver(textChave.getText());
						notaent.setValor_produto(Double.valueOf(textVlProd.getText()));
						notaent.setValor_nota(Double.valueOf(textVlTot.getText()));
						notaent.setTipo_pag(tp.getId_pagament());
						notaent.setSerie(textSerie.getText());
						notaent.setCnpj(textCNPJ.getText());
						
						//p.setId_produto();
						textCNPJ.addFocusListener(new FocusAdapter() {
					
						});
						LancamentController lc = new LancamentController();
						
						
						try {
							
							notaent.setData_emiss(formatarData(textDtEmissao.getText()));
							notaent.setData_receb(formatarData(textDtReceb.getText()));
							notaent.setVenc(formatarData(textVencimento.getText()));
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							lc.salvar(notaent);
						}catch (SQLException | ParseException e){
							e.printStackTrace();
						}
						
					}
				});
		
				btnProduto.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Lancamento_Produto lp = new Lancamento_Produto();
		                lp.setClosable(true);
		                lp.setIconifiable(true);
		                lp.setResizable(true);
		                dkproduto.add(lp);
						lp.setSize(743,347);
						lp.setVisible(true);
		                
					}
				});

	}
	
private static void carregaCombo(){
	    
	    DefaultComboBoxModel comboModel = (DefaultComboBoxModel) comboFormPag.getModel();
	    
	    comboModel.removeAllElements();
	    
	    List<TipoPagamento> tpg = new ArrayList<TipoPagamento>();
	    TpPagDao tpdao = new TpPagDao();
	    try {
			tpg = tpdao.retornaTodos();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	  
	    
	    //percorrendo a lista para inserir os valores no combo
	    for (int linha = 0; linha < tpg.size(); linha++)
	    {
	        //pegando a categoria da lista
	        TipoPagamento p = tpg.get(linha);
	        //adicionando a categoria no combo
	        comboModel.addElement(p);
	    }
	}
}
