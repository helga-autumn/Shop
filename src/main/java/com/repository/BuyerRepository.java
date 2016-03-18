package com.repository;

import com.entity.Buyer;

public interface BuyerRepository extends CrudRepository<Buyer, Integer> {

	Iterable<Buyer> findAll();

}
