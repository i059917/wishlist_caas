package com.sap.caas.wishlist.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sap.caas.wishlist.entity.Wishlist;
import com.sap.caas.wishlist.service.IWishlistService;

@RestController
public class WishlistController {
	
	@Autowired
	private IWishlistService wishlistService;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String helloWorld() {
        return "hello, world";
    }
    
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Wishlist> getAllWishlist() {
    	List<Wishlist> resultList = wishlistService.getAllWishlist();
    	return resultList;
    }
    
    @GetMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Wishlist createWishlist(Wishlist wishlist) {
    	return wishlistService.createWishlist();
    }
}
