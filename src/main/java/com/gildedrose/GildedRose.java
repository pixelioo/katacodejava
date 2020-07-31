package com.gildedrose;

import java.util.Arrays;

class GildedRose {

    /**
     * All the items owned by gilded rose
     */
    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = Arrays.copyOf(items, items.length);
    }

    /**
     * Update the quality and the sellin capacity of an item
     */
    public void updateQuality() {
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i].getName().equals("Aged Brie")) {
                agedBrie(this.items[i]);
            } else if (this.items[i].getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                backstage(this.items[i]);
            } else if (this.items[i].getName().equals("Conjured Mana Cake")) {
                conjuredItem(this.items[i]);
            } else if (!this.items[i].getName().equals("Sulfuras, Hand of Ragnaros")) {
                otherItems(this.items[i]);
            }
        }
    }

    /**
     * Modify the Aged Brie item with correct rule.
     *
     * @param item The aged brie item
     */
    private void agedBrie(Item item) {
        decreaseSellIn(item);
        increaseQuality(item);
        if (item.getSellIn() < 0) {
            increaseQuality(item);
        }
    }

    /**
     * Modify the other item with the correct rules
     *
     * @param item Other item than the Backstage, Aged Brie conjured Sulfuras
     */
    private void otherItems(Item item) {
        decreaseQuality(item);
        decreaseSellIn(item);
        if (item.getSellIn() < 0) {
            decreaseQuality(item);
        }
    }

    /**
     * Modify the conjured item with the correct rules
     *
     * @param item The conjured item
     */
    private void conjuredItem(Item item) {
        decreaseSellIn(item);
        decreaseQuality(item);
        if (item.getSellIn() < 0) {
            decreaseQuality(item); //et la qualité plus grand que 0
        }
    }

    /**
     * Decrease Quality if the quality is above 0
     *
     * @param item The item that need to decrease the quality
     */
    private void decreaseQuality(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
    }

    /**
     * Modify the backstage item with the correct rules
     *
     * @param item The backstage item
     */
    private void backstage(Item item) {
        increaseQuality(item);
        if (item.getSellIn() < 11) {
            increaseQuality(item);
        }
        if (item.getSellIn() < 6) {
            increaseQuality(item);
        }
        decreaseSellIn(item);
        if (item.getSellIn() < 0) {
            resetQuality(item);
        }
    }

    /**
     * Increase qualitify if the quality is under 50
     *
     * @param item The item that need to increase his quality
     */
    private void increaseQuality(Item item) {
        if (item.getQuality() < 50) { //si la qualité est en dessous de 50 on diminue la qualité de 1
            item.setQuality(item.getQuality() + 1);
        }
    }

    /**
     * Decrease the item selling
     *
     * @param item The item that need to decrease his sellin day
     */
    private void decreaseSellIn(Item item) {
        item.setSellIn(item.getSellIn() - 1);
    }

    /**
     * Reset the quality to 0 after the concert
     *
     * @param item The item that need to reset the quality
     */
    private void resetQuality(Item item) {
        item.setQuality(item.getQuality() - item.getQuality());
    }

    /**
     *
     * @param i
     * @return the corresponding items
     */
    public Item getItem(int i) {
        return new Item(items[i].getName(), items[i].getSellIn(), items[i].getQuality());
    }

    public int getItemsLength() {
        return items.length;
    }

}
