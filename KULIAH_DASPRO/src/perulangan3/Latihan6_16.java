package perulangan3;

public class Latihan6_16 {
	
	int i, j;
	
	public void run()
	{
		for (i = 4; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Latihan6_16 program = new Latihan6_16();
		program.run();
	}

}
