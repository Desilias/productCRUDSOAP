package com.ddesilias.productCRUDSOAP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ddesilias.productCRUDSOAP.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
