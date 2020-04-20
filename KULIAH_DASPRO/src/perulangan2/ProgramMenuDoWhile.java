package perulangan2;

import java.util.Scanner;

public class ProgramMenuDoWhile {
	String jawab;
	Scanner scan;
	
	public void run()
	{
		scan = new Scanner(System.in);
		do {
			System.out.printf("=========================\n");
			System.out.printf("1. Makanan \n");
			System.out.printf("2. Minuman \n");
			System.out.printf("Pilih no menu:");
			jawab = scan.next();
			
			switch(jawab)
			{
				case "1":
					System.out.printf("Anda memilih Makanan, ENAK....!! \n");
					break;
				case "2":
					System.out.printf("Anda memilih Minuman, SEGAR...!! \n");
				default:
					System.out.printf("Anda salah memilih menu \n");
			}
			
			System.out.printf("=========================\n");
			System.out.printf("Mau Lagi (Ya/Tidak)?");
			jawab = scan.next();
			
		} while (jawab.equals("ya") || jawab.equals("Ya") || jawab.equals("YA") );
		System.out.printf("=========================\n");
		System.out.printf("Program Selesai \n");
		System.out.printf("Terima kasih \n");
	}

	public static void main(String[] args) {
		ProgramMenuDoWhile program = new ProgramMenuDoWhile();
		program.run();
	}
}
