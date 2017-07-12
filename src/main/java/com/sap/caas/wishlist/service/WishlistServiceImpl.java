package com.sap.caas.wishlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sap.caas.wishlist.entity.Wishlist;
import com.sap.caas.wishlist.repository.WishlistRepository;

@Component("wishlistService")
public class WishlistServiceImpl implements IWishlistService {
	
	@Autowired
	private WishlistRepository wishlistRepository;

	@Override
	public List<Wishlist> getAllWishlist() {
		System.out.println("**** findAll() in service layer ****");
		List<Wishlist> resultList= wishlistRepository.findAll();
		return resultList;
	}

	@Override
	public Wishlist createWishlist() {
		System.out.println("**** createWishlist() in service layer ****");
		Wishlist wishlist = new Wishlist();
		return wishlistRepository.save(wishlist);
	}

}
