package modul3;

import java.util.Scanner;

public class Tugas1_193040161 {

	public static void main(String[] args) {
		Double bmi; 
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Masukkan tinggi badan (cm) : ");
		Double tb = keyboard.nextDouble();
		
		System.out.print("Masukkan berat badan (kg) : ");
		Double bb = keyboard.nextDouble();
		
		// bmi = Body Mass Index / bb = berat badan / tb = tinggi badan
		
		bmi = bb / tb * tb;
		
		if (bmi >= 25) {
			System.out.println("Anda memiliki resiko yang lebih tinggi terhadap penyakit jantung, osteoarthritis, beberapa tipe kanker dan diabetes level 2");
		} else if (bmi < 18) {
			System.out.println("Anda beresiko tinggi terhadap osteoporosis atau pertanda kesehatan badan tidak baik");
		} else if ((bmi >= 27) || (bmi <= 18)) {
			System.out.println("Sebaiknya anda meminta saran dari dokter Anda untuk memandu dalam program pengaturan rumus berat badan ideal untuk hidup lebih sehat.");
		}
		
	}

}
