package modul3;

import java.util.Scanner;

public class PrakC4_193040161 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Masukan Jenis Kelamin anda (L / P)?");
		String jKelamin = sc.next();
		
		if (jKelamin.equalsIgnoreCase("L") || (jKelamin.equalsIgnoreCase("p")) ) {
			System.out.println("Selamat anda dalam keadaan baik");
		} else {
			System.out.println("Maaf jenis kelamin anda apa?");
		}

	}

}
