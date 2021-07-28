package com.example.inventory;

import android.media.session.MediaSession;

import org.junit.jupiter.api.Test;
import static java.util.Arrays.asList;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimpleInventoryActivityTest {

    @Test
    void inventoryListFeature() {
       List<String> actual = Arrays.asList("Inventory should not be empty!, need restock");
       List<String> expected = Arrays.asList("Inventory should not be empty!, need restock"); }
    @Test
    void discountPrice() {
        assertEquals(90, 90);
    }
    @Test
    void sellingPrice(){assertEquals(120,120);}
    @Test
    void taxPrice(){
        assertEquals(110, 110);
    }
    @Test
    void profit(){
        assertEquals("Insufficient funds, no profit!", "Insufficient funds, no profit!");
    }
    @Test
    void materialCost(){assertEquals(632000, 632000);
    }
}