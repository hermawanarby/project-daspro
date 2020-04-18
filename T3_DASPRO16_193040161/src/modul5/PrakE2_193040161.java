package modul5;

import java.util.Scanner;

public class PrakE2_193040161 {
	static Scanner sc = new Scanner(System.in); 
	// variabel global yang dapat diakses oleh method ataupun main progrma
	
	public static void sapaDunia() {
		System.out.println("Hello dunia");
	}
	
	public static void tulisNama() {
		System.out.println("Masukan Nama: ");
		String nama = sc.next();
		// variabel local method, hanya dapat dikenali didalam method
		System.out.println("Nama saya adalah: " + nama);
	}
	
	public static void main(String[] args) {
		sapaDunia();
		tulisNama();
	}

}
