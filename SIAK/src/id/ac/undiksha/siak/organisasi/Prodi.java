package id.ac.undiksha.siak.organisasi;

import id.ac.undiksha.siak.organisasi.Jurusan;

public class Prodi implements Jurusan {
	
	private String kodeProdi;
	private String namaProdi;
	
	public Prodi() {
		
	}
	
	public Prodi(String kodeProdi, String namaProdi) {
		super();
		this.kodeProdi = kodeProdi;
		this.namaProdi = namaProdi;
	}

	public String getKodeProdi() {
		return kodeProdi;
	}

	public void setKodeProdi(String kodeProdi) {
		this.kodeProdi = kodeProdi;
	}

	public String getNamaProdi() {
		return namaProdi;
	}

	public void setNamaProdi(String namaProdi) {
		this.namaProdi = namaProdi;
	}
	
	private String kodeJurusan;
	@Override
	public void setKodeJurusan(String kodeJurusan) {
		// TODO Auto-generated method stub
		this.kodeJurusan = kodeJurusan;
		
	}

	@Override
	public String getKodeJurusan() {
		return this.kodeJurusan;
	}

	
	private String namaJurusan;
	@Override
	public void setNamaJurusan(String namaJurusan) {
		this.namaJurusan = namaJurusan;
		
	}

	@Override
	public String getNamaJurusan() {
		return this.namaJurusan;
	}
	
	private String kodeFakultas;
	@Override
	public void setKodeFakultas(String kodeFakultas) {
		// TODO Auto-generated method stub
		this.kodeFakultas = kodeFakultas;
		
	}

	@Override
	public String getKodeFakultas() {
		return this.kodeFakultas;
	}

	
	private String namaFakultas;
	@Override
	public void setNamaFakultas(String namaFakultas) {
		this.namaFakultas = namaFakultas;
		
	}

	@Override
	public String getNamaFakultas() {
		return this.namaFakultas;
	}
	
}