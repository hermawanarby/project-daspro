package modul2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrakB2_193040161 {

	public static void main(String[] args) throws IOException {
		
		// membuat object inputstream
		InputStreamReader isr = new InputStreamReader(System.in);
		
		// membuat object bufferreder
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Inputan nama: ");
		
		String nama = br.readLine();
		// menampilkan output isi variabel nama
		System.out.println("Nama kamu adalah: " + nama);

	}

}
