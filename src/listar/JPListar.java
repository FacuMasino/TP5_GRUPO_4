package listar;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import dominio.Pelicula;

public class JPListar extends JPanel
{
	private static final long serialVersionUID = 1L;
	private DefaultListModel<Pelicula> peliculasDLM;
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
		
		peliculasLst = new JList();
		add(peliculasLst, BorderLayout.CENTER);
	}
	
	public void setPeliculasDLM(DefaultListModel<Pelicula> peliculasDLM)
	{
		this.peliculasDLM = peliculasDLM;
		
		if (this.peliculasDLM == null)
		{
			this.peliculasDLM = new DefaultListModel<Pelicula>();
		}

		peliculasLst.setModel(this.peliculasDLM);
	}
}
