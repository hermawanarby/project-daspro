package modul6;

import java.util.Scanner;

public class TugasF1_193040161 {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		int jum = 0;
		
		System.out.print("Masukan Banyak Element: ");
		int banyakInput = userInput.nextInt();
		int[] angka = new int[banyakInput];
		
		for (int i = 0; i < angka.length; i++) {
			System.out.print("Masukan Angka ke-" + (i+1) + ": ");
			angka[i] = userInput.nextInt();
		}
		
		for (int i = 0; i < angka.length; i++) {
			System.out.println("Angka ke-"  + (i+1) + ": " + angka[i]);
			
			jum += angka[i];
			
			if (angka[i] % 2 == 1) {
				 System.out.println(angka[i] + " itu angka GANJIL");
			} else {
				System.out.println(angka[i] + " itu angka GENAP");
			}
			
		}
		 System.out.println("Total: " + jum);
	}
}
