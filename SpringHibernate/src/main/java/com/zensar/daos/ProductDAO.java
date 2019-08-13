package com.zensar.daos;

import java.util.List;



import com.zensar.entities.Product;

/*
 * Author:	Parul Singh
 * Creation Date: 30th Jul 2019 15.12PM
 * Modified Date: 30th Jul 2019 15.12PM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved. 
 * Description:Reperesents data Access Object interface used by business layer. 
 * It contains CRUD operations methods for entity objects.
 *
 */


public interface ProductDAO {
	
	

	void insert(Product product);
	void update(Product product);
	void delete(Product product);
	Product getById(int productId);
	List<Product> getAll();
}
