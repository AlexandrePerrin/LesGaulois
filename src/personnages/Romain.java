package personnages;

public class Romain extends Personnage{
	
	private int[] stuff = new int[3];
	
	public Romain(String nom, int force) {
		super(nom,force);
		
	}
	
	public String donnerAuteur() {return "Le Romain ";}

	public void equiperCasque(int casque) {
		this.stuff[0]=casque;
		this.parler("s'équipe d'un casque");
	}
	
	public void equiperPlastron(int plastron) {
		this.stuff[1]=plastron;
		this.parler("s'équipe d'un plastron");
	}
	
	public void equiperBouclier(int bouclier) {
		this.stuff[2]=bouclier;
		this.parler("s'équipe d'un bouclier");
	}
	@Override
	public void recevoirCoup(int force) {
		force = force - stuff[0]-stuff[1]-stuff[2];
		this.force = this.force -force;
		System.out.println("L'armure encaisse "+ (stuff[0]+stuff[1]+stuff[2]) + " du coup.");
		if (this.force < 0) {
			this.force = 0;
		}
		if (this.force > 0) {
			parler("Aïe !");
		} else {
			parler("J'abandonne !");
		}
	}
}
