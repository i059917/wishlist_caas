package com.sap.caas.wishlist.service;

import java.util.List;

import com.sap.caas.wishlist.entity.Wishlist;

public interface IWishlistService {
	public List<Wishlist> getAllWishlist();
	public Wishlist createWishlist();

}
