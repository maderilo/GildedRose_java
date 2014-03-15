package com.alexaitken.gildedrose;

public class BackStagePassUpdater extends NonLegendaryItemUpdater {

	public BackStagePassUpdater(Item i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int getQualityChange() {
		if (item.getSellIn()>=10){
			return 1;
		}
		else if (item.getSellIn()>=5){
			return 2;
		}
		else if (item.getSellIn()>=0){
			return  3;
		}
		else return -item.getQuality();
	}
}
