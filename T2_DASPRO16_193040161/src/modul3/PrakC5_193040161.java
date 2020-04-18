package modul3;

import java.util.Scanner;

public class PrakC5_193040161 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Masukan nilai akhir kuliah");
		int nilai = sc.nextInt();
		
		if (nilai < 0 || nilai > 100) {
			System.out.println("\nInput nilai antara 0-100");
		}
		
		if (nilai >= 85 && nilai <= 100) {
			System.out.println("\nLULUS");
			System.out.println("\nGRADE A");
		} else if(nilai >= 75 && nilai < 85) {
			System.out.println("\nLULUS");
			System.out.println("\nGRADE B");
		} else if(nilai >= 60 && nilai < 75) {
			System.out.println("\nLULUS");
			System.out.println("\nGRADE C");
		} else if(nilai >= 45 && nilai < 60) {
			System.out.println("\nGAGAL");
			System.out.println("\nGRADE D");
		} else {
			System.out.println("\nGAGAL");
			System.out.println("\nGRADE E");
		}

	}

}
