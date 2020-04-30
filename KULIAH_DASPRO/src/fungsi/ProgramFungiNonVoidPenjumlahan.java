package fungsi;

public class ProgramFungiNonVoidPenjumlahan {
	
	public int jumlah(int i1, int i2)
	{
		int jum = 0;
		for (int i = i1; i <= i2; i++) {
			jum += i;
		}
		return jum;
	}
	
	public void run()
	{
		System.out.printf("Jumlah dari %d ke %d adalah %d \n", 1, 10, jumlah(1, 10));
		System.out.printf("Jumlah dari %d ke %d adalah %d \n", 20, 30, jumlah(20, 30));
		System.out.printf("Jumlah dari %d ke %d adalah %d \n", 35, 45, jumlah(35, 45));
	}

	public static void main(String[] args) {
		ProgramFungiNonVoidPenjumlahan program = new ProgramFungiNonVoidPenjumlahan();
	    program.run();
	}

}
