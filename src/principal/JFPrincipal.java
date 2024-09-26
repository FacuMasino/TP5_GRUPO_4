package principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import agregar.JPAgregar;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnAgregar;
	private JMenuItem mntmAgregar;
	private JMenuItem mntmListar;

	public JFPrincipal() {
		
		// Propiedades JFrame y Panel Principal
		setTitle("Programa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		// CREACIÓN DE MENU
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnAgregar = new JMenu("Peliculas");
		mnAgregar.setForeground(Color.BLACK);
		menuBar.add(mnAgregar);
		
		mntmAgregar = new JMenuItem("Agregar");
		mntmAgregar.setHorizontalAlignment(SwingConstants.LEFT);
		mnAgregar.add(mntmAgregar);
		
		mntmListar = new JMenuItem("Listar");
		mntmListar.setHorizontalAlignment(SwingConstants.LEFT);
		mnAgregar.add(mntmListar);
		
		// EVENTO MENU ITEM AGREGAR
		mntmAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.removeAll();
				JPAgregar jpAgregar = new JPAgregar();
				contentPane.add(jpAgregar);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		
		this.setVisible(true);
	}
}
