package personnages;

import java.util.Random;

public class Druide extends Gaulois {

	protected int puissance = 0;
	protected int quantite = 0;

	public Druide(String nom, int force) {
		super(nom, force);

	}

	public void creerPotion(int quantite) {
		this.quantite = quantite;
		Random r = new Random();
		this.puissance = r.nextInt(4) + 2;
		this.parler("J'ai concocté " + quantite + " doses de potion magique. Elle a une force de " + this.puissance);
	}

	@Override
	public String donnerAuteur() {
		return "Le Druide ";
	}

	public void faireBoire(Gaulois gaulois) {
		if (this.quantite == 0) {
			this.parler(" Désolé " + gaulois.getNom() + " il n'y a plus une seule goutte de potion");
		} else if (gaulois.getNom() != null && gaulois.getNom().equals("Obélix")){
			this.parler(" Non, Obélix Non !... Et tu le sais très bien !");
		} else {
			gaulois.buff = gaulois.buff * this.puissance;
			this.parler("Tiens " + gaulois.getNom() + " un peu de potion magique");
			this.quantite--;
		}
	}
}
