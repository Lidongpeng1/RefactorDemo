package gildedRose;

public class Other_UpdateQuality extends UpdateQuality {

    @Override
    public void UpdateQuality(Item item) {
        if (item.sellIn < 1) {
            item.quality = Math.max(item.quality - 2, 0);
        }else{
            item.quality = Math.max(item.quality - 1, 0);
        }
        item.sellIn--;
    }
}
