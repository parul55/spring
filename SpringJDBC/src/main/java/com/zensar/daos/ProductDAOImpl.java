package com.zensar.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

/*
 * Author:	Parul Singh
 * Creation Date: 30th Jul 2019 15.32PM
 * Modified Date: 30th Jul 2019 15.32PM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved. 
 * Description:Reperesents data Access Object interface
 * which implements DAO interface
 * It contains CRUD operations methods implementations for entity product.
 *
 */

@Repository
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private JdbcTemplate jt;
	
	public void insert(Product product) {
		String sq1="insert into product values(?,?,?,?);";
		jt.update(sq1,product.getProductId(),product.getName(),product.getBrand(),product.getPrice());
		System.out.println("Product is inserted");
	}

	public void update(Product product) {
		// TODO Auto-generated method stub
		String sq1="update product set name=?,brand=?,price=?"+"where id=?";
		jt.update(sq1,product.getName(),product.getBrand(),product.getPrice(),product.getProductId());
		System.out.println("Product updated.");
	}

	public void delete(Product product) {
		// TODO Auto-generated method stub
		String sq1="delete from product where id=?";
		jt.update(sq1,product.getProductId());
		System.out.println("Product is deleted");
	}

	public Product getById(int productId) {
		// TODO Auto-generated method stub
		String sq1="select id,name,brand,price from product where id=?;";
		Product dbproduct=jt.query(sq1, new Object[]{productId} ,new ResultSetExtractor<Product>() {

			public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()){
					Product product=new Product();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getDouble(4));
					
					return product;
				}
				else
					return null;
			}
		});
				
		return dbproduct;
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		String sq1="select * from product";
		List<Product> productlist=jt.query(sq1, new ResultSetExtractor<List<Product>>() {

			public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Product> pList=new ArrayList<Product>();
				
				while(rs.next()){
					Product p=new Product();
					p.setProductId(rs.getInt(1));
					p.setName(rs.getString(2));
					p.setBrand(rs.getString(3));
					p.setPrice(rs.getDouble(4));
					pList.add(p);
				}

				return pList;
			}
		});
		return productlist;
		
	}

}
