package fungsi;

public class ProgramFungsiPenjumlahan {
	
	public void jumlah(int i1, int i2)
	{
		int jum = 0;
		for (int i = i1; i <= i2; i++) {
			jum += i;
		}
		System.out.printf("Jumlah dari %d ke %d adalah %d \n", i1, i2, jum);
	}
	
	public void run()
	{
		jumlah(1, 10);
		jumlah(20, 30);
		jumlah(35, 45);
	}

	public static void main(String[] args) {
		ProgramFungsiPenjumlahan program = new ProgramFungsiPenjumlahan();
	    program.run();
	}

}
