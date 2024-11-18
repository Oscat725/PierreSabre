package Personnage;

import java.util.Random;

public class Traitre extends Samourai{
	private int niveauTraitrise=0;

	public Traitre(String seigneur, String nom, String boisson, int argent) {
		super(seigneur, nom, boisson, argent);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise<3) {
			int argentCommercant = commercant.getArgent();
			int argentRanconner = argentCommercant*2/10;
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			niveauTraitrise++;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi"+argentRanconner+" sous ou gare a toi !");
			commercant.parler("Tout de suit grand "+getNom()+".");
		}
		else {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risaue de me démasquer !");	
		}
	}
	
	public void faireLeGentil() {
		if (nbConnaisance<1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
			
		}
		else {
			Random random = new Random();
			Humain ami = memoireHumain[random.nextInt(nbConnaisance)];
			int don = (int)(getArgent()*(1.0/20.0));
			parler("Il faut absolument remonter ma cote de confiance. Je vais fair ami ami avec "+ami.getNom()+".");
			parler("Bonjour l'ami! Je voudrais vous aider en vous donnant "+don+" sous.");
			ami.gagnerArgent(don);
			perdreArgent(don);
			ami.parler("Merci"+this.getNom()+". Vous êtes quelq'un de bien");
			if (niveauTraitrise>1) {
				niveauTraitrise--;
				
			}
		}
	}

	

}
