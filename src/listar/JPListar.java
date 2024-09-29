package listar;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import dominio.Pelicula;
import dominio.PeliculasListModel;

public class JPListar extends JPanel
{
	private static final long serialVersionUID = 1L;
	private PeliculasListModel peliculasLM;
	private JList<Pelicula> peliculasLst;
	private JLabel peliculasLbl;
	private JPanel fillPanel1;
	private JPanel fillPanel2;
	private JPanel fillPanel3;
	
	public JPListar()
	{
		setLayout(new BorderLayout(0, 0));
		
		peliculasLbl = new JLabel("Películas");
		add(peliculasLbl, BorderLayout.WEST);
		
		fillPanel1 = new JPanel();
		add(fillPanel1, BorderLayout.NORTH);
		
		fillPanel2 = new JPanel();
		add(fillPanel2, BorderLayout.SOUTH);
		
		fillPanel3 = new JPanel();
		add(fillPanel3, BorderLayout.EAST);
		
		peliculasLst = new JList<Pelicula>();
		add(peliculasLst, BorderLayout.CENTER);
		
		
		//JOptionPane.showMessageDialog(null,"No hay películas en la lista");
	
	}
	
	public void setPeliculasLM(PeliculasListModel peliculasLM)
	{
		
		this.peliculasLM = peliculasLM;
		
		if (this.peliculasLM == null)
		{
			this.peliculasLM = new PeliculasListModel();
		}

		peliculasLst.setModel(this.peliculasLM);
	}
	
}