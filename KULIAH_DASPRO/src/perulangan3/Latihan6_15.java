package perulangan3;

public class Latihan6_15 {
	
	public void run()
	{
		for (int a = 1; a <= 4; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		for (int c = 1; c <= 4; c++){
            for (int d = 4; d >= c; d--){
                System.out.print(" ");
            }
            for (int e = 1; e <= c; e++){
                System.out.print("*");
            }
            System.out.println();
        }
	}

	public static void main(String[] args) {
		Latihan6_15 program = new Latihan6_15();
		program.run();
	}

}
