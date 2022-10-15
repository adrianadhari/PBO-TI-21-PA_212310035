import java.util.Scanner;

public class Latihan02 {
	public static void main(String[] args) {
		int NPM, i, x;
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan NPM anda: ");
		NPM = input.nextInt();
		x = 0;
		for(i = 1; i <= NPM; i++) {
			if(NPM % i == 0) {
				x = x +1;
			}
		}	
			if(x ==2) {
				System.out.println("Termasuk bilangan prima");
			} else {
				System.out.println("Bukan termasuk bilangan prima karena dapat dibagi dengan 2");
			}
	}
}
