package com.soap.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
//@SOAPBinding(style = Style.RPC)
public class ShopInfo {
	
	@WebMethod
	@WebResult(partName = "buraCikis")
	public String getShopInfo(@WebParam(partName = "buraGiris")String property) {
		String response = "boþ özellik";
		if("shopName".equals(property)) {
			response = "Hüseyin dükkan";
		}
		else if("since".equals(property)) {
			response = "Since 1994";
		}
		return response;
	}
}
