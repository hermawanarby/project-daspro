package perulangan3;

public class ProgramPersegiAsteris {
	
	int i, j;
	
	public void run()
	{
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ProgramPersegiAsteris program = new ProgramPersegiAsteris();
		program.run();
	}

}
