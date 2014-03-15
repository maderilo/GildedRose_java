package com.alexaitken.gildedrose;

public class Inventory {

	private Item[] items;

	public Inventory(Item[] items) {
		super();
		this.items = items;
	}

	public Inventory() {
		super();
		items = new Item[] {
					new Item("+5 Dexterity Vest", 10, 20), 
					new Item("Aged Brie", 2, 0),
					new Item("Elixir of the Mongoose", 5, 7),
					new Item("Sulfuras, Hand of Ragnaros", 0, 80),
					new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
					new Item("Conjured Mana Cake", 3, 6) 
				};
	}

	
	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			getItemUpdater(items[i]).update();
		}
	}
	
	ItemUpdater getItemUpdater(Item i){
		if (isLegendary(i)) return new LegendaryItemUpdater(i);
		if (isAgedBrie(i)) return new AgedBrieUpdater(i);
		if (isBackstagePass(i)) return new BackStagePassUpdater(i);
		return new NormalItemUpdater(i);
	}
	
	
	private boolean isLegendary(Item i){
		return i.getName() == "Sulfuras, Hand of Ragnaros";
	}
	
	private boolean isAgedBrie(Item i){
		return i.getName() == "Aged Brie";
	}
	
	private boolean isBackstagePass(Item i){
		return i.getName() == "Backstage passes to a TAFKAL80ETC concert";
	}
}
