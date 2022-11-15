package com.soap.webservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductServiceImpl implements ProductService {

	private List<String> mobilya = new ArrayList<>();
	private List<String> beyazEsya = new ArrayList<>();
	private List<String> elektronik = new ArrayList<>();

	public ProductServiceImpl() {
		super();

		mobilya.add("Kanepe");
		mobilya.add("Masa");
		mobilya.add("Sandalye");

		beyazEsya.add("Buz dolab�");
		beyazEsya.add("�ama��r makinesi");
		beyazEsya.add("Bula��k makinesi");

		elektronik.add("Tablet");
		elektronik.add("Telefon");
		elektronik.add("Laptop");
	}
	
	@Override
	public List<String> getAllProductCatagories() {
		List<String> productCatagories = new ArrayList<>(Arrays.asList("mobilya", "beyaz e�ya", "elektronik"));
		return productCatagories;
	}

	@Override
	public List<String> getAllProduct(String product) {
		switch (product) {
		case "mobilya":
			return mobilya;
		case "beyaz e�ya":
			return beyazEsya;
		case "elektronik":
			return elektronik;
		default:
			List<String> r = new ArrayList<>();
			r.add("L�tfen a�a��da ki de�erlerden birini giriniz.");
			r.add("mobilya,");
			r.add("beyaz e�ya,");
			r.add("elektronik");
			return r;
		}
	}

	@Override
	public boolean addProduct(String catagori, String product) {
		switch (catagori.toLowerCase()) {
		case "mobilya":
			mobilya.add(product);
			return true;
		case "beyaz e�ya":
			beyazEsya.add(product);
			return true;
		case "elektronik":
			elektronik.add(product);
			return true;
		default:
			return false;
		}
	}
}
