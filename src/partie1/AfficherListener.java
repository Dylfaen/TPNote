package partie1;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import partie2.Enseignant;
import partie2.EnseignantAvecStatut;
import partie2.Matiere;
import partie2.Repartition;


public class AfficherListener implements ActionListener {
	private JTextField texte;
	private Repartition rep;
	private JTextArea display;
	
	public AfficherListener(JTextField texte, Repartition rep, JTextArea display) {
		this.texte = texte;
		this.rep = rep;
		this.display = display;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//cast en JButton pour récupérer le composant source de l'action
		System.out.println(this.texte.getText());
		Matiere mText = new Matiere(this.texte.getText());
		Enseignant e = rep.enseignant(mText);
		if(e==null) {
			this.display.setText("matière non affectée");
		}
		else {
			this.display.setText(e.toString());
		}
	}

}