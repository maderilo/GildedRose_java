package com.alexaitken.ItemUpdaters;

import com.alexaitken.gildedrose.Item;

public abstract class ItemUpdater {

	final protected Item item;
	
	protected ItemUpdater(Item i){
		item = i;
	}
	
	
	public final void update(){
		updateSellin();
		updateQuality();
	}
	
	
	abstract protected void updateSellin();
	abstract protected  void updateQuality();
	
}