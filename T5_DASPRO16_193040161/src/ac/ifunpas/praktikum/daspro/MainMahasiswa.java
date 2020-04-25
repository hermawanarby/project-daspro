package ac.ifunpas.praktikum.daspro;

import java.util.Scanner;

public class MainMahasiswa {
	
	public static void main(String[] args) {
		Mahasiswa mhs = new Mahasiswa();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Masukan NRP: ");
		String sNrp = sc.next();
		mhs.setsNrp(sNrp);
		
		System.out.println("Masukan Nama: ");
		String sNama = sc.next();
		mhs.setsNama(sNama);
		
		System.out.println("Masukan Nilai: ");
		int iNilai = sc.nextInt();
		mhs.setiNilai(iNilai);
		
		System.out.println("Masukan IPK: ");
		double dIPK = sc.nextDouble();
		mhs.setdIPK(dIPK);
		
		System.out.println("NRP: " + mhs.getsNrp());
		System.out.println("Nama: " + mhs.getsNama());
		System.out.println("Nilai: " + mhs.getiNilai());
		System.out.println("IPK: " + mhs.getdIPK());
	}

}
