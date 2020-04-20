package perulangan2;

import java.util.Scanner;

public class ProgramContinuePengulangan {
	Scanner scan;
	int input, jum;
	
	void run()
	{
		scan = new Scanner(System.in);
		jum = 0;
		
		System.out.printf("Masukan nilai selain 999. \n");
		System.out.printf("Program akan menghitung nilai jumlah yang dimasukan. \n");
		System.out.printf("Jika nilai adalah 999 maka program berhenti \n\n");
		
		while(true) 
		{
			input = scan.nextInt();
			if (input == 999)
				break;
			
			if (input % 2 == 1) {
				System.out.printf("%d adalah ganjil. Tidak dihitung \n", input);
				continue;
			}
			jum = jum + input;
		}
		System.out.printf("%d \n", jum);
	}

	public static void main(String[] args) {
		ProgramContinuePengulangan program = new ProgramContinuePengulangan();
		program.run();
	}
}
