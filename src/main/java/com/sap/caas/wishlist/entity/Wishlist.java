package com.sap.caas.wishlist.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wishlist {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    public Wishlist() {
    	
    }
    
    public Wishlist(Long id) {
    	this.id = id;
    }
     
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
