package testSwingHelloWorld;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HelloWorld {

	public static void main(String[] args) {
		JFrame f = new JFrame("ma fenetre");
		 
		f.setSize(800,800);
		 
		JPanel pannel = new JPanel(); 

	    JButton bouton = new JButton("saisir");
	    pannel.add(bouton);

	    JTextField jEdit = new JTextField("votre nom");

	    JLabel jLabel1 =new JLabel("Nom : "); 
	    jLabel1.setBackground(Color.red);
	    jLabel1.setDisplayedMnemonic('n');
	    jLabel1.setLabelFor(jEdit);
	    pannel.add(jLabel1);
	    pannel.add(jEdit);
		 
		f.getContentPane().add(pannel);
		f.setVisible(true);

	}

}
