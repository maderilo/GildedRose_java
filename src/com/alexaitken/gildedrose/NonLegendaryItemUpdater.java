package com.alexaitken.gildedrose;

public abstract class NonLegendaryItemUpdater extends ItemUpdater {

	NonLegendaryItemUpdater(Item i) {
		super(i);
	}

	@Override
	protected final void updateSellin() {
		item.setSellIn(item.getSellIn()-1);
	}
	
	@Override
	protected final void updateQuality(){
		applyQualityChange(getQualityChange());
		limitQuality();
	}
	
	protected final void applyQualityChange(int qChange){
		item.setQuality(item.getQuality()+ qChange);
	}
	
	
	protected abstract int getQualityChange();
	
	
	protected final void limitQuality(){
		if (item.getQuality() < 0) item.setQuality(0);
		if (item.getQuality() > 50) item.setQuality(50);	
	}
}
