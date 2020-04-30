package fungsi;

public class ProgramParameterFungsi {
	
	public int kali(int n1, int n2)
	{
		return n1*n2;
	}
	
	public void run()
	{
		int bil1 = 2;
		int bil2 = 3;
		System.out.printf("%d x %d = %d \n", bil1, bil2, kali(bil1, bil2));
	}

	public static void main(String[] args) {
		ProgramParameterFungsi program = new ProgramParameterFungsi();
	    program.run();
	}

}
