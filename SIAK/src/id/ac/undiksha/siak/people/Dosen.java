package id.ac.undiksha.siak.people;

public class Dosen extends Manusia{
	
	private String nip;
	private String matakuliah;
	
	
	

	
	public Dosen(String nama, 
			String alamat, 
			String tanggalLahir, 
			boolean jeniskelamin, 
			
			String nip, 
			String matakuliah) {
		super(nama, alamat, tanggalLahir, jeniskelamin);
		this.nip = nip;
		this.matakuliah = matakuliah;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}
	
	public String getNip() {
		return this.nip;
	}

	public String getMatakuliah() {
		return matakuliah;
	}

	public void setMatakuliah(String matakuliah) {
		this.matakuliah = matakuliah;
	}

	
	public void printAll() {
		System.out.println(this.getNip());
		System.out.println(this.getMatakuliah());
		super.printAll();}
		
}
