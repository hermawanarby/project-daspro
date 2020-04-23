package perulangan3;

public class Latihan6_17 {
	
	int i, j;
	
	public void run()
	{
		for (i = 5; i <= 9; i++) {
			for (j = 2; j <= 3; j++) {
				System.out.printf("%d,%d\n", i,j);
			}
		}
	}

	public static void main(String[] args) {
		Latihan6_17 program = new Latihan6_17();
		program.run();
	}

}
