package partie2;

public class EnseignantAvecStatut extends EnseignantImpl {

	private String statut;
	
	public EnseignantAvecStatut(String nom, String prenom, String statut){
		super(nom, prenom);
		this.statut = statut;
	}
	
	public String getStatut() {
		return this.statut;
	}
	
	public String toString() {
		return super.toString() + " " + this.getStatut();
	}
	
}
