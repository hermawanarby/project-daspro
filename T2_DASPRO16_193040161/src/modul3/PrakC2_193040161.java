package modul3;

import java.util.Scanner;

public class PrakC2_193040161 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Masukan Nilai ");
		int nilai = sc.nextInt();
		
		if(nilai > 60) {
			System.out.print("Selamat anda lulus");
		} else {
			System.out.print("Maaf anda harus mengulang");
		}

	}

}
