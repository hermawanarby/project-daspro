package modul3;

import java.util.Scanner;

public class PrakC3_193040161 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Masukan nama");
		String nama = sc.next();
		
		System.out.println("Masukan Password");
		String password = sc.next();
		
		if((nama.equalsIgnoreCase("admin")) && (password.equals("Rahasia"))) {
			System.out.println("Selamat Datang");
		} else {
			System.out.println("Maaf anda siapa?");
		}

	}

}
