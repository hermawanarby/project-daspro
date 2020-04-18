package modul5;
import java.util.Scanner;
public class TugasE1_193040161 {
	static Scanner sc = new Scanner(System.in);
	
	public static int penjumlahan(int a, int b) {
		int hasil = 0;
		hasil = a + b;
		
		return hasil;
	}
	
	public static int pengurangan(int a, int b) {
		int hasil = 0;
		hasil = a - b;
		
		return hasil;
	}
	
	public static int perkalian(int a, int b) {
		int hasil = 0;
		hasil = a * b;
		
		return hasil;
	}
	
	public static int pembagian(int a, int b) {
		int hasil = 0;
		hasil = a / b;
		
		return hasil;
	}
	
	public static int mod(int a, int b) {
		int hasil = 0;
		hasil = a % b;
		
		return hasil;
	}
	
	public static String menu() {
		String pilihan = "";
		System.out.println("Selamat datang di kalkulator ini");
		System.out.println("Silahkan memilih menu berikut:");
		System.out.println("1. Penjumlahan");
		System.out.println("2. Pengurangan");
		System.out.println("3. Perkalian");
		System.out.println("4. Pembagian");
		System.out.println("5. Mod yaitu hasil sisa bagi");
		System.out.println("Jika anda memasukan angka 99 akan program akan menampilkan Selamat Tinggal");
		System.out.println("Mau apakah yang akan anda pilih");
		pilihan = sc.next();
		return pilihan;
	}

	public static void main(String[] args) {
		String sMenu = menu();
		int hasil = 0;
		double dHasil = 0;
		
		System.out.println("Masukan angka ke 1: ");
		int angka1 = sc.nextInt();
		System.out.println("Masukan angka ke 2: ");
		int angka2 = sc.nextInt();
		
		switch (sMenu) {
			case "1":
				hasil = penjumlahan(angka1, angka2);
				System.out.println("hasil = " + hasil);
				break;
			case "2":
				hasil = pengurangan(angka1, angka2);
				System.out.println("hasil = " + hasil);
				break;
			case "3":
				hasil = perkalian(angka1, angka2);
				System.out.println("hasil = " + hasil);
				break;
			case "4":
				dHasil = pembagian(angka1, angka2);
				System.out.println("hasil = " + dHasil);
				break;
			case "5":
				hasil = mod(angka1, angka2);
				System.out.println("hasil = " + hasil);
				break;
			case "99":
				System.out.println("selamat Tinggal");
			default:
				System.out.println("menu hanya sampai 5");
				break;
		}
	}
}
