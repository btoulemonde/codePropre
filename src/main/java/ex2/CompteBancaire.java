package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {

	/** solde : solde du compte */
	private double solde;
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;
	
	
	
	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	private String type;
	
	/**
	 * @param solde
	 * @param decouvert
	 * @param type
	 */
	public CompteBancaire(String type, double solde, double decouvert) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
	}
	
	
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public abstract void ajouterMontant(double montant);
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public abstract void debiterMontant(double montant);
	
	public abstract void appliquerRemuAnnuelle();
	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/** Getter for decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	/** Getter for type
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/** Setter
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
