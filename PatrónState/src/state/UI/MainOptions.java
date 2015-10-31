package state.UI;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;





import java.awt.Font;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.SpringLayout;

public class MainOptions {

	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainOptions window = new MainOptions();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainOptions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblCompras = new JLabel("Compras");
		lblCompras.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblOpciones = new JLabel("Opciones:");
		
		final JLabel lblPedido = new JLabel("Pedido");
		formatoLink(lblPedido);
		
		final JLabel lblOrden = new JLabel("Orden de Compra");
		formatoLink(lblOrden);
		
		final JLabel lblGuia = new JLabel("Gu\u00EDade Remisi\u00F3n");		
		formatoLink(lblGuia);		
		
		final JLabel lblFactura = new JLabel("Factura");
		formatoLink(lblFactura);
		
		lblPedido.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				MainWindow window = new MainWindow();
				window.lblTitulo.setText(lblPedido.getText());
				window.frame.setVisible(true);
			}
		});
		
		lblGuia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				MainWindow window = new MainWindow();
				window.lblTitulo.setText(lblGuia.getText());
				window.frame.setVisible(true);
			}
		});
		
		lblOrden.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				MainWindow window = new MainWindow();
				window.lblTitulo.setText(lblOrden.getText());
				window.frame.setVisible(true);
			}
		});
		
		lblFactura.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				MainWindow window = new MainWindow();
				window.lblTitulo.setText(lblFactura.getText());
				window.frame.setVisible(true);
			}
		});
		
		
		
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {						
				frame.dispose();
			}
		});
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, lblFactura, 6, SpringLayout.SOUTH, lblGuia);
		springLayout.putConstraint(SpringLayout.WEST, lblFactura, 0, SpringLayout.WEST, lblCompras);
		springLayout.putConstraint(SpringLayout.NORTH, lblGuia, 6, SpringLayout.SOUTH, lblOrden);
		springLayout.putConstraint(SpringLayout.WEST, lblGuia, 0, SpringLayout.WEST, lblCompras);
		springLayout.putConstraint(SpringLayout.WEST, lblOrden, 0, SpringLayout.WEST, lblCompras);
		springLayout.putConstraint(SpringLayout.NORTH, btnSalir, 187, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnSalir, 90, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblCompras, 22, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblCompras, 35, SpringLayout.WEST, frame.getContentPane());
		
		frame.getContentPane().setLayout(springLayout);
		
		frame.getContentPane().add(lblCompras);
		frame.getContentPane().add(lblGuia);
		frame.getContentPane().add(lblOrden);
		frame.getContentPane().add(lblFactura);
		frame.getContentPane().add(btnSalir);
		
		
		springLayout.putConstraint(SpringLayout.SOUTH, lblPedido, -172, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblOrden, 6, SpringLayout.SOUTH, lblPedido);
		springLayout.putConstraint(SpringLayout.WEST, lblPedido, 0, SpringLayout.WEST, lblCompras);
		frame.getContentPane().add(lblPedido);
		
	}
	private void formatoLink(JLabel lbl){
		lbl.setForeground(new Color(0, 0, 205));
		Font font = lbl.getFont();
		Map attributes = font.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lbl.setFont(font.deriveFont(attributes));
	}
}
