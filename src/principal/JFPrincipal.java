package principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import dominio.Pelicula;
import dominio.PeliculasListModel;
import agregar.JPAgregar;
import listar.JPListar;

public class JFPrincipal extends JFrame
{
	private static final long serialVersionUID = 1L;
	private PeliculasListModel peliculasLM;
	private JPanel contentPane;
	private JPAgregar jpAgregar;
	private JPListar jpListar;
	private JMenuBar menuBar;
	private JMenu menuPeliculas;
	private JMenuItem menuItemAgregar;
	private JMenuItem menuItemListar;

	public JFPrincipal()
	{
		peliculasLM = new PeliculasListModel();

		// JFrame y Panel Principal

		setTitle("Programa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
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
				public void actionPerformed(ActionEvent arg)
				{
					contentPane.removeAll();
					jpAgregar = new JPAgregar();
					jpAgregar.setPeliculasDLM(peliculasLM);
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
				public void actionPerformed(ActionEvent arg)
				{
					contentPane.removeAll();
					jpListar = new JPListar();
					
					jpListar.setPeliculasLM(peliculasLM);
					
						if (peliculasLM.getSize() == 0 )
						{
							JOptionPane.showMessageDialog(null,"No hay películas en la lista");
						}
						else
						{
							contentPane.add(jpListar);
							contentPane.repaint();
							contentPane.revalidate();
						}
							
				}
			}
		);
		
		this.setVisible(true);
	}
}
