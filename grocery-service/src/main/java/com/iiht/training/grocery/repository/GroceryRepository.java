package com.iiht.training.grocery.repository;

import com.iiht.training.grocery.entity.Grocery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GroceryRepository extends JpaRepository<Grocery, Integer> {
}
