package com.alexaitken.ItemUpdaters;

import com.alexaitken.gildedrose.Item;

public class ItemUpdaterFactory {

	public static ItemUpdater getItemUpdater(Item i){
		if (isLegendary(i)) return new LegendaryItemUpdater(i);
		if (isAgedBrie(i)) return new AgedBrieUpdater(i);
		if (isBackstagePass(i)) return new BackStagePassUpdater(i);
		if (isConjured(i)) return new ConjuredItemUpdater(i);
		return new NormalItemUpdater(i);
	}
	
	private static boolean isLegendary(Item i){
		return i.getName() == "Sulfuras, Hand of Ragnaros";
	}
	
	private static boolean isAgedBrie(Item i){
		return i.getName() == "Aged Brie";
	}
	
	private static boolean isBackstagePass(Item i){
		return i.getName() == "Backstage passes to a TAFKAL80ETC concert";
	}
	
	private static boolean isConjured(Item i){
		return i.getName() == "Conjured Mana Cake";
	}
}
