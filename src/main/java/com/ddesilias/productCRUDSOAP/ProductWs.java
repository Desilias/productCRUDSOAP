package com.ddesilias.productCRUDSOAP;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ddesilias.productCRUDSOAP.entity.Product;

@WebService
public interface ProductWs {
	@WebMethod
	List<Product> getPoducts();

	@WebMethod
	Product getProduct(int id);

	@WebMethod
	Product createPruduct(Product product);

	@WebMethod
	Product updateProduct(Product product);

}
