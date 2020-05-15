package kasus2;

public class Latihan9_2 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = -1;
		
		for (int i = 1; i <= 5; i++) {
			System.out.printf("%d \n", i);
			
			if(i % 2 == 0 && i < 4) 
				a = a + i;
			else 
			{
				b = (a + b) - i;
				c = c + b;
			}
		}
		System.out.println();
		System.out.printf("%d %d %d", a, b, c);
	}

}
