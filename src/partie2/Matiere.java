package partie2;

public class Matiere {

	private String nom;
	
	public Matiere(String nom) {
		this.nom = nom;
	}
	
	public String nom() { 
		return nom;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Matiere)) {
			return false;
		}
		Matiere m = (Matiere)o;
		return m.nom.hashCode() == this.nom.hashCode();
	}
	
	public int hashCode() {
		return nom.hashCode();
	}
}