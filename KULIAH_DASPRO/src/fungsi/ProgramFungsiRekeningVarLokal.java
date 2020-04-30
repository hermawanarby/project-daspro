package fungsi;

public class ProgramFungsiRekeningVarLokal {
	
	public void setoran(double setoran)
	{
		double saldo = 0;
		saldo = saldo + setoran;
	}
	
	public void run()
	{
		double saldo = 100000;
		double setor = 200000;
		System.out.printf("Init Saldo: %.2f \n", saldo);
		setoran(setor);
		System.out.printf("Setoran: %.2f \n", setor);
		System.out.printf("Saldo Baru: %.2f \n", saldo + setor);
	}

	public static void main(String[] args) {
		ProgramFungsiRekeningVarLokal program = new ProgramFungsiRekeningVarLokal();
	    program.run();
	}

}
