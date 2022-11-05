import javax.swing.JOptionPane;
public class Latihan08 {

	public static void main(String[] args) {
		String kolom = "Nama Lengkap   Alamat   No Telp  ";
		String field[][] = {
				{"Nama Lengkap : ", "Alamat : ", "No Telp : "},
				{"Nama Lengkap : ", "Alamat : ", "No Telp : "},
				{"Nama Lengkap : ", "Alamat : ", "No Telp : "},
				{"Nama Lengkap : ", "Alamat : ", "No Telp : "}};
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j< 3; j++)
			field[i][j] = JOptionPane.showInputDialog(null, field[i][j], "Array ke["+i+"]"+"["+j+"]", JOptionPane.QUESTION_MESSAGE);
		}
		String data="";
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j< 3; j++) {
			data += field[i][j]+" ";	
			}
		}
			
		
		JOptionPane.showMessageDialog(null,kolom +"\n"+data+"\n");
		
	}
}