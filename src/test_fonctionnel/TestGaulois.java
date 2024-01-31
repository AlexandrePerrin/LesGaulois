package test_fonctionnel;

import personnages.*;

public class TestGaulois {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 5);
		Soldat minus = new Soldat("Minus", 6,grade.SOLDAT);
		Gaulois agecanonix = new Gaulois("Agecanonix",1);
		Gaulois obelix = new Gaulois("Obélix",15);
		Gaulois assurancetourix = new Gaulois("Assurancetourix",2);
		Gaulois abraracourcix = new Gaulois("Abraracourcix",5);
		Druide panoramix = new Druide("Panoramix",1);
		
		minus.equiperBouclier(3);
		minus.equiperCasque(2);
		minus.equiperPlastron(3);
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
