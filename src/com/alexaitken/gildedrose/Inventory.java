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
			updateSellin(items[i]);
			updateQuality(items[i]);
		}
	}
	
	
	private void updateSellin(Item i){
		if (!isLegendary(i))
			i.setSellIn(i.getSellIn() -1);
	}
	
	
	private void updateQuality(Item i){
		if (!isLegendary(i)) {
			if (isAgedBrie(i)) {
				i.setQuality(i.getQuality()+1);
			}
			else if (isBackstagePass(i)) {
				if (i.getSellIn()>=10){
					i.setQuality(i.getQuality()+1);
				}
				else if (i.getSellIn()>=5){
					i.setQuality(i.getQuality()+2);
				}
				else if (i.getSellIn()>=0){
					i.setQuality(i.getQuality()+3);
				}
				else i.setQuality(0);
			}
			else{
				int qualityLoss;
				if (i.getSellIn()<0) qualityLoss = 2;
				else qualityLoss = 1;
				i.setQuality(i.getQuality()-qualityLoss);
			}
			limitQuality(i);
		}
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
	
	
	private void limitQuality(Item i){
		if (i.getQuality() < 0) i.setQuality(0);
		if (i.getQuality() > 50) i.setQuality(50);	
	}
}
