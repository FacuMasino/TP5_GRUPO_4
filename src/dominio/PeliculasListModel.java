package dominio;

import java.util.TreeSet;
import javax.swing.DefaultListModel;

public class PeliculasListModel extends DefaultListModel<Pelicula> {

	private static final long serialVersionUID = 1L;
	private TreeSet<Pelicula> tsPeliculas;
	
	public PeliculasListModel() {
		tsPeliculas = new TreeSet<Pelicula>();
	}
	
	@Override
	public void addElement(Pelicula element) {
		// TODO Auto-generated method stub
		tsPeliculas.add(element);
	}

	@Override
	public Pelicula getElementAt(int index) {
		// TODO Auto-generated method stub
		return (Pelicula)tsPeliculas.toArray()[index];
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return tsPeliculas.size();
	}
	
}
