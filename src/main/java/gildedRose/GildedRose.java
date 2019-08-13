package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

//    private boolean isNameAgedBrie(Item item){
//        return item.name.equals("Aged Brie");
//    }
//
//    private boolean isNameBackstagePassesToATAFKAL80ETCConcert(Item item) {
//        return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
//    }
//
//    private boolean isNameSulfurasHandRagnaros(Item item) {
//        return item.name.equals("Sulfuras, Hand of Ragnaros");
//    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            items[i].updateQuality.UpdateQuality(items[i]);
        }
    }
}
//        for (Item item : items) {
//            if (isNameAgedBrie(item)) {
//                calculationAgedBrie(item);
//                continue;
//            }
//            if (isNameBackstagePassesToATAFKAL80ETCConcert(item)) {
//                calculationBackstagePasses(item);
//                continue;
//            }
//            if(isNameSulfurasHandRagnaros(item)){
//                continue;
//            }
//            calculationOtherName(item);
//        }
//    }

//    private void calculationAgedBrie(Item item) {
//        if (item.getSellIn() < 1) {
//            item.quality = Math.min(item.quality + 2, 50);
//        } else {
//            item.quality = Math.min(item.quality + 1, 50);
//        }
//        item.sellIn--;
//    }
//
//    private void calculationBackstagePasses(Item item) {
//        item.sellIn--;
//        if (item.sellIn < 0) {
//            item.quality = 0;
//            return;
//        }
//        if (item.sellIn < 5) {
//            item.quality = Math.min(item.quality + 3, 50);
//            return;
//        }
//        if (item.sellIn < 10) {
//            item.quality = Math.min(item.quality + 2, 50);
//            return;
//        }
//        item.quality = Math.min(item.quality + 1, 50);
//    }
//
//    private void calculationOtherName(Item item) {
//        if (item.sellIn < 1) {
//            item.quality = Math.max(item.quality - 2, 0);
//        }else{
//            item.quality = Math.max(item.quality - 1, 0);
//        }
//        item.sellIn--;
//    }
