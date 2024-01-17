package personnages;

public class Gaulois {
	
	private String nom;
	private int force;

	// constructeur
	
	public Gaulois(String nom,int force) {
		this.nom = nom;
		this.force = force;
	}
	
	// méthodes 
	
	public String getNom() {
		return this.nom;
	}
	
	public void parler(String text) {
		System.out.println("Le gaulois " + this.nom + ": « "+text +" »");
	}
	
	public void frapper(Romain romain) {
		System.out.println(this.getNom()+ " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup((this.force/3));
	}
	//main 
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		System.out.println(asterix.getNom());
	}
	

}
