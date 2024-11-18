package histoire;

import Personnage.*;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "Whisky", 30, "Warsong", 0);
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "sake", 80);
		
		akimoto.faireConnaissanceAvec(marco);
		
		akimoto.listerConnaissance();
		
		akimoto.boire("the");
		
		
	}

}
