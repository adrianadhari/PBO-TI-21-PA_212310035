public class Latihan01 {
	public static void main(String[] args) {
		float r;
		int c, f, k;
		c = 90;
		
		CelciusToFarenheit();
		r = CelciusToReamur();
		k = CelciusToKelvin(c);
		System.out.println("Convert Celcius to Reamur");
		System.out.println("r = " + r);
		System.out.println("Covert Celcius to Kelvin");
		System.out.println("k = " +  k);
	}
	
	
	static void CelciusToFarenheit() {
		int c = 90;
		int f = (9/5 * c) + 32;
		System.out.println("Convert Celcius to Farenheit");
		System.out.println("c = " + c);
		System.out.println("f = " + f);
	}
	
	static float CelciusToReamur() {
		int c = 90;
		int r = (5/4 * c);
		return r;
	}
	
	static int CelciusToKelvin(int c) {
		int k = (c + 273);
		return k;
	}
}
