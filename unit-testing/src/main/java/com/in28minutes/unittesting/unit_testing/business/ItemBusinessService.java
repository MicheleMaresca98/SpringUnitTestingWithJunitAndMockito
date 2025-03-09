package com.in28minutes.unittesting.unit_testing.business;

import com.in28minutes.unittesting.unit_testing.model.Item;
import org.springframework.stereotype.Component;


@Component
public class ItemBusinessService {
    public Item retrieveHardcodedItem() {
        return new Item(1, "Ball", 10, 100);
    }
}
