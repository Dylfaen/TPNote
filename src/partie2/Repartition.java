package partie2;

import java.util.HashMap;
import java.util.Map;

public class Repartition<T extends Enseignant> {
	private Map<Matiere, T> repartition;

	public Repartition(Matiere... matieres) {
		repartition = new HashMap<Matiere, T>();
		for (Matiere m : matieres) {
			repartition.put(m, null);
		}
	}

	public T enseignant(Matiere matiere) {
		return repartition.get(matiere);
	}
	
	public void affecterMatiere(Matiere m, T e) throws MatiereInexistanteExcepetion {
		boolean b = false;
		for(Matiere matiere : this.repartition.keySet()) {
			if(matiere.equals(m)) {
				b = true;
			}
		}
		if(!b) {
			throw new MatiereInexistanteExcepetion("La matière n'existe pas dans la liste des matières a attribuer");
		}
		repartition.put(m, e);
	}
	
	public void afficherContenu() {
		for(Matiere m : repartition.keySet()) {
			String key = m.toString();
			String value = repartition.get(m).toString();
			System.out.println(key + " " + value+"\n");
		}
	}
}