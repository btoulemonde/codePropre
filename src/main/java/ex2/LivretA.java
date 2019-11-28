package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	public LivretA(String type, double solde, double decouvert, double tauxRemuneration) {
		super("LA", solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	public void ajouterMontant(double montant) {
		setSolde(montant);
	}

	public void debiterMontant(double montant) {
		if (getSolde() - montant > 0){
			setSolde(getSolde() - montant);
		}
	}

	public void appliquerRemuAnnuelle() {
		{
			setSolde(getSolde()+getSolde()*this.tauxRemuneration/100);
		}
	}

}
