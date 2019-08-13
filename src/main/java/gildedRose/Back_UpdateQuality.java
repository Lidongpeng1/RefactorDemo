package gildedRose;

public class Back_UpdateQuality extends UpdateQuality{
    @Override
    public void UpdateQuality(Item item) {
        item.sellIn--;
        if (item.sellIn < 0) {
            item.quality = 0;
            return;
        }
        if (item.sellIn < 5) {
            item.quality = Math.min(item.quality + 3, 50);
            return;
        }
        if (item.sellIn < 10) {
            item.quality = Math.min(item.quality + 2, 50);
            return;
        }
        item.quality = Math.min(item.quality + 1, 50);
    }
}
