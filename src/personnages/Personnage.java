package personnages;


public abstract class Personnage {

	private String nom;
	private int force;
	protected double buff;
	// constructeur

	public Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.buff = 1;
	}

	// méthodes

	public String getNom() {
		return this.nom;
	}
	public int getForce() {return this.force;}

	public void parler(String text) {
		System.out.println(donnerAuteur() + this.nom + ": « " + text + " »");
	}

	public void frapper(Personnage adversaire) {
		
		if (buff <= 1) {
		System.out.println(donnerAuteur() + this.getNom() + " envoie un grand coup de force "+this.force+" dans la mâchoire de "
				+ adversaire.donnerAuteur() + adversaire.getNom());
		adversaire.recevoirCoup(this.force / 3);
		}
		else {
			System.out.println(donnerAuteur() + this.getNom() + " envoie un grand coup de force "+this.force+" dans la mâchoire de "
					+ adversaire.donnerAuteur() + adversaire.getNom());
		
		adversaire.recevoirCoup((int)(this.force *this.buff) / 3);
		buff = buff -1/2;
		}
	}

	public void recevoirCoup(int force) {
		this.force = this.force - force;
		if (this.force < 0) {
			this.force = 0;
		}
		if (this.force > 0) {
			parler("Aïe !");
		} else {
			parler("J'abandonne !");
		}
	}

	public abstract String donnerAuteur();

	// main

	public static void main(String[] args) {
		GauloisOld asterix = new GauloisOld("Astérix", 8);
		System.out.println(asterix.getNom());
	}

}
