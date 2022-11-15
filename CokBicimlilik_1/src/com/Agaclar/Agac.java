package com.Agaclar;

public class Agac {
	private int agacSivisi = 10;
	private int anaGovdeSayisi = 1;
	private int araGovdeSayisi = 3;
	
	public Agac(int agacSivisi, int anaGovdeSayisi, int araGovdeSayisi) {
		super();
		this.agacSivisi = agacSivisi;
		this.anaGovdeSayisi = anaGovdeSayisi;
		this.araGovdeSayisi = araGovdeSayisi;
	}
	public int getAgacSivisi() {
		return agacSivisi;
	}
	public void setAgacSivisi(int agacSivisi) {
		this.agacSivisi = agacSivisi;
	}
	public int getAnaGovdeSayisi() {
		return anaGovdeSayisi;
	}
	public void setAnaGovdeSayisi(int anaGovdeSayisi) {
		this.anaGovdeSayisi = anaGovdeSayisi;
	}
	public int getAraGovdeSayisi() {
		return araGovdeSayisi;
	}
	public void setAraGovdeSayisi(int araGovdeSayisi) {
		this.araGovdeSayisi = araGovdeSayisi;
	}
	public void degerleriYaz() {
		System.out.println(this.toString());
	}
	
	public final void fotoSentezYap() {
		System.out.println("oh nefes aldým");
	}
	
	@Override
	public String toString() {
		return "Agac [agacSivisi=" + agacSivisi + ", anaGovdeSayisi=" + anaGovdeSayisi + ", araGovdeSayisi="
				+ araGovdeSayisi + "]";
	}
	
}
