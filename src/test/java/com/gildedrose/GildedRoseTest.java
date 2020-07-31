package com.gildedrose;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void isFoo() {
        Item[] items = new Item[]{new Item("foo", 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    void isNotFoo() {
        Item[] items = new Item[]{new Item("tomatoes", 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Assertions.assertNotEquals("foo", app.items[0].name);
    }

    @Test
    void isTomatoes() {
        Item[] items = new Item[]{new Item("tomatoes", 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("tomatoes", app.items[0].name);
    }
    
    @Test
    void canWeSellTomatoes() {
        Item[] items = new Item[]{new Item("tomatoes", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(10, app.items[0].sellIn);
    }
     @Test
    void cannotSellTomatoes() {
        Item[] items = new Item[]{new Item("tomatoes", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].sellIn);
    }
    
    @Test
    void isTomatoesGoodQuality() {
        Item[] items = new Item[]{new Item("tomatoes", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(10, app.items[0].quality);
    }
      @Test
    void isTomatoesBadQuality() {
        Item[] items = new Item[]{new Item("tomatoes", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }
}
