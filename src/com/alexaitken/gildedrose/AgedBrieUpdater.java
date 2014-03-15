package com.alexaitken.gildedrose;

public class AgedBrieUpdater extends NonLegendaryItemUpdater {

	public AgedBrieUpdater(Item i) {
		super(i);
	}

	@Override
	protected int getQualityChange() {
		return 1;
	}
}
