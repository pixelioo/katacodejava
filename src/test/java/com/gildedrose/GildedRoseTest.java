package com.gildedrose;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void sellinOfConjuredAfter2Day() {
        Item[] items = new Item[]{new Item("Conjured Mana Cake", 3, 6)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 2; i++) {
            app.updateQuality();
        }
        assertEquals(1, app.getItem(0).getSellIn());
    }

    @Test
    void qualityOfConjuredAfter2Day() {
        Item[] items = new Item[]{new Item("Conjured Mana Cake", 3, 6)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 2; i++) {
            app.updateQuality();
        }
        assertEquals(4, app.getItem(0).getQuality());
    }

    @Test
    void qualityOfConjuredAfter3Day() {
        Item[] items = new Item[]{new Item("Conjured Mana Cake", 5, 8)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 3; i++) {
            app.updateQuality();
        }
        assertEquals(5, app.getItem(0).getQuality());
    }

    @Test
    void sellinOfConjuredAfter3Day() {
        Item[] items = new Item[]{new Item("Conjured Mana Cake", 5, 8)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 3; i++) {
            app.updateQuality();
        }
        assertEquals(2, app.getItem(0).getSellIn());
    }

    @Test
    void sellinOfSulfurasAfter2Day() {
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 15, 80)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 2; i++) {
            app.updateQuality();
        }
        assertEquals(15, app.getItem(0).getSellIn());
    }

    @Test
    void qualityOfSulfurasAfter2Day() {
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 15, 80)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 2; i++) {
            app.updateQuality();
        }
        assertEquals(80, app.getItem(0).getQuality());
    }

    @Test
    void qualityOfSulfurasAfter3Day() {
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 25, 80)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 3; i++) {
            app.updateQuality();
        }
        assertEquals(80, app.getItem(0).getQuality());
    }

      @Test
    void sellinOfSulfurasAfter3Day() {
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 25, 80)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 3; i++) {
            app.updateQuality();
        }
        assertEquals(25, app.getItem(0).getSellIn());
    }
    
    
    
    @Test
    void sellinOfAgedAfter2Day() {
        Item[] items = new Item[]{new Item("Aged Brie",  2, 0)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 2; i++) {
            app.updateQuality();
        }
        assertEquals(0, app.getItem(0).getSellIn());
    }

    @Test
    void qualityOfAgedsAfter2Day() {
        Item[] items = new Item[]{new Item("Aged Brie",  2, 0)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 2; i++) {
            app.updateQuality();
        }
        assertEquals(2, app.getItem(0).getQuality());
    }

    @Test
    void qualityOfAgedsAfter3Day() {
        Item[] items = new Item[]{new Item("Aged Brie", 2, 0)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 3; i++) {
            app.updateQuality();
        }
        assertEquals(4, app.getItem(0).getQuality());
    }

      @Test
    void sellinOfAgedAfter3Day() {
        Item[] items = new Item[]{new Item("Aged Brie", 2, 0)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 3; i++) {
            app.updateQuality();
        }
        assertEquals(-1, app.getItem(0).getSellIn());
    }
    
    
    
       
    @Test
    void sellinOfBackstageAfter2Day() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",  14, 21)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 2; i++) {
            app.updateQuality();
        }
        assertEquals(12, app.getItem(0).getSellIn());
    }

    @Test
    void qualityOfBackstageAfter2Day() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",  14, 21)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 2; i++) {
            app.updateQuality();
        }
        assertEquals(23, app.getItem(0).getQuality());
    }

    @Test
    void qualityOfBackstageAfter3Day() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 14, 21)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 3; i++) {
            app.updateQuality();
        }
        assertEquals(24, app.getItem(0).getQuality());
    }

      @Test
    void sellinOfBackstageAfter3Day() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 14, 21)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 3; i++) {
            app.updateQuality();
        }
        assertEquals(11, app.getItem(0).getSellIn());
    }
    
    
    
    @Test
    void sellinOfOtherAfter2Day() {
        Item[] items = new Item[]{new Item("Elixir of the Mongoose", 4, 14)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 2; i++) {
            app.updateQuality();
        }
        assertEquals(2, app.getItem(0).getSellIn());
    }

    @Test
    void qualityOfOtherAfter2Day() {
        Item[] items = new Item[]{new Item("Elixir of the Mongoose",  4, 14)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 2; i++) {
            app.updateQuality();
        }
        assertEquals(12, app.getItem(0).getQuality());
    }

    @Test
    void qualityOfOtherAfter3Day() {
        Item[] items = new Item[]{new Item("Elixir of the Mongoose",4, 14)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 3; i++) {
            app.updateQuality();
        }
        assertEquals(11, app.getItem(0).getQuality());
    }

      @Test
    void sellinOfOtherAfter3Day() {
        Item[] items = new Item[]{new Item("Elixir of the Mongoose", 4, 14)};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 3; i++) {
            app.updateQuality();
        }
        assertEquals(1, app.getItem(0).getSellIn());
    }
}
