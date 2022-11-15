package com.soap.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "urunKatologu", portName = "urunKataloguPortu", serviceName = "urunKatologuServisi", targetNamespace = "https:\\www.huseyinurunler.com")
public class ProductCatalogImpl implements ProductCatalog {
	private ProductService productService = new ProductServiceImpl();

	@WebMethod(action = "katagorileriCek",operationName = "kategorilerinCekilmesi")
	@Override
	public List<String> getAllProductCatagories() {
		return productService.getAllProductCatagories();
	}

	@WebMethod(exclude = true,action = "urunleriCek",operationName = "urunlerinCekilmesi")
	@Override
	public List<String> getAllProduct(String product) {
		return productService.getAllProduct(product);
	}

	@WebMethod(exclude = true,action = "urunEkle",operationName = "urunEklenmesi")
	@Override
	public boolean addProduct(String catagori, String product) {
		return productService.addProduct(catagori, product);
	}
}
