package kasus2;

public class Latihan9_3 {

	public static void main(String[] args) {
		int a = 2;
		int b = -1;
		int c = 0;
		
		int i = 2;
		while(i <= 10)
		{
			i = i + 2;
			System.out.println(i);
			if (i % 2 == 1 && i <= 8)
				a = fungsi1(a, i);
			else
			{
				b = fungsi2(a, b, c);
			}
			c = c % b;
		}
		
		System.out.printf("%d %d %d ", a, b, c);
	}
	
	public static int fungsi1(int n1, int n2) {
		return n1 + n2;
	}
	
	public static int fungsi2(int n1, int n2, int n3) {
		return (n1 + n2) - n3;
	}

}
