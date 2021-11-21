
package mods.realdarkgamer.darksmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import mods.realdarkgamer.darksmod.itemgroup.DarksModItemGroup;
import mods.realdarkgamer.darksmod.DarksmodModElements;

@DarksmodModElements.ModElement.Tag
public class DarkEssencePackSwordItem extends DarksmodModElements.ModElement {
	@ObjectHolder("darksmod:dark_essence_pack_sword")
	public static final Item block = null;
	public DarkEssencePackSwordItem(DarksmodModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 16f;
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
		}, 3, -3f, new Item.Properties().group(DarksModItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("dark_essence_pack_sword"));
	}
}
