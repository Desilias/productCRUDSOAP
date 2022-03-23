package com.ddesilias.productCRUDSOAP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddesilias.productCRUDSOAP.entity.Product;
import com.ddesilias.productCRUDSOAP.repository.ProductRepository;

@Service
public class ProductWSImpl implements ProductWs {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getPoducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}

	@Override
	public Product createPruduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

}
