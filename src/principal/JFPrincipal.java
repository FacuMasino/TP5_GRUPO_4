package principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import agregar.JPAgregar;
import dominio.Pelicula;
import listar.JPListar;

public class JFPrincipal extends JFrame
{
	private static final long serialVersionUID = 1L;
	private DefaultListModel<Pelicula> peliculasDLM;
	private JPanel contentPane;
	private JPAgregar jpAgregar;
	private JPListar jpListar;
	private JMenuBar menuBar;
	private JMenu menuPeliculas;
	private JMenuItem menuItemAgregar;
	private JMenuItem menuItemListar;

	public JFPrincipal()
	{
		peliculasDLM = new DefaultListModel<Pelicula>();

		// JFrame y Panel Principal

		setTitle("Programa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		// Creación del menú

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuPeliculas = new JMenu("Peliculas");
		menuPeliculas.setForeground(Color.BLACK);
		menuBar.add(menuPeliculas);
		
		// Agregar
		
		menuItemAgregar = new JMenuItem("Agregar");
		menuItemAgregar.setHorizontalAlignment(SwingConstants.LEFT);
		menuPeliculas.add(menuItemAgregar);

		menuItemAgregar.addActionListener(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					contentPane.removeAll();
					jpAgregar = new JPAgregar();
					contentPane.add(jpAgregar);
					contentPane.repaint();
					contentPane.revalidate();
				}
			}
		);
		
		// Listar
		
		menuItemListar = new JMenuItem("Listar");
		menuItemListar.setHorizontalAlignment(SwingConstants.LEFT);
		menuPeliculas.add(menuItemListar);
		
		menuItemListar.addActionListener(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					contentPane.removeAll();
					jpListar = new JPListar();
					jpListar.setPeliculasDLM(peliculasDLM);
					contentPane.add(jpListar);
					contentPane.repaint();
					contentPane.revalidate();
				}
			}
		);
		
		this.setVisible(true);
	}
}
