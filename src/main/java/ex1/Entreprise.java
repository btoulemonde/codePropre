package ex1;

import java.util.Date;

/** Classe qui affiche le statut d'une entreprise
 * @author bapti
 *
 */

public class Entreprise {

	/**  Siret: numéro de Siret de l'entreprise */
	private int siret;
	
	/** Nom : nom de l'entreprise*/
	private String nom;
	
	/** Adresse: adresse de l'entreprise*/
	private String adresse;
	
	/** Date de Creation de l'entreprise*/
	private Date dateCreation;
	
	/**capital max : capital max de l'entreprise*/
	public static final int capitalMax = 3000000;
	
	
	
	/**
	 * @param siret
	 * @param nom
	 * @param adresse
	 * @param dateCreation
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
		super();
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}

	/**
	 * 
	 */
	public void afficherStatut(){
	}

	/** Getter
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/** Setter
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/** Getter
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

	/** Getter
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/** Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/** Getter
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/** Setter
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	
	
	
	
}
