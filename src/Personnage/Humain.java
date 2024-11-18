package Personnage;


public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	protected Humain memoireHumain[] = new Humain[30];
	protected int nbConnaisance=0;
	
	
	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println("("+nom+") - "+texte);
		
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'apelle "+nom+" et j'aime boire du "+ boisson);
		
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+boisson+"! GLOUPS !");
		
	}
	
	protected void perdreArgent(int perte) {
		argent=argent-perte;
		
	}
	
	protected void gagnerArgent(int gain) {
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
	
	private void memoriser(Humain Connaisance) {
		if ( nbConnaisance < 30) {
			nbConnaisance++;
			memoireHumain[nbConnaisance-1]=Connaisance;
		} 
		else {
			for (int i = 0; i < (30-1); i++) {
				memoireHumain[i] = memoireHumain[i+1];
			}
			memoireHumain[(30-1)]=Connaisance;
		}
		
	}
	
	private void repondre(Humain Connaisance) {
		this.direBonjour();
		this.memoriser(Connaisance);
		
		
	}
	
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		this.direBonjour();
		autreHumain.repondre(this);
		this.memoriser(autreHumain);
	}
	
	public void listerConnaissance() {
		System.out.print("("+nom+") - "+"Je connais beaucoup de monde dont : ");
		for (int i = 0; i < nbConnaisance; i++) {
			String nom = memoireHumain[i].getNom();
			System.out.print(nom+", ");
		} 
		System.out.println("");
	}
	

	
	
	
	
}
