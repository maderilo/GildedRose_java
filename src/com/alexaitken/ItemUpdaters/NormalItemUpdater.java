package com.alexaitken.ItemUpdaters;

import com.alexaitken.gildedrose.Item;

public class NormalItemUpdater extends NonLegendaryItemUpdater {

	protected NormalItemUpdater(Item i) {
		super(i);
	}

	@Override
	protected int getQualityChange() {
		if (item.getSellIn() < 0) return -2;
		return -1;
	}
}
