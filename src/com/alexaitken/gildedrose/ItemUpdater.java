package com.alexaitken.gildedrose;

public abstract class ItemUpdater {

	final protected Item item;
	
	ItemUpdater(Item i){
		item = i;
	}
	
	
	public final void update(){
		updateSellin();
		updateQuality();
	}
	
	
	abstract protected void updateSellin();
	abstract protected  void updateQuality();
	
}