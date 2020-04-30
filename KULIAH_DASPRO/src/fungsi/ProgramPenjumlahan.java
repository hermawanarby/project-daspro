package fungsi;

public class ProgramPenjumlahan {
	
	public void run()
	  {
	    int jum = 0;
	    for (int i = 1; i <= 10; i++) 
	    {
	      jum += i;
	    }
	    System.out.println("Jumlah dari 1 ke 10 adalah " + jum);

	    jum = 0;
	    for (int i = 20; i <= 30; i++) 
	    {
	      jum += i;
	    }
	    System.out.println("Jumlah dari 20 ke 30 adalah " + jum);

	    jum = 0;
	    for (int i = 35; i <= 45; i++) 
	    {
	      jum += i;
	    }
	    System.out.println("Jumlah dari 35 ke 45 adalah " + jum);
	  }
	
	public static void main(String[] args) {
		ProgramPenjumlahan program = new ProgramPenjumlahan();
	    program.run();
	}
}
