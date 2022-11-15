package com.Agaclar;

//sub class (alt sýnýf)
public class DutAgaci extends Agac {
	private int dalSayisi = 14;
	private int yaprakSayisi = 120;
	
	public DutAgaci(int agacSivisi, int anaGovdeSayisi, int araGovdeSayisi, int dalSayisi, int yaprakSayisi) {
		super(agacSivisi, anaGovdeSayisi, araGovdeSayisi);
		this.dalSayisi = dalSayisi;
		this.yaprakSayisi = yaprakSayisi;
	}

	public int getDalSayisi() {
		return dalSayisi;
	}

	public void setDalSayisi(int dalSayisi) {
		this.dalSayisi = dalSayisi;
	}

	public int getYaprakSayisi() {
		return yaprakSayisi;
	}

	public void setYaprakSayisi(int yaprakSayisi) {
		this.yaprakSayisi = yaprakSayisi;
	}

	@Override
	public String toString() {
		return super.toString() + " DutAgaci [dalSayisi=" + dalSayisi + ", yaprakSayisi=" + yaprakSayisi + "]";
	}

	@Override
	public void degerleriYaz() {
		//super.degerleriYaz();
		System.out.println(this.toString());
	}
	
	public final void yaprakDok() {
		System.out.println("döküldüm");
	}
	
	public void a() {
		System.out.println("dut a");
	}
	
	public void ddd() {
		System.out.println("ddd");
	}
}
