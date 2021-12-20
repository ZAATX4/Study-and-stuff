package aplicaçãoMenus;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JFrame;
import java.awt.Menu.addSeparator;
import java.awt.event.KetEvent

public class Menu {
		
	 JFrame principalfrm = new JFrame("Menuzin");
	    principalfrm.setLayout(new FlowLayout);
	    principalfrm.setSize(220, 200);
	    principalfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
		JLabel dsncsario = new JLabel();
		/* Menu barra */
	    JMenuBar bah = new JMenuBar();
	    /* Formata os Item com mnemônicos e aceleradores */
	    JMenu menuArq = new JMenu("Arquivo");
	    jmark.setMnemonic(KeyEvent.VK_F);
	    JMenuItem fileNovo = new JMenuItem("Novo", KeyEvent.VK_N);
	    jmanovo.setAccelerator(KeyStroke.GetKeyStroke KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK);
	    JMenuItem fileNovaW = new JMenuItem("Nova Janela", KeyEvent.VK_J);
	    jmjanela.setAccelerator (KetStroke.GetKeyStroke KeyEvent.VK_J, InputEvent.CTRL_DOWN_MASK);
	    JMenuItem fileAbrir = new JMenuItem("Abrir...", KeyEvent.VK_O);
	    jmopen.setAccelerator (KeyStroke.GetKeyStroke KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK);
	    JMenuItem fileSave = new JMenuItem("Salvar", KeyEvent.VK_S);
	    jmsave.setAccelerator (KeyStroke.GetKeyStroke KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK);
	    JMenuItem fileSaveAs = new JMenuItem("Salvar Como...");
	    JMenuItem fileConfig = new JMenuItem("Configurar Página...");
	    JMenuItem filePress = new JMenuItem("Imprimir", KeyEvent.VK_P);
	    jmpress.setAccelerator (KeyStroke .GetKeyStroke KeyEvent.VK_P, InputEvent.CTRL_DOWN_MASK);
	    JMenuItem fileSair = new JMenuItem("Sair");
	    /* Adciona no lugarzinho certo */
		menuFile.add(fileNovo);
		menuFile.add(fileNovaW);
		menuFile.add(fileAbrir);
		menuFile.add(fileSave);
		menuFile.add(fileSaveAs);
		menuFile.addSeparator();
		menuFile.add(fileConfig);
		menuFile.add(filePress);
		menuFile.addSeparator();
		menuFile.add(fileSair);
		/* Coloca no canto superior esquerdo */
		principalfrm.add(menuFile, BorderLayout.PAGE_START);
		principalfrm.add(menuFile, BorderLayout.LINE_START);
		/* Inseri tudo certinho na barra */
		bah.add(menuArq);
		/* Formata os items do menu "Editar" */
		JMenu menuEdt = new JMenu("Editar");
		JMenuItem  edtDesf = new JMenuItem("Desfazer", KeyEvent.VK_Z);
		jmundo.setAccelerator (KeyStroke.GetKeyStroke KeyEvent.VK_Z, InputEvent.CTRL_DOWN_MASK);
		JMenuItem  edtRec = new JMenuItem("Recortar", KeyEvent.VK_X);
		jmrecort.setAccelerator (KeyStroke.GetKeyStroke KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK);
		JMenuItem  edtCop = new JMenuItem("Copiar", KeyEvent.VK_C);
		jmcop.setAccelerator (KeyStroke.GetKeyStroke KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK);
		JMenuItem  edtCol = new JMenuItem("Colar", KeyEvent.VK_V);
		jmpaste.setAccelerator (KeyStroke.GetKeyStroke KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK);
		JMenuItem  edtExc = new JMenuItem("Excluir", KetEvent.VK_Del);
		jmdel.setAccelerator (KeyStroke.GetKeyStroke KeyEvent.VK_Del, InputEvent.CTRL_DOWN_MASK);
		JMenuItem  edtBing = new JMenuItem("Buscar no Bing...");
		JMenuItem  edtLoc = new JMenuItem("Localizar...", KeyEvent.VK_F);
		jmlocate.setAccelerator (KeyStroke.GetKeyStroke KeyEvent.VK_F, InputEvent.CTRL_DOWN_MASK);
		JMenuItem  edtLocNext = new JMenuItem("Localizar próxima", KeyEvent.VK_F3);
		jmnext.setAccelerator (KeyStroke.GetKeyStroke KeyEvent.VK_F3, InputEvent.CTRL_DOWN_MASK);
		JMenuItem  edtLocPrev = new JMenuItem("Localizar Anterior");
		JMenuItem  edtSubst = new JMenuItem("Substituir", KeyEvent.VK_H);
		jmsub.setAccelerator (KeyStroke.GetKeyStroke KeyEvent.VK_H, InputEvent.CTRL_DOWN_MASK);
		JMenuItem  edtGoTo = new JMenuItem("Ir para...", KeyEvent.VK_G);
		jmgoto.setAccelerator (KeyStroke.GetKeyStroke KeyEvent.VK_G, InputEvent.CTRL_DOWN_MASK);
		JMenuItem  edtSelcAll = new JMenuItem("Selecionar Tudo", KeyEvent.VK_A);
		jmsecall.setAccelerator (KeyStroke.GetKeyStroke KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK);
		JMenuItem  edtDate = new JMenuItem("Hora/Data", KeyEvent.VK_F5);
		jmdate.setAccelerator (KeyStroke.GetKeyStroke KeyEvent.VK_F5, InputEvent.CTRL_DOWN_MASK);
		/* Adciona os componentes no lugar que devem e do jeito que devem estar */
		menuEdt.add(edtDesf);
		menuEdt.add(edtRec);
		menuEdt.add(edtCop);
		menuEdt.add(edtCol);
		menuEdt.add(edtExc);
		menuFile.addSeparator();
		menuEdt.add(edtBing);
		menuEdt.add(edtLoc);
		menuEdt.add(edtLocNext);
		menuEdt.add(edtLocPrev);
		menuEdt.add(edtSubst);
		menuEdt.add(edtGoTo);
		menuFile.addSeparator();
		menuEdt.add(edtSelcAll);
		menuEdt.add(edtDate);
		/* Empurra pro canto superior esquerdo */
		principalfrm.add(menuEdt, BorderLayout.PAGE_START);
		principalfrm.add(menuEdt, BorderLayout.LINE_START);
		/* Inseri tudo certinho na barra */
		bah.add(menuEdt);
		/* Formata os items do Menu "Formatar" */
		JMenu menuFormtr = new JMenu("Formatar");
		JMenuItem formtrQubra = new JMenuItem("Quebra automática de linha");
		JMenuItem formtrFonte = new JMenuItem("Fonte");
		/* Adciona os componentes no lugar que devem e do jeito que devem estar */
		menuFormtr.add(formtrQubra);
		menuFormtr.add(formtrFonte);
		/* Empurra pro canto superior esquerdo */
		principalfrm.add(menuFormtr, BorderLayout.PAGE_START);
		principalfrm.add(menuFormtr, BorderLayout.LINE_START);
		/* Inseri tudo certinho na barra */
		bah.add(menuFormtr);
		/* Formata os items do menu "Exibir" */
		JMenu menuExb = new JMenu("EXibir");
		JMenuItem exbZom = new JMenuItem("Zoom");
		JMenuItem exbStatsBar = new JMenuItem("Barra de Status");
		/* Adciona os componentes no lugar do jeido que deve estar */
		menuExb.add(exbZom);
		menuExb.add(exbStatsBar);
		/* Empurra pro superior esquerdo */
		principalfrm.add(menuExb, BorderLayout.PAGE_START);
		principalfrm.add(menuExb, BorderLayout.LINE_START);
		/* Inseri tudo certinho na barra */
		bah.add(menuExb);
		/* Formata os items do menu "Ajuda" */
		JMenu menuAjuda = new JMenu("Ajuda");
		JMenuItem ajudaExiAjuda = new JMenuItem("Exibir Ajuda");
		JMenuItem ajudaComent = new JMenuItem("Enviar Comentário");
		JMenuItem ajudaSobre = new JMenuItem("Sobre o Programinha que eu fiz");
		/* Adciona os componente no lugar e do jeito certo */
		menuAjuda.add(ajudaExiAjuda);
		menuAjuda.add(ajudaComent);
		menuFile.addSeparator();
		menuAjuda.add(ajudaSobre);
		/* Empurra pro superior esquerdo */
		principalfrm.add(menuAjuda, BorderLayout.PAGE_START);
		principalfrm.add(menuAjuda, BorderLayout.LINE_START);
		/* Inseri tudo certinho na barra */
		bah.add(menuAjuda);
		

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Hello World \n Look at my Menu");

}
*/
