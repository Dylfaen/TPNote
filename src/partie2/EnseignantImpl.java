package partie2;

public class EnseignantImpl implements Enseignant {

	private String nom;
	private String prenom;
	
	public EnseignantImpl(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public String nom() {
		return nom;
	}
	
	public String prenom() {
		return prenom;
	}
	
	public String toString() {
		return prenom() + " " + nom();
	}
}