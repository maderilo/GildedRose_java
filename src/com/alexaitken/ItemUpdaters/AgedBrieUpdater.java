package com.alexaitken.ItemUpdaters;

import com.alexaitken.gildedrose.Item;

public class AgedBrieUpdater extends NonLegendaryItemUpdater {

	protected AgedBrieUpdater(Item i) {
		super(i);
	}

	@Override
	protected int getQualityChange() {
		return 1;
	}
}
