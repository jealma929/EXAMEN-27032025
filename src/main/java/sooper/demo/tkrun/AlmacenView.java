package sooper.demo.tkrun;

import javax.swing.JFrame;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;

public class AlmacenView {

	protected JFrame frmAlmacen;
	private DefaultTableModel modeloAlmacen;
	private JTable tAlmacen;
	private JScrollPane sTAlmacen;
	private JButton masArticulo;
	


	public AlmacenView () {
		initialize();
	}
	
	private void initialize() {
		
		modeloAlmacen = new DefaultTableModel (new Object[][] {
		},
		new String[] {
					"idArticulo","idContenedor"
		});
		
		frmAlmacen = new JFrame();
		frmAlmacen.setBounds(400,200,400,500);
		frmAlmacen.getContentPane().setLayout(new MigLayout ("","[grow]","[][grow][]"));
		frmAlmacen.setVisible(true);
		
		JLabel etiqueta = new JLabel("Articulos a Embolsar");
		frmAlmacen.getContentPane().add(etiqueta, "cell 0 0");
		
		sTAlmacen = new JScrollPane();
		frmAlmacen.getContentPane().add(sTAlmacen,"cell 0 1,grow");
		
		tAlmacen = new JTable();
		tAlmacen.setModel(modeloAlmacen);
		
		sTAlmacen.setViewportView(tAlmacen);
		
		masArticulo = new JButton("Añadir Articulo");
		frmAlmacen.getContentPane().add(masArticulo, "cell 0 2");
		
		
	}
}