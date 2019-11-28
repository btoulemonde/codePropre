package ex3;

/**
 * @author DIGINAMIC
 */
public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine = new SavaneAfricaine();
	private ZoneCarnivore zoneCarnivore= new ZoneCarnivore();
	private FermeReptile fermeReptile = new FermeReptile();
	private Aquarium aquarium = new Aquarium();
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	public void addAnimal(Animal animal){
		if (animal.getType().equals("MAMMIFERE") && animal.getComportement().equals("CARNIVORE")){
			zoneCarnivore.addAnimal(animal);;
		}
		else if (animal.getType().equals("MAMMIFERE") && animal.getComportement().equals("HERBIVORE")){
			savaneAfricaine.addAnimal(animal);
		}
		else if (animal.getType().equals("REPTILE")){
			fermeReptile.addAnimal(animal);
		}
		else if (animal.getType().equals("POISSON")){
			aquarium.addAnimal(animal);
		}
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Zoo [nom=" + nom + ", savaneAfricaine=" + savaneAfricaine + ", zoneCarnivore=" + zoneCarnivore
				+ ", fermeReptile=" + fermeReptile + ", aquarium=" + aquarium + "]";
	}
}
