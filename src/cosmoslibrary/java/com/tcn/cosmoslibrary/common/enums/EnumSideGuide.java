package com.tcn.cosmoslibrary.common.enums;

import com.tcn.cosmoslibrary.common.comp.CosmosCompHelper;
import com.tcn.cosmoslibrary.common.comp.CosmosColour;

import net.minecraft.util.text.ITextComponent;

public enum EnumSideGuide {
	
	SHOWN(0, "shown", "cosmoslibrary.enum.side_guide.shown", true, CosmosColour.GREEN), 
	HIDDEN(1, "hidden", "cosmoslibrary.enum.side_guide.hidden", false, CosmosColour.RED);
	
	private int index;
	private String name;
	private String localized_name;
	private boolean value;
	private CosmosColour colour;
	
	EnumSideGuide(int indexIn, String nameIn, String localizedNameIn, boolean valueIn, CosmosColour colourIn) {
		this.index = indexIn;
		this.name = nameIn;
		this.localized_name = localizedNameIn;
		this.value = valueIn;
		this.colour = colourIn;
	}

	public int getIndex() {
		return this.index;
	}

	public String getName() {
		return this.name;
	}
	
	public String getUnlocalizedName() {
		return this.localized_name;
	}
	
	public ITextComponent getColouredComp() {
		return CosmosCompHelper.locComp(this.colour, true, this.localized_name);
	}

	public boolean getValue() {
		return this.value;
	}

	public CosmosColour getColour() {
		return this.colour;
	}
	
	public static EnumSideGuide getOpposite(EnumSideGuide state) {
		if (state.equals(SHOWN)) {
			return HIDDEN;
		} else {
			return SHOWN;
		}
	}
	
	public static EnumSideGuide getStateFromIndex(int index) {
		switch(index) {
			case 0:
				return SHOWN;
			case 1:
				return HIDDEN;
			default:
				return HIDDEN;
		}
	}
	
	public static EnumSideGuide getStateFromValue(boolean value) {
		if (value) {
			return SHOWN;
		} else {
			return HIDDEN;
		}
	}
}