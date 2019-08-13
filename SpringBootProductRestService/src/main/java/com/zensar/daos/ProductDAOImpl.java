package com.zensar.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

/*
 * Author:	Parul Singh
 * Creation Date: 30th Jul 2019 15.32PM
 * Modified Date: 31th Jul 2019 10.38AM
 * Version: 2.0
 * Copyright: Zensar Technologies. All rights reserved. 
 * Description:Reperesents data Access Object interface
 * which implements DAO interface
 * It contains CRUD operations methods implementations for entity product.
 *
 */

@Repository
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	public void insert(Product product) {
		// TODO Auto-generated method stub
		hibernatetemplate.save(product);
	}

	public void update(Product product) {
		// TODO Auto-generated method stub
		hibernatetemplate.update(product);
	}

	public void delete(Product product) {
		// TODO Auto-generated method stub
		hibernatetemplate.delete(product);
	}

	public Product getById(int productId) {
		// TODO Auto-generated method stub
		return hibernatetemplate.get(Product.class, productId);
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return hibernatetemplate.loadAll(Product.class);
	}
	
}
