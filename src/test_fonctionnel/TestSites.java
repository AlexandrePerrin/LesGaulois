package test_fonctionnel;
import personnages.*;
import Sites.*;

public class TestSites {
	
	public static void main(String[] args) {
		
	Gaulois vercingetorix = new Gaulois ("Vercingérorix", 5);
	Village lagaule = new Village(vercingetorix);
	Soldat minus = new Soldat ("Minus",2,grade.SOLDAT);
	Camp lecamp = new Camp(minus);
	lagaule.getChef().parler("Je suis un grand guerrier et je vais créer mon village");
	lecamp.getCommandant().parler("Je suis en charge de créer un nouveau camp romain");
	
	Gaulois agecanonix = new Gaulois("Agecanonix",1);
	Gaulois assurancetourix = new Gaulois("Assurancetourix",2);
	Gaulois asterix = new Gaulois("Astérix",5);
	Gaulois obelix = new Gaulois("Obélix",15);
	Gaulois prolix = new Gaulois("Prolix",2);
	
	Soldat brutus = new Soldat ("Brutus",5,grade.CENTURION);
	Soldat milexcus = new Soldat ("Milexcus",2,grade.SOLDAT);
	Soldat tullius = new Soldat ("Tullius Octopus",2,grade.TESSERARIUS);
	Soldat ballon = new Soldat ("Ballondebaudrus",3,grade.OPTIO);
	
	lagaule.addVillageois(agecanonix);
	lagaule.addVillageois(assurancetourix);
	lagaule.addVillageois(asterix);
	lagaule.addVillageois(obelix);
	lagaule.addVillageois(prolix);
	
	lecamp.addsoldat(brutus);
	lecamp.addsoldat(milexcus);
	lecamp.addsoldat(tullius);
	lecamp.addsoldat(ballon);
	
	lagaule.afficherVillage();
	lecamp.afficherCamp();
	
	Soldat briseradius = new Soldat ("Briseradius",4,grade.SOLDAT);
	Soldat chorus = new Soldat ("Chorus",4,grade.CENTURION);
	Gaulois abraracourcix = new Gaulois("Abraracourcix",5);
	
	lecamp.changerCommandant(briseradius);
	lecamp.changerCommandant(chorus);
	lagaule.changerChef(abraracourcix);
	}
	
}
	