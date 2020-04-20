package perulangan2;

public class ProgramFor {
	int i;
	
	void run()
	{
		for(i = 10; i <= 20; i=i+2)
		{
			System.out.printf("%d \n", i);
		}
	}
	
	public static void main(String[] args) {
		ProgramFor program = new ProgramFor();
		program.run();
	}
}
