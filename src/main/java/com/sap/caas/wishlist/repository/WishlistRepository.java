package com.sap.caas.wishlist.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.sap.caas.wishlist.entity.Wishlist;

public interface WishlistRepository extends CrudRepository<Wishlist, Long>{
	public List<Wishlist> findAll();
	
	@Transactional
	public <T extends Wishlist> T save(T wishlist);
}
