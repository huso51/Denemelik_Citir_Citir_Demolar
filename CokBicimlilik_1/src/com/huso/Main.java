package com.huso;

import com.Agaclar.Agac;
import com.Agaclar.DutAgaci;
import com.Agaclar.MorDutAgaci;

public class Main {

	public static void main(String[] args) {
		Agac agac = new Agac(40, 1, 4);
		agac.degerleriYaz();
		

		DutAgaci dutAgaci = new DutAgaci(20, 2, 5, 4, 7);
		dutAgaci.degerleriYaz();
		dutAgaci.fotoSentezYap();
		
		Agac morDutAgaci = new MorDutAgaci(4, 2, 7, 400, 200, 100, 101);
		morDutAgaci.degerleriYaz();
		morDutAgaci.fotoSentezYap();
		((MorDutAgaci) morDutAgaci).yaprakDok();//sadece dut aðacýna ait method
		((MorDutAgaci) morDutAgaci).golgeYap();//sadece mordut aðacýna ait mothod
		((DutAgaci)morDutAgaci).ddd();//sadece dut aðacýna ait method
		((Agac)morDutAgaci).degerleriYaz();//sadece agac'a ait method
		new Agac(1, 2, 3).degerleriYaz();//sadece agac'a ait method
		((DutAgaci)morDutAgaci).degerleriYaz();//sadece dut aðacýna ait method
		((MorDutAgaci) morDutAgaci).degerleriYaz();//sadece mordut aðacýna ait mothod
	}

}
