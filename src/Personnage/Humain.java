package Personnage;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	
	
	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println(texte);
		
	}

	public void direBonjour() {
		parler("Bomnjour ! Je m'apelle "+nom+" et j'aime boire du "+ boisson);
		
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+boisson+"! GLOUPS !");
		
	}
	
	public void perdreArgent(int perte) {
		argent=argent-perte;
		
	}
	
	public void gagnerArgent(int gain) {
		argent=argent+gain;
	}
	
	public void acheter(String bien, int prix) {
		if (argent<prix) {
			parler("Je n'ai plus que "+argent+" sous en poche. J'en ne peux meme pas m'offrir un "+bien+" a "+prix+"sous.");
		}
		else {
			perdreArgent(prix);
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir un "+bien+" a "+prix+" sous.");
		}
	}
	
	
	
}
