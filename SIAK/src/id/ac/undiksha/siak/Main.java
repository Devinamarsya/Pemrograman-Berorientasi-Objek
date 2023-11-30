package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Dosen;

public class Main {

	public static void main(String[] args) {
		
Mahasiswa ani = new Mahasiswa();
Dosen wayan = new Dosen();
		
		ani.setNim("1234");
		ani.setNama("Ani");
		ani.setAlamat("Singaraja");
		ani.setProdi("Ilmu Komputer");
		ani.setTanggalLahir("1 Januari 2000");
		ani.setJeniskelamin(true);
		
		wayan.setNip("456");
		wayan.setNama("Wayan");
		wayan.setAlamat("Singaraja");
		wayan.setProdi("Ilmu Komputer");
		wayan.setTanggalLahir("17 Juli 1980");
		wayan.setJeniskelamin(false);
		
		System.out.println(ani.getNim());
		System.out.println(ani.getNama());
		System.out.println(ani.getAlamat());
		System.out.println(ani.getProdi());
		System.out.println(ani.getTanggalLahir());
		System.out.println(ani.getJeniskelamin());
		
		System.out.println(wayan.getNip());
		System.out.println(wayan.getNama());
		System.out.println(wayan.getAlamat());
		System.out.println(wayan.getProdi());
		System.out.println(wayan.getTanggalLahir());
		System.out.println(wayan.getJeniskelamin());

	}

}
