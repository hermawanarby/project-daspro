package perulangan2;

import java.util.Scanner;

public class ProgramContinuePengulanganWhile {
	Scanner scan;
	int input, jum;
	
	void run()
	{
		scan = new Scanner(System.in);
		jum = 0;
		
		int i = 1;
		while(i <= 5 )
		{
			System.out.printf("%d. ", i);
			input = scan.nextInt();
			
			if (input < 0) 
			{
				System.out.printf("%d adalah minus. Tidak dihitung \n", input);
				continue;
			}
			
			jum = jum + input;
			i = i + 1;
		}
		System.out.printf("Total: %d \n", jum);
	}

	public static void main(String[] args) {
		ProgramContinuePengulanganWhile program = new ProgramContinuePengulanganWhile();
		program.run();
	}
}
