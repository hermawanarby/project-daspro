package perulangan;

import java.util.Scanner;

public class ProgramWhile {

	public static void main(String[] args) {
		
		Scanner scan;
		int input, jum;
		
		scan = new Scanner(System.in);
		jum = 0;
		
		System.out.printf("Masukan nilai selain 999. \n");
		System.out.printf("Program akan menhitung nilai jumlah yang dimaksudkan. \n");
		System.out.printf("Jika nilai adalah 999 maka program berhenti. \n\n");
		
		input = scan.nextInt();
		while(input != 999) {
			jum = jum + input;
			input = scan.nextInt();
		}
		System.out.printf("%d \n", jum);

	}

}
