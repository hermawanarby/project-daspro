package perulangan2;

import java.util.Scanner;

public class Tugas {
	Scanner scan;
	int input, jum;
	double rata2;
	
	void run()
	{
		scan = new Scanner(System.in);
		jum = 0;
		
		System.out.printf("Masukan nilai selain 0. \n");
		System.out.printf("Program akan menghitung nilai jumlah dan rata2 sesuai nilai yang dimasukan. \n");
		System.out.printf("Nilai masukan antara 1-100, jika diluar itu tidak di proses. \n");
		System.out.printf("Jika nilai adalah 0 maka program berhenti. \n\n");
		
		int i = 1;
		while(true) 
		{
			System.out.printf("Nilai ke-%d: ", i);
			input = scan.nextInt();
			
			if (input == 0) {
				i = i - 1;
				break;
			}
			if (input < 0 || input >= 100) {
				System.out.printf("%d tidak dihitung \n", input);
				continue;
			}
			
			jum = jum + input; 
			rata2 = (float) jum / i; 
			
			i = i + 1;
		}
		
		System.out.printf("Banyak inputan: %d \n", i);
		System.out.printf("Total nilai: %d \n", jum);
		System.out.printf("Rata-rata nilai: %.2f \n", rata2);
	}

	public static void main(String[] args) {
		Tugas program = new Tugas();
		program.run();
	}
}
