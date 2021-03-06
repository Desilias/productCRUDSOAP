package com.ddesilias.productCRUDSOAP.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ddesilias.productCRUDSOAP.ProductWs;

@Configuration
public class WebServiceConfig {
	@Autowired
	private Bus bus;
	@Autowired
	private ProductWs productService;

	@Bean
	public Endpoint endpoint() {
		Endpoint endpoint = new EndpointImpl(bus, productService);

		endpoint.publish("/productWs");

		return endpoint;

	}

}
