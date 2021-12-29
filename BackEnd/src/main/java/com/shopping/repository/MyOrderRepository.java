package com.shopping.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.entity.Cart;
import com.shopping.entity.Order;
import com.shopping.entity.Product;

@Repository
public interface MyOrderRepository extends JpaRepository<Order, Integer> {
	
	List<Order> findAllByUid(String uid);

	void save(Cart cart);

}
