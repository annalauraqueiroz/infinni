package View;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Model.Produto;
import controller.Principal;

import javax.swing.JTextArea;

public class viej extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCod;
	private JTextField textNome;
	private JTextField textPreco;
	private JTextField textCod_2;
	private JTextField textField;
	Principal p= new Principal();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viej frame = new viej();
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
	public viej() {
		setTitle("CELL STORE");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\14161000006\\Downloads\\1497619675-settingmobile-phone_85138.png"));
		setBackground(new Color(221, 160, 221));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 362);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(199, 21, 133));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 536, 362);
		panel.setBackground(new Color(255, 192, 203));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 536, 362);
		panel.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(219, 112, 147));
		tabbedPane.addTab("Cadastrar", new ImageIcon("C:\\Users\\14161000006\\Downloads\\1486349191-02_80467.png"), panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setBounds(30, 31, 46, 14);
		panel_2.add(lblCdigo);
		
		textCod = new JTextField();
		textCod.setBounds(75, 28, 112, 20);
		panel_2.add(textCod);
		textCod.setColumns(10);
		
		textNome = new JTextField();
		textNome.setBounds(75, 67, 112, 20);
		panel_2.add(textNome);
		textNome.setColumns(10);
		
		
		JLabel lblPeso = new JLabel("Marca:");
		lblPeso.setBounds(220, 31, 46, 14);
		panel_2.add(lblPeso);
		
		JLabel lblNewLabel = new JLabel("Descri\u00E7\u00E3o:");
		lblNewLabel.setBounds(30, 113, 46, 23);
		panel_2.add(lblNewLabel);
		
		textPreco = new JTextField();
		textPreco.setBounds(260, 66, 110, 23);
		panel_2.add(textPreco);
		textPreco.setColumns(10);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o:");
		lblPreo.setBounds(220, 70, 46, 14);
		panel_2.add(lblPreo);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(30, 70, 46, 14);
		panel_2.add(lblNome);
		
		JComboBox<Produto> comboBox = new JComboBox<Produto>();
		comboBox.setBounds(260, 31, 110, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Apple", "Samsung", "Motorola", "LG"}));
		comboBox.setSelectedIndex(0);
		panel_2.add(comboBox);
		
		
		JTextArea textDescricao = new JTextArea();
		textDescricao.setBounds(79, 112, 108, 66);
		panel_2.add(textDescricao);
		
		JButton btnCadastro = new JButton("Cadastrar");
		btnCadastro.setBounds(383, 229, 89, 23);
		panel_2.add(btnCadastro);
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cod = textCod.getText();
				String nome=textNome.getText();
				String marca;
				String descricao=textDescricao.getText();
				marca = ""+comboBox.getSelectedItem();
				String preco =textPreco.getText() ;
			if (nome.isEmpty() || marca.isEmpty() || descricao.isEmpty() || cod.isEmpty() || preco.isEmpty()){
					JOptionPane.showMessageDialog(null, "Preencha os campos corretamente!", "", JOptionPane.ERROR_MESSAGE);					
			}else{
				double preco1 = Double.parseDouble(textPreco.getText()) ;
				//int resp = JOptionPane.showConfirmDialog(null, "Confirmar o Cadastro", "", JOptionPane.YES_NO_OPTION);
			//	if(resp == JOptionPane.YES_OPTION){
				p.cadastrar(cod, nome, marca, descricao, preco1);
				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
				//textNome.setText("");
				//textField_1.setText("");
				//textField_2.setText("");
				}}
		});
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Pesquisar Prod.", new ImageIcon("C:\\Users\\14161000006\\Downloads\\1485476108-artboard-1_78541.png"), panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(205, 92, 92));
		panel_3.setBounds(0, 0, 521, 288);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		
		JLabel lblCodProduto = new JLabel("C\u00F3digo:");
		lblCodProduto.setBounds(28, 34, 37, 17);
		panel_3.add(lblCodProduto);
		
		JLabel lblNome_1 = new JLabel("Nome:");
		lblNome_1.setBounds(28, 75, 46, 14);
		panel_3.add(lblNome_1);
		
		JLabel lblPreo_1 = new JLabel("Pre\u00E7o:");
		lblPreo_1.setBounds(28, 121, 46, 14);
		panel_3.add(lblPreo_1);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(28, 158, 46, 14);
		panel_3.add(lblMarca);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setBounds(28, 197, 46, 14);
		panel_3.add(lblDescrio);
		
		
		
		JLabel label = new JLabel("");
		label.setBounds(83, 75, 146, 31);
		panel_3.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(93, 121, 97, 31);
		panel_3.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(84, 158, 110, 28);
		panel_3.add(label_2);
		
		textCod_2 = new JTextField();
		textCod_2.setBounds(75, 32, 86, 19);
		panel_3.add(textCod_2);
		textCod_2.setColumns(10);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(84, 197, 130, 31);
		panel_3.add(label_3);
		JButton btnPesquisarProd = new JButton("Pesquisar");
		
		btnPesquisarProd.setBounds(380, 234, 89, 23);
		panel_3.add(btnPesquisarProd);
		btnPesquisarProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cod;
				cod = textCod_2.getText();
				Principal p = new Principal();
				Produto a = p.Pesquisar(cod);
				
				//	if(a == null){
				//		JOptionPane.showMessageDialog(null, "Produto não encontrado!", "", JOptionPane.ERROR_MESSAGE);
	
					
			//	}
				//	else{
						label.setText(a.getNome());
						label_1.setText(""+a.getPreco());
						label_2.setText(a.getMarca());	
						label_3.setText(a.getDescricao());
			//	}

			}});
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(205, 92, 92));
		tabbedPane.addTab("Excluir Produto", new ImageIcon("C:\\Users\\14161000006\\Downloads\\1-27_icon-icons.com_69208.png"), panel_4, null);
		panel_4.setLayout(null);
		
		
		
		textField = new JTextField();
		textField.setBounds(63, 22, 102, 20);
		textField.setText("");
		panel_4.add(textField);
		textField.setColumns(10);
		
		JLabel lblCdigo_1 = new JLabel("C\u00F3digo:");
		lblCdigo_1.setBounds(22, 25, 46, 14);
		panel_4.add(lblCdigo_1);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(347, 235, 89, 23);
		panel_4.add(btnExcluir);
		
		//JButton btnExcluir = new JButton("Excluir");
		//btnExcluir.setBounds(187, 192, 89, 23);
		//panel_4.add(btnExcluir);
		//btnExcluir.addActionListener(new ActionListener() {
		//	public void actionPerformed(ActionEvent e) {
		//		String texto1;
		//		texto1 = textField.getText();
		//		if (texto1.isEmpty()){
		//			JOptionPane.showMessageDialog(null, "Preencha os campos corretamente!", "", JOptionPane.ERROR_MESSAGE);					
		//	}else{
		//		int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o produto?", "", JOptionPane.YES_NO_OPTION);
		//		if(resp == JOptionPane.YES_OPTION){
		//		Principal p = new Principal();
		//		p.Excluir(textField.getText());
		//		label.setText("");
		//		label_1.setText("");
		//		label_2.setText("");
		//		label_3.setText("");				
		//	}}}
		//});
		//btnExcluir.setBounds(106, 314, 89, 23);
		//contentPane.add(btnExcluir);
	}
}
