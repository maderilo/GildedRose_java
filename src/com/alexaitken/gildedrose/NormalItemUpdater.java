package com.alexaitken.gildedrose;

public class NormalItemUpdater extends NonLegendaryItemUpdater {

	public NormalItemUpdater(Item i) {
		super(i);
	}

	@Override
	protected int getQualityChange() {
		if (item.getSellIn() < 0) return -2;
		return -1;
	}
}
