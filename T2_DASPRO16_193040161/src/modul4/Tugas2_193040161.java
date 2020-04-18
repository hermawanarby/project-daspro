package modul4;

import java.util.Scanner;

public class Tugas2_193040161 {

	public static void main(String[] args) {
		
		int bil; 
		int total = 0;
        boolean stop = false;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Bilangan Bulat");
        
        for (int i = 0; !stop; i++) {
        	bil = input.nextInt();
            
            total += bil;
            
            if (bil == 0) {
               stop = true;
            }
        }
        System.out.println("Total Bilangan Bulat: " + total);
	}

}
