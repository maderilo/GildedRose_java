package com.alexaitken.gildedrose;

public class NormalItemUpdater extends NonLegendaryItemUpdater {

	public NormalItemUpdater(Item i) {
		super(i);
	}

	@Override
	protected int getQualityChange() {
		return -1;
	}
}
