package Package1;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.filechooser.FileSystemView;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.*;

import java.util.*;
import java.io.PrintWriter;
import java.io.FileWriter;

import javax.swing.JFileChooser;

public class ClasseMain {
	

	public static void main(String[] args) {
		
	
		
		JFrame maFenetre1= new JFrame();
		JFrame maFenetre2= new JFrame();
		maFenetre1.setSize(800, 600);
		maFenetre1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		maFenetre1.setTitle("TP01");	
		maFenetre1.setLocationRelativeTo( null );
		
		maFenetre1.setLayout(null);
	////////////////////////////////////////////////////////////////////
		//    Créer un menu                                        //
	////////////////////////////////////////////////////////////////////	
		JMenu menu1,submenu,menu2;
		JMenuItem i1, i2, i3, i4, i5;
		JMenuItem im21, im22;
		JMenuBar mb=new JMenuBar();
		menu1=new JMenu("File"); 
		menu2=new JMenu("Edition"); 
		submenu=new JMenu("Sub Menu"); 
		i1=new JMenuItem("Item 1");
		i2=new JMenuItem("Item 2");
		i3=new JMenuItem("Item 3");
		i4=new JMenuItem("Item 4");
		i5=new JMenuItem("Item 5");
		
		im21=new JMenuItem("Item menu2 1");
		im22=new JMenuItem("Item menu2 2");
		
		menu1.add(i1); menu1.add(i2); menu1.add(i3);
		submenu.add(i4); submenu.add(i5);
		
		menu2.add(im21);
		menu2.add(im22);
		
		menu1.add(submenu);
		mb.add(menu1);
		mb.add(menu2);
		
	
		maFenetre1.setJMenuBar(mb);
		        
		////////////////////////////////////////////////////////////////////	

		JPanel pan = new JPanel();
		maFenetre1.setResizable(true);
		JButton Boutton = new JButton("Forme2");
		JButton Boutton2 = new JButton("Boite de dialogue");
		
		Boutton.setBounds(0,0,180,25);
		pan.add(Boutton);
		maFenetre1.getContentPane().add(Boutton);
		
		Boutton2.setBounds(0,300,180,25);
		pan.add(Boutton2);
		maFenetre1.getContentPane().add(Boutton2);

		JTextField Text1 = new JTextField(10);
		maFenetre1.getContentPane().add(Text1);
		Text1.setBounds(200,0,150,30);

		JLabel Label1 = new JLabel("...................");
		maFenetre1.getContentPane().add(Label1);
		Label1.setBounds(400,0,100,25);
		
		// event d'un menu
		i1.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Label1.setText("Salut tous le monde ");
			}
		} );
			
		
	        Boutton2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					  //// Gestion du fichier   /////////////
					
				    JFileChooser choose = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
				        // Ouvrez le fichier
				        int res = choose.showOpenDialog(null);
				        // Enregistrez le fichier
				        
				        if (res == JFileChooser.APPROVE_OPTION) {
				          File file = choose.getSelectedFile();
				          String ss= (file.getAbsolutePath()); 
				          JOptionPane.showMessageDialog(maFenetre1,"Vous avez selectionner un fichier: "+ss);
				        }
				        else
				        JOptionPane.showMessageDialog(maFenetre1,"Vous avez pas selectionner un fichier");
					
				}
			});
		
		Boutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				/*
				maFenetre2.setSize(400, 400);
				maFenetre2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				maFenetre2.setTitle("Fenetre2");
				maFenetre2.setVisible(true);
				*/
				//Déclaration de l'objet rand, qui servira a utiliser des nombre aléatoire.
				Random random = new Random();
				int nb;
				nb = random.nextInt(100);
				double d = Math.random();
				String str = nb+""; // str is '123.45'
				Text1.setText(str);
			}
		});
		
		
		
		try 
		  {
		   JFrame f = new JFrame("Ajouter une image dans JPanel");
		   JPanel panel = new JPanel();
		   panel.setBounds(50, 50, 250, 250);
		   BufferedImage img = ImageIO.read(new File("image/2.jpg"));
		   JLabel pic = new JLabel(new ImageIcon(img));
		   panel.add(pic);
		   maFenetre1.setTitle("Ajouter une image dans JPanel");
		   maFenetre1.add(panel);
		   maFenetre1.setSize(800, 400);
		   maFenetre1.setLayout(null);
		   maFenetre1.setVisible(true);
		  } 
		  catch (IOException e) {
			  JFrame f = new JFrame("image n'est pas charger");
			  f.setSize(200, 100);
			   f.setLayout(null);
			   f.setVisible(true);
		  }
	
		
	//maFenetre1.setVisible(true);
		
		
		
	
	}

}
