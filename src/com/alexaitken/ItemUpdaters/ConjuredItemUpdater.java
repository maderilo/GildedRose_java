package com.alexaitken.ItemUpdaters;

import com.alexaitken.gildedrose.Item;

public class ConjuredItemUpdater extends NonLegendaryItemUpdater {

	protected ConjuredItemUpdater(Item i) {
		super(i);
	}

	@Override
	protected int getQualityChange() {
		if (item.getSellIn() <0) return -4;
		return -2;
	}
}
