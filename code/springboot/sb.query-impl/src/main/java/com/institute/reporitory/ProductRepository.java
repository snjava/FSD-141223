package com.institute.reporitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.institute.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	// SQL : UPDATE prod_details SET prod_qty=8 WHERE pid=3;
	// HQL : UPDATE Product SET quantity=8 WHERE pid=2
	
	//@Query(value = "UPDATE Product SET quantity=8 WHERE pid=2") // Query with Static Value
	@Query(value = "UPDATE Product SET quantity= :qty WHERE pid= :id") // Query with dynamic Value (Parameterized Query)
	@Modifying
	@Transactional
	public void updateProductQuantity_HQL(@Param("qty") int quantity,@Param("id") int id);

	@Modifying
	@Transactional
	@Query(value="UPDATE prod_details SET prod_rating= :r WHERE pid= :i", nativeQuery = true)
	public void updateProdRating_SQL(@Param("i") int id, @Param("r") double rating);
	
	//SQL : SELECT * FROM prod_details WHERE prod_rating>=3.5
	//HQL : SELECT all_prod FROM Product all_prod WHERE all_prod.rating>=3.5
	@Query(value="SELECT all_prod FROM Product all_prod WHERE all_prod.rating>= :r")
	public List<Product> getProdByRating(@Param("r") double rating);
	
	// Get Product By Name
	// Get Product between price range 
	// Delete the product by Id
}
