package personnages;

public class Gaulois {
	
	private String nom;
	private int force;

	// constructeur
	
	public Gaulois(String n,int f) {
		this.nom = n;
		this.force = f;
	}
	
	// méthodes 
	
	public String getNom() {
		return this.nom;
	}
	
	public void parler(String text) {
		System.out.println("Le gaulois " + this.nom + ": « "+text +" »");
	}
	
	public void frapper(Romain r) {
		System.out.println(this.getNom()+ " envoie un grand coup dans la mâchoire de " + r.getNom());
		r.recevoirCoup((this.force/3));
	}
	//main 
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		System.out.println(asterix.getNom());
	}
	

}
