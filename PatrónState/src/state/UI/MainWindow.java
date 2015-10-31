package state.UI;

import java.awt.EventQueue;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import state.Core.DataFactory;
import state.Core.DataFake;
import state.Core.DataInterface;
import state.Logic.EditionState;
import state.Logic.IState;
import state.Logic.InitialState;
import state.Logic.ObjectState;
import state.Logic.VisualitationState;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MainWindow {

	JFrame frame;
	private JTextField txtDni;
	private JTextField txtNombre;
	private JTextField txtEdad;
	private JTextField txtTelefono;
	
	final JButton btnBuscar = new JButton("Buscar");
	final JButton btnNuevo = new JButton("Nuevo");
	final JButton btnEditar = new JButton("Editar");
	final JButton btnEliminar = new JButton("Eliminar");
	final JButton btnGuardar = new JButton("Guardar");
	final JButton btnCancelar = new JButton("Cancelar");
	
	//Datos para el patrón
	ObjectState os = new ObjectState();	
	IState is = new InitialState();
	IState es = new EditionState();
	IState vs = new VisualitationState();
	//Data
	DataInterface df = DataFactory.createData("Fake");	
	//Flag para  guardar o editar
	int f=0;
	public JLabel lblTitulo = new JLabel("");
	


	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 520, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, lblTitulo, 25, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblTitulo, 105, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnEditar, 177, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNuevo, -3, SpringLayout.WEST, btnEditar);
		springLayout.putConstraint(SpringLayout.WEST, btnGuardar, 324, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnEliminar, -6, SpringLayout.WEST, btnGuardar);
		springLayout.putConstraint(SpringLayout.NORTH, btnCancelar, 0, SpringLayout.NORTH, btnBuscar);
		springLayout.putConstraint(SpringLayout.WEST, btnCancelar, 6, SpringLayout.EAST, btnGuardar);
		springLayout.putConstraint(SpringLayout.NORTH, btnGuardar, 0, SpringLayout.NORTH, btnBuscar);
		springLayout.putConstraint(SpringLayout.NORTH, btnEliminar, 0, SpringLayout.NORTH, btnBuscar);
		springLayout.putConstraint(SpringLayout.NORTH, btnEditar, 0, SpringLayout.NORTH, btnBuscar);
		springLayout.putConstraint(SpringLayout.NORTH, btnNuevo, 0, SpringLayout.NORTH, btnBuscar);
		springLayout.putConstraint(SpringLayout.WEST, btnBuscar, 34, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnBuscar, -29, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().setLayout(springLayout);
		
		JLabel lblDni = new JLabel("DNI:");
		frame.getContentPane().add(lblDni);
		
		JLabel lblNombre = new JLabel("Nombre:");
		springLayout.putConstraint(SpringLayout.WEST, lblNombre, 34, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblDni, 0, SpringLayout.WEST, lblNombre);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		springLayout.putConstraint(SpringLayout.WEST, lblTelfono, 0, SpringLayout.WEST, lblDni);
		frame.getContentPane().add(lblTelfono);
		
		JLabel lblEdad = new JLabel("Edad:");
		springLayout.putConstraint(SpringLayout.WEST, lblEdad, 0, SpringLayout.WEST, lblDni);
		frame.getContentPane().add(lblEdad);
		
		txtDni = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblDni, 3, SpringLayout.NORTH, txtDni);
		frame.getContentPane().add(txtDni);
		txtDni.setColumns(10);
		
		txtNombre = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblNombre, 3, SpringLayout.NORTH, txtNombre);
		springLayout.putConstraint(SpringLayout.WEST, txtNombre, 101, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, txtNombre, -173, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, txtDni, -6, SpringLayout.NORTH, txtNombre);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtEdad = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtEdad, 134, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, txtEdad, 39, SpringLayout.EAST, lblEdad);
		springLayout.putConstraint(SpringLayout.NORTH, lblEdad, 3, SpringLayout.NORTH, txtEdad);
		springLayout.putConstraint(SpringLayout.EAST, txtDni, 0, SpringLayout.EAST, txtEdad);
		springLayout.putConstraint(SpringLayout.SOUTH, txtNombre, -8, SpringLayout.NORTH, txtEdad);
		frame.getContentPane().add(txtEdad);
		txtEdad.setColumns(10);
		
		txtTelefono = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblTelfono, 3, SpringLayout.NORTH, txtTelefono);
		springLayout.putConstraint(SpringLayout.WEST, txtTelefono, 0, SpringLayout.WEST, txtDni);
		springLayout.putConstraint(SpringLayout.SOUTH, txtTelefono, -27, SpringLayout.NORTH, btnNuevo);
		frame.getContentPane().add(txtTelefono);
		txtTelefono.setColumns(10);
		frame.getContentPane().add(btnBuscar);
		frame.getContentPane().add(btnNuevo);
		frame.getContentPane().add(btnEditar);
		frame.getContentPane().add(btnEliminar);
		frame.getContentPane().add(btnCancelar);
		frame.getContentPane().add(btnGuardar);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		frame.getContentPane().add(lblTitulo);
		
		os.setState(is);		
		bloquearbtn();
		validationButtons(os.exeAction());
		
		
		
		
		btnBuscar.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent arg0) {				
				String[] data;
				data = df.buscaDni(txtDni.getText());
				if (data == null){
					JOptionPane.showMessageDialog(null, "Usuario no existe");					
				}else{
					txtNombre.setText(data[1]);
					txtEdad.setText(data[2]);
					txtTelefono.setText(data[3]);
					os.setState(vs);					
					bloquearbtn();
					validationButtons(os.exeAction());		
					txtDni.setEditable(true);
					txtNombre.setEditable(false);
					txtEdad.setEditable(false);
					txtTelefono.setEditable(false);
				}
			}
			
		});
		
		
		
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				os.setState(es);
				bloquearbtn();
				validationButtons(os.exeAction());
				txtDni.setEditable(true);
				txtDni.setText("");
				txtNombre.setEditable(true);
				txtNombre.setText("");
				txtEdad.setEditable(true);
				txtEdad.setText("");
				txtTelefono.setEditable(true);
				txtTelefono.setText("");
				
				f=0;
				
			}
		});
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				os.setState(is);
				bloquearbtn();
				validationButtons(os.exeAction());
				txtDni.setEditable(true);
				txtDni.setText("");
				txtNombre.setEditable(true);
				txtNombre.setText("");
				txtEdad.setEditable(true);
				txtEdad.setText("");
				txtTelefono.setEditable(true);
				txtTelefono.setText("");
				
				f=0;
				
			}
		});
		
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean data;
				data = df.guardarData(txtDni.getText(), txtNombre.getText(), txtEdad.getText(), txtTelefono.getText(),f);//0=guardar
				if (data == false){
					JOptionPane.showMessageDialog(null, "No se pudo Editar");					
				}else{					
					os.setState(is);
					bloquearbtn();
					validationButtons(os.exeAction());					
					habilitaTxt();
					JOptionPane.showMessageDialog(null, "Se guardó correctamente");
				}				
			}
		});
		
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean data;
				os.setState(es);
														
				bloquearbtn();
				validationButtons(os.exeAction());
				
				txtDni.setEditable(true);
				txtNombre.setEditable(true);
				txtEdad.setEditable(true);
				txtTelefono.setEditable(true);
				
				f=1;
				
			}
		});
	}
	public void bloquearbtn(){
		btnBuscar.setEnabled(false);
		btnNuevo.setEnabled(false);
		btnCancelar.setEnabled(false);
		btnEditar.setEnabled(false);
		btnEliminar.setEnabled(false);
		btnGuardar.setEnabled(false);
	}
	public void habilitaTxt(){
		txtDni.setEditable(true);
		txtDni.setText("");
		txtNombre.setEditable(true);
		txtNombre.setText("");
		txtEdad.setEditable(true);
		txtEdad.setText("");
		txtTelefono.setEditable(true);
		txtTelefono.setText("");
		
	}
	public void validationButtons(List<String> list){
		for(int i=0;i<list.size();i++){							
		    if(list.get(i).toString()==btnBuscar.getText()){
		    	btnBuscar.setEnabled(true);
		    }
		    if(list.get(i).toString()==btnNuevo.getText()){
		    	btnNuevo.setEnabled(true);
		    }
		    if(list.get(i).toString()==btnEditar.getText()){
		    	btnEditar.setEnabled(true);
		    }
		    if(list.get(i).toString()==btnEliminar.getText()){
		    	btnEliminar.setEnabled(true);
		    }
		    if(list.get(i).toString()==btnCancelar.getText()){
		    	btnCancelar.setEnabled(true);
		    }
		    if(list.get(i).toString()==btnGuardar.getText()){
		    	btnGuardar.setEnabled(true);
		    }
		}
	}
	

}
