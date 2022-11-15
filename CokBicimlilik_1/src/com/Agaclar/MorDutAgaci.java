package com.Agaclar;

//final class (son sýnýf ve alt sýnýf)
public final class MorDutAgaci extends DutAgaci {

	private int tatSeviyesi = 50;
	private int eksilikSeviyesi = 60;
	
	public MorDutAgaci(int agacSivisi, int anaGovdeSayisi, int araGovdeSayisi, int dalSayisi, int yaprakSayisi,int tatSeviyesi,int eksilikSeviyesi) {
		super(agacSivisi, anaGovdeSayisi, araGovdeSayisi, dalSayisi, yaprakSayisi);
		this.tatSeviyesi = tatSeviyesi;
		this.eksilikSeviyesi = eksilikSeviyesi;
	}

	public int getTatSeviyesi() {
		return tatSeviyesi;
	}

	public void setTatSeviyesi(int tatSeviyesi) {
		this.tatSeviyesi = tatSeviyesi;
	}

	public int getEksilikSeviyesi() {
		return eksilikSeviyesi;
	}

	public void setEksilikSeviyesi(int eksilikSeviyesi) {
		this.eksilikSeviyesi = eksilikSeviyesi;
	}

	@Override
	public String toString() {
		return super.toString() + " MorDutAgaci [tatSeviyesi=" + tatSeviyesi + ", eksilikSeviyesi=" + eksilikSeviyesi + "]";
	}

	@Override
	public void degerleriYaz() {
		//super.degerleriYaz();
		System.out.println(this.toString());
	}

	public void golgeYap() {
		System.out.println("gölge yapýldý");
	}
	
	@Override
	public void a() {
		super.a();
		System.out.println("mor dut a");
	}
}
