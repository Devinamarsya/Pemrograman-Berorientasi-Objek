package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Manusia;
import id.ac.undiksha.siak.people.Dosen;


public class Main {
	
	public static void main(String[] args) { //TODO
		
		/*Mahasiswa ani = new Mahasiswa();
		
		ani.setNim("12345");
		ani.setNama("Ani");
		ani.setAlamat("Singaraja");
		ani.setTanggalLahir("1 Januari 2000");
		ani.setJeniskelamin(true);
		ani.setProdi("Ilmu Komputer");*/
		
		Mahasiswa budi = new Mahasiswa(
				"Budi",
				"Singaraja",
				"1 Januari 2000",
				false,
				
				"10101010110",
				"ILKOM"
				);
		
		budi.printAll();
		
		System.out.println("----------");
		
		Mahasiswa mhs1 = new Mahasiswa();
		mhs1.printAll();
		mhs1.getProdi().setKodeProdi("10");
		mhs1.getProdi().setNamaProdi("ILKOM");		
		System.out.println("----------");
		
		
		/*ani.nim 	="12345";
		ani.nama	= "Ani";
		ani.alamat	="Singaraja";
		ani.tanggalLahir	="1 januari 2000";
		ani.jenisKelamin	= true;
		ani.prodi			="Ilmu Komputer";
		
		System.out.println(ani.nim);
		System.out.println(ani.nama);
		System.out.println(ani.alamat);
		System.out.println(ani.tanggalLahir);
		System.out.println(ani.jenisKelamin);
		System.out.println(ani.prodi);*/
		System.out.println (".......");
		
		
		Dosen dewa = new Dosen(
				"Dewa",
				"Balikpapan",
				"17 Juli 1970",
				false,
				
				"24567",
				"Bahasa Inggris"
				);
		dewa.printAll();
		System.out.println (".......");
		
		Manusia mn2 = new Mahasiswa();
				
	}
}