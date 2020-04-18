package modul2;

import java.util.Scanner;

public class PrakB1_193040161 {

	public static void main(String[] args) {
		
		// dekalarasi variabel
		String nama, alamat;
		int usia, gaji;
		
		// membuat scanner
		Scanner keyboard = new Scanner(System.in);
		
		// tampilkan output ke user
		System.out.println("### Pendataan Karyawan PT. Petani Kode ###");
		System.out.print("Nama Karyawan: ");
		
		// menggunakan scanner dan menyimpan apa yang diketik di variabel nama
		nama = keyboard.next();
		// tampilkan output lagi
		System.out.print("Alamat: ");
		
		// menggunakan scanner lagi
		alamat = keyboard.next();
		System.out.print("Usia: ");
		usia = keyboard.nextInt();
		System.out.print("Gaji: ");
		gaji = keyboard.nextInt();
		
		// menampilkan apa yang sudah di simpan di variabel
		System.out.println("---------------------");
		System.out.println("Nama Karyawan: " + nama);
		System.out.println("Alamat: " + alamat);
		System.out.println("Usia: " + usia + " tahun");
		System.out.println("Gaji: Rp. " + gaji);		
	}
}
