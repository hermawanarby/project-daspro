package perulangan;

import java.util.Scanner;

public class ProgramDoWhile {

	public static void main(String[] args) {
		
		String jawab;
		Scanner scan;
		
		scan = new Scanner(System.in);
		
		do {
			
			System.out.printf("========================\n");
			System.out.printf("Anda sedanga mencoba program\n");
			System.out.printf("Mau Lagi (Ya/Tidak)?");
			jawab = scan.next();
			
		} while (jawab.equals("Ya") || jawab.equals("YA"));
		
		System.out.printf("==========================\n");
		System.out.printf("Program Selesai\n");
		System.out.printf("Terima kasih.\n");
	}

}
