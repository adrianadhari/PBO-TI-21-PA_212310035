class SegitigaKerucut {
	double luas, volume;
	
	double setLuas(double phi, double r) {
		luas = phi * (r * r);
		return luas;
	}
	
	double setVolume(double luass, double tinggi) {
		volume = (1 / 3) * (luass) * (tinggi);
		return volume;
	}
	
}

class Tabung {
	double luas, volume;
	
	double setLuas(double phi, double r, double tinggi) {
		luas = 2 * phi * r * (r + tinggi);
		return luas;
	}
	
	double setVolume(double phi, double r, double tinggi) {
		volume = phi * r * r * tinggi;
		return volume;
	}
}


public class Latihan03 {

	public static void main(String[] args) {
		SegitigaKerucut rumusSegitigaKerucut = new SegitigaKerucut();
		Tabung rumusTabung = new Tabung();
		
		double phi = 3.14;
		
		double jariJariSegitigaKerucut = 9;
		double tinggiSegitigaKerucut = 18;
		
		double jariJariTabung = 5;
		double tinggiTabung = 20;
		
		double getLuasSegitigaKerucut = rumusSegitigaKerucut.setLuas(phi, jariJariSegitigaKerucut);
		double getVolumeSegitigaKerucut = rumusSegitigaKerucut.setVolume(getLuasSegitigaKerucut, tinggiSegitigaKerucut);
		
		double getLuasTabung = rumusTabung.setLuas(phi, jariJariTabung, tinggiTabung);
		double getVolumeTabung = rumusTabung.setVolume(phi, jariJariTabung, tinggiTabung);

	
	
		System.out.println("Luas Segitiga Kerucut adalah = " + getLuasSegitigaKerucut);
		System.out.println("Volume Segitiga Kerucut adalah = " + getVolumeSegitigaKerucut);

		System.out.println("Luas Tabung adalah = " + getLuasTabung);
		System.out.println("Volume Tabung adalah = " + getVolumeTabung);
	}	
}
