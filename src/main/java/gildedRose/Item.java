package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public UpdateQuality updateQuality;

    public int getSellIn() {
        return sellIn;
    }

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;

        if (this.name.equals("Aged Brie")) {
            this.updateQuality=new Aged_UpdateQuality();
        }
        else if (this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            this.updateQuality=new Back_UpdateQuality();
        }
        else if (this.name.equals("Sulfuras, Hand of Ragnaros")) {
            this.updateQuality=new Sul_UpdateQuality();
        }else {
            this.updateQuality=new Other_UpdateQuality();
        }

    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
