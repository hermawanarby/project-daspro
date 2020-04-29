package ac.ifunpas.praktikum.daspro;

import java.util.Scanner;

public class TugasG1_193040161 {

	public static void main(String[] args) {
		TugasG1 tgs = new TugasG1();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String nama = sc.next();
        tgs.setNama(nama);
        
        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();
        tgs.setUmur(umur);
        
        System.out.print("\nInput tinggi badan (m): ");
        double tinggi = sc.nextDouble();
        tgs.setTinggi(tinggi);
        
        System.out.print("Masukkan berat badan (kg): ");
        double berat = sc.nextDouble();
        tgs.setBerat(berat);
                
        double BMI = berat / (tinggi * tinggi);
        
        System.out.println("\nNama: " + tgs.getNama());
        System.out.println("Umur: " + tgs.getUmur());
        System.out.println("\nTinggi Badan: " + tgs.getTinggi());
        System.out.println("Berat Badan: " + tgs.getBerat());
        System.out.printf("BMI: %.2f", BMI);
        System.out.println("");

	}
}
