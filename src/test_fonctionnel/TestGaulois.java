package test_fonctionnel;

import personnages.*;

public class TestGaulois {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 5);
		Romain minus = new Romain("Minus", 6);
		Gaulois agecanonix = new Gaulois("Agecanonix",1);
		Gaulois obelix = new Gaulois("Obélix",15);
		Gaulois assurancetourix = new Gaulois("Assurancetourix",2);
		Gaulois abraracourcix = new Gaulois("Abraracourcix",5);
		Druide panoramix = new Druide("Panoramix",1);
		panoramix.creerPotion(3);
		panoramix.faireBoire(asterix);
		panoramix.faireBoire(obelix);
		panoramix.faireBoire(assurancetourix);
		panoramix.faireBoire(abraracourcix);
		panoramix.faireBoire(agecanonix);
		
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU...UN GAUGAU...");
		
		while (minus.getForce()!=0) {
			asterix.frapper(minus);
			minus.frapper(asterix);
		}
	}

}
