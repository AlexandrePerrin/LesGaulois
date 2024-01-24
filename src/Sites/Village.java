package Sites;

import personnages.*;

public class Village {
	
	private Gaulois chef;
	private Gaulois[] villageois = new Gaulois[50];
	private int nbVillageois = 0;
	
	public Village(Gaulois chef) {
		this.chef = chef;
	}

	public Gaulois getChef() {return chef;}
	
	public void addVillageois(Gaulois villageois) {
		if (nbVillageois == 4) {chef.parler("Désolé"+ villageois.getNom()+" mon village est deja bien rempli." );}
		else {
		this.villageois[nbVillageois] = villageois;
		nbVillageois++;
		chef.parler("Bienvenue" + villageois.getNom());
		}
	}
}

	
