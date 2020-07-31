package com.gildedrose;

class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    /**
     * Update the quality and the sellin capacity of an item
     */
    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName().equals("Aged Brie")) {
                agedBrie(items[i]);
            } else if (items[i].getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                backstage(items[i]); 
            } else if (items[i].getName().equals("Conjured Mana Cake")) {
                conjuredItem(items[i]);
            } else if (!items[i].getName().equals("Sulfuras, Hand of Ragnaros")) {
                otherItems(items[i]);
            }
        }
    }

    /**
     *
     * @param item
     */
    private void agedBrie(Item item) {
        decreaseSellIn(item);
        increaseQuality(item);
        if (item.getSellIn() < 0) {
            increaseQuality(item);
        }
    }

    /**
     *
     * @param item
     */
    private void otherItems(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
        decreaseSellIn(item);
        if (item.getSellIn() < 0) {
            if (item.getQuality() > 0) {//et la qualité plus grand que 0
                item.setQuality(item.getQuality() - 1);
            }
        }
    }
    /**
     * 
     * @param item 
     */
    private void conjuredItem(Item item) {
        decreaseSellIn(item);
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
        if (item.getSellIn() < 0) {
            if (item.getQuality() > 0) {//et la qualité plus grand que 0
                item.setQuality(item.getQuality() - 1);
            }
        }
    }
    /**
     * 
     * @param item 
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
     * 
     * @param item 
     */
    private void increaseQuality(Item item) {
        if (item.getQuality() < 50) { //si la qualité est en dessous de 50 on diminue la qualité de 1
            item.setQuality(item.getQuality() + 1);
        }
    }
    /**
     * 
     * @param item 
     */
    private void decreaseSellIn(Item item) {
        item.setSellIn(item.getSellIn() - 1);
    }
    /**
     * 
     * @param item 
     */
    private void resetQuality(Item item) {
        item.setQuality(item.getQuality() - item.getQuality());
    }
}
