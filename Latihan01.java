import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan01 {
	public static void main(String[] args) {


		ArrayList<ArrayList<Integer>> matriksA = new ArrayList<ArrayList<Integer>>();
		for(int i =0; i<2; i++) {
			for(int j=0; j<2; j++) {
				String value = JOptionPane.showInputDialog(null, "Masukkan element A ["+i+"]["+j+"]");
				matriksA.add(new ArrayList<Integer>());
				matriksA.get(i).add(j, Integer.parseInt(value));
			}
		}
		String output = "Matrix A \n";	
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				output += matriksA.get(i).get(j) + " ";
			}
			output += "\n";
		}
		JOptionPane.showMessageDialog(null, output);
		
		
		ArrayList<ArrayList<Integer>> matriksB = new ArrayList<ArrayList<Integer>>();
		for(int i =0; i<2; i++) {
			for(int j=0; j<2; j++) {
				String value = JOptionPane.showInputDialog(null, "Masukkan element B ["+i+"]["+j+"]");
				matriksA.add(new ArrayList<Integer>());
				matriksA.get(i).add(j, Integer.parseInt(value));
			}
		}
		String outputs = "Matrix B \n";
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				outputs += matriksA.get(i).get(j) + " ";
			}
			outputs += "\n";
		}
		JOptionPane.showMessageDialog(null, outputs);
	}

}