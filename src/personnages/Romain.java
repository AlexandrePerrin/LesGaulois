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
}
