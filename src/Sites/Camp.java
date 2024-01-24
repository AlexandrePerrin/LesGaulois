package Sites;

import personnages.*;

public class Camp {
	
	private Soldat commandant;
	private Soldat[] soldats = new Soldat[80];
	private int nbsoldat = 0;
	
	public Camp(Soldat commandant) {
		this.commandant = commandant;
	}

	public Soldat getCommandant(){
		return commandant;
	}
	
	public void addsoldat(Soldat soldat) {
		if (nbsoldat == 3) {commandant.parler("Désolé"+ soldat.getNom()+"mon camp est complet !");}
		else{
		this.soldats[nbsoldat] = soldat;
		nbsoldat++;
		commandant.parler("je mets mon épée au service de Rome dans le camp dirigé par"+ commandant.getNom());
		
		}
	}
}
