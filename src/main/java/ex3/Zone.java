package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {
	
	private List<Animal> animaux = new ArrayList<>();
	
	

	

	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}

	/**
	 * Méthode permetant d'afficher la liste des animaux du zoo
	 */
	public void afficherListeAnimaux() {
		for (Animal nom : animaux) {
			System.out.println(nom);
		}
	}

	/**
	 * méthode permettant de compter les animaux du zoo
	 * 
	 * @return integer
	 */
	public int compterAnimaux() {
		return animaux.size();
	}

	/**
	 * Méthode permettant d'afficher le poids d'un animal
	 * 
	 * @return double
	 */
	public abstract double getPoids();

	/**
	 * méthode permettan de calculer la masse de nourriture quotidienne
	 * 
	 * @return double
	 */
	public double calculerKgsNourritureParJour() {
		return animaux.size() * getPoids();
	}

}
