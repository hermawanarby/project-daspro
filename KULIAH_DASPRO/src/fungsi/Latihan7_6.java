package fungsi;

import java.util.Scanner;

public class Latihan7_6 {
	
	Scanner sc = new Scanner(System.in);
	
	public void setoran(double setoran) {
		double saldo = 0;
		saldo = saldo + setoran;
	}
	
	public double penarikan(double penarikan) {
		return penarikan;
	}
	
	public void run() {
		System.out.println("Program Saldo");
		System.out.println("=============");
		double saldo = 100000;
		System.out.println("Saldo Anda Sekarang "+ saldo);
		System.out.println("Masukan nominal uang yang di ingin di setor: ");
		double setor = sc.nextDouble();
		System.out.println("Masukan nominal uang yang di ingin di tarik: ");
		double penarikan = sc.nextDouble();
		System.out.println();
		double saldoBaru = saldo + setor;
		
		System.out.println("Init Saldo: "+ saldo);
		setoran(setor);
		System.out.println("Setoran: "+ setor);
		System.out.println("Saldo Baru: " + saldoBaru);
		System.out.println("Penarikan: "+ penarikan);
		
		if (penarikan > saldoBaru) {
			System.out.println("Saldo tidak mencukupi");
			System.out.println("Saldo Baru: "+ saldoBaru);
		} else {
			penarikan = saldoBaru - penarikan;
			System.out.println("Saldo baru : "+ penarikan);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Latihan7_6 program = new Latihan7_6();
	    program.run();
	}
}
