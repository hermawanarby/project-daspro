package perulangan2;

public class ProgramForToWhile {
	int i;
	
	void run()
	{
		i = 10;
		while(i <= 20)
		{
			System.out.printf("%d \n", i);
			i = i + 2;
		}
	}

	public static void main(String[] args) {
		ProgramForToWhile program = new ProgramForToWhile();
		program.run();
	}
}
