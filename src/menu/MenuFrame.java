package menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class MenuFrame extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnAgregar;


	public MenuFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		contentPane.add(menuBar);
		
		mnAgregar = new JMenu("Peliculas");
		mnAgregar.setForeground(Color.BLACK);
		menuBar.add(mnAgregar);
		
		JMenuItem mntmAgregar = new JMenuItem("Agregar");
		mntmAgregar.setHorizontalAlignment(SwingConstants.LEFT);
		mnAgregar.add(mntmAgregar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mntmListar.setHorizontalAlignment(SwingConstants.LEFT);
		mnAgregar.add(mntmListar);
		
		this.setVisible(true);
	}
}
