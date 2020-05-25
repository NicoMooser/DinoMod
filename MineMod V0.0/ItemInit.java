//Item.Init class was created under src/main/java/com.X.minecraftmodv0/init
//To create an item, in this case creating example_item

package com.github.nicomooser.dinomod.minecraftmodv0.init;
import com.github.nicomooser.dinomod.minecraftmodv0.MinecraftModV0;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid=MinecraftModV0.MOD_ID, bus = Bus.MOD)
@ObjectHolder(MinecraftModV0.MOD_ID)
public class ItemInit{
	public static final Item example_item = null;
	
	@SubscribeEvent
	public static void registerItem(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("example_item"));
	}
}
