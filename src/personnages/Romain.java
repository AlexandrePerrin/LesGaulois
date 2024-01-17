package personnages;

public class Romain {

	private String nom;
	private int force;

	// constructeur
	
	public Romain(String n,int f) {
		this.nom = n;
		this.force = f;
	}
	
	// méthodes 
	
	public String getNom() {
		return this.nom;
	}
	
	public void parler(String text) {
		System.out.println("Le romain " + this.nom + ": « "+text +" »");
	}
	
	public void recevoirCoup(int f) {
		this.force = this.force -f;
		if (this.force < 0) {this.force = 0;}
		if (this.force > 0) {this.parler("Aïe !");}
		else {this.parler("J'abandonne !");}
	}
}
