package kasus;

import java.util.Scanner;

public class Kalkulator {
	
	public int tambah(int n1, int n2)
	{
		return n1+n2;
	}
	
	public int kurang(int n1, int n2)
	{
		return n1-n2;
	}
	
	
	public int kali(int n1, int n2)
	{
		return n1*n2;
	}
	
	public double bagi(int n1, int n2)
	{
		return (float) n1/n2;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Kalkulator kal = new Kalkulator();
		int a, b;
		
		for (String i = "Ya"; i.equals("Ya") || i.equals("ya"); ) {
			System.out.println("===========================");
			System.out.println("1. Kali \n" + "2. Bagi \n" + "3. Tambah \n" + "4. Kurang ");
			System.out.print("Pilih no kalkulator:");
			int input = sc.nextInt();
			System.out.println();
			
			switch(input) {
				case 1 : 
					System.out.println("Anda memilih operasi kali");
					System.out.println("===========================");
					System.out.print("Bilangan 1 = ");
					a = sc.nextInt();
					System.out.print("Bilangan 2 = ");
					b = sc.nextInt();
					System.out.println("perkalian = "+ kal.kali(a, b));
					System.out.println("===========================");
					break;
				case 2 : 
					System.out.println("Anda memilih operasi bagi");
					System.out.println("===========================");
					System.out.print("Bilangan 1 = ");
					a = sc.nextInt();
					System.out.print("Bilangan 2 = ");
					b = sc.nextInt();
					System.out.println("pembagian = "+ kal.bagi(a, b));
					System.out.println("===========================");
					break;
				case 3 : 
					System.out.println("Anda memilih operasi tambah");
					System.out.println("===========================");
					System.out.print("Bilangan 1 = ");
					a = sc.nextInt();
					System.out.print("Bilangan 2 = ");
					b = sc.nextInt();
					System.out.println("penjumlahan = "+ kal.tambah(a, b));
					System.out.println("===========================");
					break;
				case 4 : 
					System.out.println("Anda memilih operasi kurang");
					System.out.println("===========================");
					System.out.print("Bilangan 1 = ");
					a = sc.nextInt();
					System.out.print("Bilangan 2 = ");
					b = sc.nextInt();
					System.out.println("pengurangan = "+ kal.kurang(a, b));
					System.out.println("===========================");
					break;
				default :
					System.out.println("Pilihan tidak ada");
			}
			System.out.print("Mau Lagi (Ya/Tidak)?");
			i = sc.next(); 
			System.out.println();
		}
		System.out.println("===========================");
		System.out.println("Terima kasih.");
	}

}
