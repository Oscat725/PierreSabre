package Personnage;

public class Ronin extends Humain{
	private int honneur=1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	private void donner(Commercant beneficiaire) {
		int argentDonner=(int) (this.getArgent()*0.1);
		this.parler(beneficiaire.getNom()+" prend ces "+argentDonner+" sous.");
		this.perdreArgent(argentDonner);
		beneficiaire.recevoir(argentDonner);
	}
	private void provoquer(Yakuza advairsaire) {
		int force = 2* honneur;
		if (force>=advairsaire.getReputation()) {
			this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre\n"
					+ "marchand!");
			this.parler("Je t’ai eu petit yakusa!");
			this.gagnerArgent(advairsaire.getArgent());
			advairsaire.perdre();
			honneur++;
		}
		else {
			honneur--;
			advairsaire.gagner(this.getArgent());
			this.perdreArgent(this.getArgent());
			
		}
		

	}
	
	

}
