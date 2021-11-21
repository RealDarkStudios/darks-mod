
package mods.realdarkgamer.darksmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import mods.realdarkgamer.darksmod.item.DarkEssenceItem;
import mods.realdarkgamer.darksmod.DarksmodModElements;

@DarksmodModElements.ModElement.Tag
public class DarksModItemGroup extends DarksmodModElements.ModElement {
	public DarksModItemGroup(DarksmodModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdarks_mod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DarkEssenceItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
