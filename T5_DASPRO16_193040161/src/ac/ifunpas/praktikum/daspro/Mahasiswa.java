package ac.ifunpas.praktikum.daspro;

import java.util.Scanner;

public class Mahasiswa {
	private String sNrp;
	private String sNama;
	private int iNilai;
	private double dIPK;
	
	Scanner sc = new Scanner(System.in);
	
	public void setsNrp (String sNrp) {
		this.sNrp = sNrp;
	}
	
	public String getsNrp() {
		return sNrp;
	}
	
	public void setsNama (String sNama) {
		this.sNama = sNama;
	}
	
	public String getsNama() {
		return sNama;
	}
	
	public void setiNilai (int iNilai) {
		this.iNilai = iNilai;
	}
	
	public int getiNilai() {
		return iNilai;
	}
	
	public void setdIPK (double dIPK) {
		this.dIPK = dIPK;
	}
	
	public double getdIPK() {
		return dIPK;
	}
	
}
