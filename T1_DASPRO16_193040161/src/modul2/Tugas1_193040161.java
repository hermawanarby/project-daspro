package modul2;

import java.util.Scanner;

public class Tugas1_193040161 {

	public static void main(String[] args) {
		// Program hitung luas lingkaran
		
		final double PHI = 3.14;
		int r;
		double luas;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("=== PROGRAM HITUNG LUAS LINGKARAN ===");
		System.out.println("-------------------------------------");
		System.out.print("Masukkan nilai Jari Jari : ");
		r = keyboard.nextInt();
		
		System.out.println("-------------------------------------");
		
		luas = PHI*r*r;
		
		System.out.println("Luas lingkarannya adalah: " + luas + " cm²");
	}

}
