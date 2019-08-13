package com.zensar.services.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.daos.ProductDAO;
import com.zensar.entities.Product;


/*
 * Author:	Parul Singh
 * Creation Date: 30th Jul 2019 16.57PM
 * Modified Date: 30th Jul 2019 16.57PM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved. 
 * Description:Reperesents data Access Object interface used by business layer. 
 * It contains CRUD operations methods for entity objects.
 *
 */


@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO dao;
	
	public void create(Product product) {
		// TODO Auto-generated method stub
		dao.insert(product);
	}

	public void edit(Product product) {
		// TODO Auto-generated method stub
		Product dbproduct=findById(product.getProductId());
		if(dbproduct!=null){
			dbproduct.setName(product.getName());
			dbproduct.setBrand(product.getBrand());
			dbproduct.setPrice(product.getPrice());
			
			dao.update(dbproduct);
		}
	}

	public void remove(Product product) {
		// TODO Auto-generated method stub
		Product dbproduct=findById(product.getProductId());
		if(dbproduct!=null){
			dao.delete(dbproduct);
		}
		else
			System.out.println("Product does not exist");
	}
	public Product findById(int productId) {
		// TODO Auto-generated method stub
		return dao.getById(productId);
	}

	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}
