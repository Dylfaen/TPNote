
import javax.swing.JFrame;

import partie1.RepartitionFrame;
import partie2.Enseignant;
import partie2.EnseignantAvecStatut;
import partie2.EnseignantImpl;
import partie2.Matiere;
import partie2.MatiereInexistanteExcepetion;
import partie2.Repartition;

public class Main {

	public static void main(String [] args) {			
		EnseignantImpl e = new EnseignantImpl("Albert", "Einstein");
		System.out.println(e.toString());
		
		Matiere m = new Matiere("POO");
		Matiere n = new Matiere("SICF");
		Matiere o = new Matiere("POO");
		
		System.out.println(o.hashCode());
		System.out.println(m.hashCode());
		
		System.out.println(m.equals(n));
		System.out.println(m.equals(o));
		System.out.println(m.equals(e));
		System.out.println(m.equals(m));
		
		EnseignantAvecStatut a = new EnseignantAvecStatut("Baudon", "Olivier", "Cool");
		System.out.println(a.getStatut());
		System.out.println(a.toString());
		
		
		Repartition<EnseignantImpl> r = new Repartition<EnseignantImpl>(m,n);
		try {
			r.affecterMatiere(m, a);		
		}
		catch(MatiereInexistanteExcepetion exeption){
			System.out.println(exeption.getMessage());
		}
	
		
		
		
		JFrame f = new RepartitionFrame(r);
		f.pack();
		f.setVisible(true);
				
	}
}