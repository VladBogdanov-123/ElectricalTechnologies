
package net.mcreator.electricaltechnologies.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.electricaltechnologies.item.FerroniumSwordItem;
import net.mcreator.electricaltechnologies.ElectricalTechnologiesModElements;

@ElectricalTechnologiesModElements.ModElement.Tag
public class ElectricalTechnologiesItemGroup extends ElectricalTechnologiesModElements.ModElement {
	public ElectricalTechnologiesItemGroup(ElectricalTechnologiesModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabelectrical_technologies") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(FerroniumSwordItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
