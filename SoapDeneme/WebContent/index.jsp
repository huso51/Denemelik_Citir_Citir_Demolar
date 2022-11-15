<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.function.Consumer"%>
<%@page import="com.soap.webservice.ProductCatalogImpl"%>
<%@page import="com.soap.webservice.ProductCatalog"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Selam</title>
</head>
<body>
<center><h2>Selam Millet! <%
List<String> a = new ArrayList<>();
ProductCatalog productCatalog = new ProductCatalogImpl();
Consumer<String> consumer = new Consumer<String>() {
	@Override
	public void accept(String t) {
		//System.out.println(t);
		a.add(t);
	}
};
productCatalog.getAllProduct("beyaz eşya").forEach(consumer);
out.print("<font color='red'>");
for(int i = 0; i < a.size(); i++)
	out.println(" - " + a.get(i));
out.print("</font>");
%></h2></center>
</body>
</html>