package modul2;

import java.util.Scanner;

public class Tugas2_193040161 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		double tinggi, berat, ibm;
		
		System.out.println("=== Program Body Mass Index ===");
		System.out.println("-------------------------------------");
		
		System.out.print("Input Tinggi Badan (cm): ");
		tinggi = keyboard.nextDouble();
		
		System.out.print("Input Berat Badan (kg): ");
		berat = keyboard.nextDouble();
		
		ibm = berat / (tinggi * tinggi);
		
		System.out.println("-------------------");
		
		if(ibm <= 18.5f)
		System.out.println("Tubuh Anda Kurus");
		
		else if((18.5f < ibm)&&(ibm <= 25))
		System.out.println("Tubuh Anda Normal");
		
		else if((25 < ibm)&&(ibm <= 30))
		System.out.println("Tubuh Anda Gemuk");

	}

}
