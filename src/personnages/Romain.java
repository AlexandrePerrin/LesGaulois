package personnages;

public class Romain {

	private String nom;
	private int force;

	// constructeur

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	// méthodes

	public int getForce() {
		return force;
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
