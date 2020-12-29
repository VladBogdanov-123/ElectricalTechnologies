
package net.mcreator.electricaltechnologies.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.electricaltechnologies.ElectricalTechnologiesModElements;

@ElectricalTechnologiesModElements.ModElement.Tag
public class FerroniumAxeItem extends ElectricalTechnologiesModElements.ModElement {
	@ObjectHolder("electrical_technologies:ferronium_axe")
	public static final Item block = null;
	public FerroniumAxeItem(ElectricalTechnologiesModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(FerroniumIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("ferronium_axe"));
	}
}
