package com.lanphan.e_commerce_monolithic.repository;

import com.lanphan.e_commerce_monolithic.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
