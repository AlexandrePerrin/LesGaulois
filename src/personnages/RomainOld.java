package personnages;

public class RomainOld {

	private String nom;
	private int force;

	// constructeur

	public RomainOld(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	// méthodes

	public String getNom() {
		return nom;
	}

	public void parler(String text) {
		System.out.println("Le romain " + this.nom + ": « " + text + " »");
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
}
