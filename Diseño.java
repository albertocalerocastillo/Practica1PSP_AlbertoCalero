package es.studium.practica1psp;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class Diseño extends JFrame
{
	private static final long serialVersionUID = 1L;
	JPanel panel;

	JList<String> lista1, lista2;
	
	JLabel label1, label2;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Diseño frame = new Diseño();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public Diseño()
	{
		Codigo cd = new Codigo();
		String[] list1 = cd.lista1().split("\n");
		String[] list2 = cd.lista2().split("\n");
		DefaultListModel<String> model = new DefaultListModel<String>();
		DefaultListModel<String> model2 = new DefaultListModel<String>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 352);
		setTitle("Lanzador de Aplicaciones");
		//JPanel
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		//Etiquetas
		label1 = new JLabel();
		label1.setText("Arquitectura 32 bits");
		label1.setBounds(56, 40, 193, 23);
		panel.add(label1);
		
		label2 = new JLabel();
		label2.setText("Arquitectura 64 bits");
		label2.setBounds(280, 40, 193, 23);
		panel.add(label2);
		//JList
		lista2 = new JList<String>(model);

		for (int i = 0; i < list1.length; i++)
		{
			model.add(i, list1[i]);
		}
		
		lista2.setBounds(256, 68, 134, 185);
		panel.add(lista2);
		
		lista1 = new JList<String>(model2);

		for (int i = 0; i < list2.length; i++)
		{
			model2.add(i, list2[i]);
		}
		lista1.setBounds(32, 68, 134, 185);
		panel.add(lista1);
		//JScroll
		JScrollPane scrollPane = new JScrollPane(lista1);
		scrollPane.setBounds(32, 68, 153, 197);
		panel.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane(lista2);
		scrollPane_1.setBounds(255, 68, 148, 197);
		panel.add(scrollPane_1);
	}
}