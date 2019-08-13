package gildedRose;

public class Aged_UpdateQuality extends UpdateQuality {
    @Override
    public void UpdateQuality(Item item) {
        if (item.getSellIn() < 1) {
            item.quality = Math.min(item.quality + 2, 50);
        } else {
            item.quality = Math.min(item.quality + 1, 50);
        }
        item.sellIn--;
    }
}
