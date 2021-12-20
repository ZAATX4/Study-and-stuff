package conecaobd;

public class layout {
	
	
	import java.awt.BorderLayout; 
	
	import java.awt.Container;
	
	import java.awt.Dimension;
	
	import java.awt.GridLayout;
	
	import java.awt.event.ActionEvent;
	
	import java.awt.event.ActionListener;
	
	import java.sql.Connection;

	import java.sql.DriverManager;

	import java.sql.ResultSet;

	import java.sql.ResultSetMetaData;

	import java.sql.SQLException;

	import java.sql.Statement;

	import javax.swing.BorderFactory;
	
	import javax.swing.Box;
	
	import javax.swing.JButton;
	
	import javax.swing.JFrame;
	
	import javax.swing.JLabel;
	
	import javax.swing.JOptionPane;
	
	import javax.swing.JPanel;
	
	import javax.swing.JPasswordField;
	
	import javax.swing.JTextField;
	
	public class ConexaoMssql implements ActionListener { 
	// Componentes 
		
	private JLabel ltitulo;
	
	private JLabel lbanco;
	
	private JLabel lusuario;
	
	private JLabel lsenha;
	
	private JTextField tbanco;
	
	private JTextField tusuario;
	
	private JPasswordField tsenha;
	
	private JButton botao;
	
	private JFrame menssagem;
	
	// Conexão
	
	private Connection conn;
	
	private Statement query;
	
	public Container criaPainel() {
		
	// Borda vazia
		
	JPanel painel = new JPanel();
	painel.setLayout(new BorderLayout()); 
	painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
	
	// Label titulo 
	
	ltitulo = new JLabel("Microsoft SQL Server Express");
	painel.add(ltitulo, BorderLayout.PAGE_START);
	
	// Dados
	
	JPanel painelDados = new JPanel(new GridLayout(0, 2, 10, 10));
	
	// Labels de cadastro
	
	lbanco = new JLabel("Banco de dados:"); 
	lusuario = new JLabel("Digite seu Usuario: "); 
	lsenha = new JLabel("Digite sua Senha: "); 
	tbanco = new JTextField(); tusuario = new JTextField(); 
	tsenha = new JPasswordField();
	
	// Formata tamanho
	
	tusuario.setPreferredSize(new Dimension(120, 20)); 
	tsenha.setPreferredSize(new Dimension(120, 20));
	
	// Formata os componentes na ordem
	
	painelDados.add(Box.createVerticalStrut(10));
	painelDados.add(Box.createVerticalStrut(10)); 
	painelDados.add(lbanco); 
	painelDados.add(tbanco); 
	painelDados.add(lusuario); 
	painelDados.add(tusuario); 
	painelDados.add(lsenha); 
	painelDados.add(tsenha); 
	painelDados.add(Box.createVerticalStrut(10)); 
	painelDados.add(Box.createVerticalStrut(10));
	}
	}
    }
	
	// Botão de conexão

	botao = new JButton("Conectar"); 
	botao.addActionListener(this);
	
	// Formata componentes no painel principal 
	
	painel.add(painelDados); 
	painel.add(botao, BorderLayout.PAGE_END);
	return painel;
	
	public static void criaGUI() { 
		
	// Cria formulario
		
	JFrame formulario = new JFrame("MSSQL Express 2012"); 
	formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// cria classe da conexão 
	ConexaoMssql conectar = new ConexaoMssql();
	
	// Define painel
	
	formulario.setContentPane(conectar.criaPainel()); 
	formulario.pack();
	
	// Mostra aplicação 
	
	formulario.setVisible(true);
	
	public void conectar(String banco, String login, String senha) { 
	try { 
	// Tenta conectar 
	String URL = "jdbc:sqlserver://Estacao01 (sqlserver://Estacao01)\\SQLEXPRESS:1433;"
			+ "databaseName=" ";user="+ login + ";password="+senha;
	} 
	{
	} else {
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
	conn = DriverManager.getConnection(URL); 
	
	//Executa SQL 
	query = conn.createStatement(); 
	JOptionPane.showMessageDialog(menssagem, "Conexão Efetuada com sucesso!");
	catch(ClassNotFoundException ex) { ex.printStackTrace();
	 }
	catch(SQLException ex) { JOptionPane.showMessageDialog(menssagem, "Erro na conexão!"); 
	ex.printStackTrace();
	 }
	public void actionPerformed(ActionEvent arg0) { 
	// Verfica senha pelo tamanho char[] tamanho = tsenha.getPassword();
	if(tamanho.length == 0)
	JOptionPane.showMessageDialog(menssagem, "Digite uma senha!");
	// recupera senha do Java Password Field 
	String psenha = new String(tsenha.getPassword());
	//Cria conexão 
	ConexaoMssql conecta= new ConexaoMssql(); 
	conecta.conectar(tbanco.getText(), tusuario.getText() , psenha);
	}
	}
	}
	}
	}
	}
	}
	}
	public static void main(String[] args) { 
		
		final String DATABASE_URL = "jdbc:mssql://localhost:1433/books";
		
		final String SELECT_QUERY = "SELECT autorID, firstName, lastName FROM authors";
		final String username = "sa";
		final String password = "etec";
		
		try {
			DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
			Connection conet = DriverManager.getConnection(DATABASE_URL, username, password);
			Statement stat = connection.createStatement();
			ResultSet result = statement.executeQuery(SELECT_QUERY);
			ResultSetMetaData metaData = resultset.getMetaData();
			int numberOfColumns = metaData.getColumnCount();
			System.out.printf("Tabela de Autores do Banco de Dados Books:%n%n");
			for (int i =1; i <= numberOfColumns; i++) {
				System.out.printf("%-8s/t", metaData.getColumnName(i));
			}
			System.out.println();
			while (resultset.next()) {
				for (int i =1; i <= numberOfColumns; i++) {
					System.out.printf("%-8s/t", resultset.getObject(i));
				}
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("Erro de conexão: " + e.getMessage());
		} catch (Exception ex) {
			System.out.println("Erro geral: " + ex.getMessage());
		}
	}
}
		javax.swing.SwingUtilities.invokeLater(newRunnable() {
		
	public void run() {
	// Exibe GUI 
	criaGUI();
	} 
	}
	); 


}
