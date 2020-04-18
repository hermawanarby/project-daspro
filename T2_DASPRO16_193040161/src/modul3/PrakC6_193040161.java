package modul3;

import java.util.Scanner;

public class PrakC6_193040161 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan Grade: ");
		String grade = sc.next();
		
		switch (grade) {
			case "A": 
				System.out.println("Angka mutu 4"); 
				break;
			case "B": 
				System.out.println("Angka mutu 3"); 
				break;
			case "C": 
				System.out.println("Angka mutu 2"); 
				break;
			case "D": 
				System.out.println("Angka mutu 1"); 
				break;
			default: 
				System.out.println("Angka mutu 0"); 
				break;
		}

	}

}
