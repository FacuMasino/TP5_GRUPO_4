package agregar;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import dominio.Genero;

import java.awt.Font;

public class JPAgregar extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JPanel JPMainGroup;
	private JPanel JPContainerGrid;
	private JTextField txtNombre;
	private JLabel lblId;
	private JLabel lblIdValue;
	private JLabel lblNombre;
	private JLabel lblGenero;
	private JComboBox<Genero> cbxGenero;
	
	public JPAgregar()
	{
		setLayout(new BorderLayout(0, 0));
		
		JPMainGroup = new JPanel();
		
		JPContainerGrid = new JPanel();
		JPContainerGrid.setLayout(new GridLayout(4, 2, 0, 30));
		
		lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPContainerGrid.add(lblId);
		
		lblIdValue = new JLabel("-");
		lblIdValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPContainerGrid.add(lblIdValue);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPContainerGrid.add(lblNombre);
		
		txtNombre = new JTextField();
		JPContainerGrid.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblGenero = new JLabel("G\u00E9nero");
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPContainerGrid.add(lblGenero);
		
		cbxGenero = new JComboBox<Genero>();
		cbxGenero.addItem(new Genero("Seleccione un género"));
		cbxGenero.addItem(new Genero("Terror"));
		cbxGenero.addItem(new Genero("Acción"));
		cbxGenero.addItem(new Genero("Suspenso"));
		cbxGenero.addItem(new Genero("Romántica"));

		JPContainerGrid.add(cbxGenero);
		
		JButton btnAceptar = new JButton("Aceptar");
		JPContainerGrid.add(btnAceptar);
		
		GroupLayout gl_JPMainGroup = new GroupLayout(JPMainGroup);
		gl_JPMainGroup.setHorizontalGroup(
			gl_JPMainGroup.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_JPMainGroup.createSequentialGroup()
					.addGap(50)
					.addComponent(JPContainerGrid, GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
					.addGap(50))
		);
		
		gl_JPMainGroup.setVerticalGroup(
			gl_JPMainGroup.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_JPMainGroup.createSequentialGroup()
					.addGap(10)
					.addComponent(JPContainerGrid, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
					.addGap(30))
		);
		
		JPMainGroup.setLayout(gl_JPMainGroup);
		add(JPMainGroup);
	}
}
