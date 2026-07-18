package com.shopping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
