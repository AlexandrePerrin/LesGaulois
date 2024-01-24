package personnages;

public class Soldat extends Romain{
	
	private grade Grade;
	
	public Soldat(String nom, int force, grade Grade) {
		super(nom,force);
		this.Grade=Grade;
	}
	

}
