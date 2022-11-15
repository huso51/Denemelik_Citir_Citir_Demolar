package com.sifre;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.println("Þifre giriniz : ");
		var pass = scanner.nextLine();
		if (pass.length() < 8 || pass.length() > 16)
			System.out.println("þifre 8 karakterden küçük 16 karakterden büyük olamaz!");
		else {
			var durum1 = false;
			var durum2 = false;
			var durum3 = false;
			var durum4 = false;
			var alfabe = "abcdefgðjklmnoöprsþtuüvyz";
			var ozelKarakterler = "_?=)(/&%+^'!é";
			var sayilar = "1234567890";
			var buyukAlfabe = alfabe.toUpperCase();
			byte index1 = 0;
			byte index2 = 0;
			byte index3 = 0;
			byte index4 = 0;
			for (int i = 0; i < pass.length(); i++) {
				char deger = pass.charAt(i);
				
				for (int j = 0; j < alfabe.length(); j++) {
					char deger2 = alfabe.charAt(j);
					if (deger == deger2) 
						index1++;
					if(index1==3) {
						durum1 = true;
						break;
					}
					
				}
				
				for (int j = 0; j < ozelKarakterler.length(); j++) {
					char deger2 = ozelKarakterler.charAt(j);
					if (deger == deger2) 
						index2++;
					if(index2 == 2) {
						durum2 = true;
						break;
					}
				}
				
				for (int j = 0; j < sayilar.length(); j++) {
					char deger2 = sayilar.charAt(j);
					if (deger == deger2) 
						index3++;
					if(index3 == 2) {
						durum3 = true;
						break;
					}
				}
				
				for (int j = 0; j < buyukAlfabe.length(); j++) {
					char deger2 = buyukAlfabe.charAt(j);
					if (deger == deger2) 
						index4++;
					if(index4 == 2) {
						durum4 = true;
						break;
					}
				}
			}
			if (!durum1 || !durum2 || !durum3 || !durum4)
				System.out.println("Yanlýþ biçimli þifre biçimi! ): Þifre uzunluðu " + pass.length());

			if (durum1)
				System.out.println("alfabeden en az 3 karakter var!");
			else {
				System.out.println("alfabeden en az 3 karakter girmelisiniz!");
				return;
			}
			if (durum2) {
				System.out.println("özel karakterlerden en az 2 karakter var!");
			} else {
				System.out.println("özel karakterlerden en az 2 karakter girmelisiniz!");
				return;
			}
			if (durum3) {
				System.out.println("sayýlardan en az 2 karakter var!");
			} else {
				System.out.println("sayýlardan en az 2 karakter girmelisiniz!");
				return;
			}
			if (durum4) {
				System.out.println("büyük harflerden en az 2 karakter var!");
			} else {
				System.out.println("büyük harflerden en az 2 karakter girmelisiniz!");
				return;
			}
			if (durum1 && durum2 && durum3 && durum4) {
				System.out.println("Doðru biçimli uygun þifre modeli! (: Þifre uzunluðu " + pass.length());
			}
		}
	}

}
