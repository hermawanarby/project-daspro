package modul5;

import java.util.Scanner;

public class PrakE3_193040161 {
	static Scanner sc = new Scanner(System.in);
	
	public static void sapaDunia() {
		System.out.println("Hello Dunia");
	}
	
	public static void tulisNama(String a) {
		System.out.println("Nama saya adalah: " + a);
	}
	
	public static void main(String[] args) {
		sapaDunia();
		System.out.println("Masukan Nama: ");
		String nama = sc.next();
		tulisNama(nama);
	}

}
