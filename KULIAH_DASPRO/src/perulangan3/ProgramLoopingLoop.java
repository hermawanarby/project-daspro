package perulangan3;

public class ProgramLoopingLoop {
	
	int i, j;
	
	public void run()
	{
		for (i = 1; i <= 2; i++) {
			for (j = 1; j <= 3; j++) {
				System.out.printf("%d,%d\n", i,j);
			}
		}
	}

	public static void main(String[] args) {
		ProgramLoopingLoop program = new ProgramLoopingLoop();
		program.run();
	}

}
