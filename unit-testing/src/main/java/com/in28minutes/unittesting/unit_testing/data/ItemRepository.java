package com.in28minutes.unittesting.unit_testing.data;

import com.in28minutes.unittesting.unit_testing.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
}
