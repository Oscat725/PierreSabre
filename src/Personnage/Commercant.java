package Personnage;

public class Commercant extends Humain {

	public Commercant(String nom,int argent) {
		super(nom, "the", argent);
		
	}
	
	public int seFaireExtorquer() {
		int argentPerdu=this.getArgent();
		this.perdreArgent(argentPerdu);
		this.parler("J'ai tout perdu! Le monde est trop injuste...");
		return argentPerdu;
	}
	
	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		this.parler(argent+" sous! Je te remercie généreux donateur!");
	}
	
	
	

}
