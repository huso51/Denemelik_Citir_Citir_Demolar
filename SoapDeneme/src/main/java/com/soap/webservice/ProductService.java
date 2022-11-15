package com.soap.webservice;

import java.util.List;

public interface ProductService {
	public List<String> getAllProductCatagories();
	public List<String> getAllProduct(String product);
	public boolean addProduct(String catagori,String product);
}
