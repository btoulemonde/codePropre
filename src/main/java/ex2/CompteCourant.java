package ex2;

public class CompteCourant extends CompteBancaire {

	public CompteCourant(String type, double solde, double decouvert) {
		super("CC", solde, decouvert);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see ex2.CompteBancaire#ajouterMontant(double)
	 */
	@Override
	public void ajouterMontant(double montant) {
		
		setSolde(montant);
	}

	/* (non-Javadoc)
	 * @see ex2.CompteBancaire#debiterMontant(double)
	 */
	@Override
	public void debiterMontant(double montant) {
		if (getSolde() - montant > getDecouvert()){
			setSolde(getSolde() - montant);
		}	
	}

	@Override
	public void appliquerRemuAnnuelle() {
		// TODO Auto-generated method stub
		
	}
	

}
