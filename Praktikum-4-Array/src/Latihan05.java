import javax.swing.JOptionPane;
public class Latihan05 {

	public static void main(String[] args) {
		
		String field[] = {"Nama Lengkap : ", "Alamat : ", "No Telp : "};
		String data = "";
		String isi = "";
		for (int i = 0; i < field.length; i++) {
			field[i] = JOptionPane.showInputDialog(null, field[i], "Data Array ke-"+i, JOptionPane.QUESTION_MESSAGE);
			if(i==0) {
				data += "Nama "+field[i]+"\n";  
			}
			else if(i==1) {
				data += "Alamat "+field[i]+"\n";
			}
			else {
				data += "Nomor HP "+field[i];
			}
		}
		
		JOptionPane.showMessageDialog(null, data);
		
	}
}