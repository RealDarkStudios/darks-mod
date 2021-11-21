
package mods.realdarkgamer.darksmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import mods.realdarkgamer.darksmod.DarksmodModElements;

@DarksmodModElements.ModElement.Tag
public class DarkEssencePackShovelItem extends DarksmodModElements.ModElement {
	@ObjectHolder("darksmod:dark_essence_pack_shovel")
	public static final Item block = null;
	public DarkEssencePackShovelItem(DarksmodModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DarkEssenceItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).isImmuneToFire()) {
		}.setRegistryName("dark_essence_pack_shovel"));
	}
}
