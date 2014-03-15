package com.alexaitken.ItemUpdaters;

import com.alexaitken.gildedrose.Item;

public class LegendaryItemUpdater extends ItemUpdater {
//Legendary Items sellIn and Quality values never change
	
	protected LegendaryItemUpdater(Item i) {
		super(i);
	}

	@Override
	protected void updateSellin() {
	}

	@Override
	protected void updateQuality() {
	}
}