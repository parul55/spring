package com.zensar.services.business;

import java.util.List;

import com.zensar.entities.Product;

/*
 * Author:	Parul Singh
 * Creation Date: 30th Jul 2019 16.53PM
 * Modified Date: 30th Jul 2019 16.53PM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved. 
 * Description:Reperesents product services
 * which can be accesssed by presentation layer.
 * It encapsulates business logic of product entity
 *
 */


public interface ProductService {
	void create(Product product);
	void edit(Product product);
	void remove(Product product);
	Product findById(int productId);
	List<Product> findAllProducts();
	
}
