package Personnage;


public class Yakuza extends Humain {
	private String clan;
	private int reputation=0;
	
	public Yakuza(String nom, String boisson, int argent, String clan, int reputation) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	private void extorquer(Commercant victime) {
		this.parler("Tiens,tiens, ne serait-ce pas un faible marchand qui passe par la?");
		this.parler(victime.getNom()+", si tu tiens a la vie donne moi ta bourse!");
		int argentGagne=victime.seFaireExtorquer();
		this.gagnerArgent(argentGagne);
		this.parler("J'ai piqué les "+argentGagne+" sous de "+victime.getNom()+", ce qui me fait "
				+ this.getArgent() +" sous dans ma poche. Hi! Hi!");
		
	}
	
	public int getReputation() {
		return reputation;
	}

	public void perdre() {
		reputation--;
		this.parler("J’ai perdu mon duel et mes "+this.getArgent()+" sous, snif... J'ai déshonoré le clan de\n"
				+ clan);
		perdreArgent(this.getArgent());
	}
	
	public void gagner(int gain) {
		this.gagnerArgent(gain);
		reputation++;
		this.parler("Ce ronin pensait vraiment battre "+this.getNom()+" du clan de "+clan+" ?\n"
				+ "Je l'ai dépouillé de ses "+gain+" sous.");
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de "+clan);
	}
	
	
}
