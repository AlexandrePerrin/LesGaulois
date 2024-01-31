package personnages;

public class Gaulois extends Personnage{
	
	
	
	public Gaulois ( String nom, int force) {
		super(nom,force);
		this.buff = 1;
	}
	
	public String donnerAuteur() {return "Le Gaulois ";}

}
