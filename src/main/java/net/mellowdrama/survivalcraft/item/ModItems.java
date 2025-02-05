package net.mellowdrama.survivalcraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mellowdrama.survivalcraft.Survivalcraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item REVIVAL_FLUID = registerItem("revival_fluid", new Item(new Item.Settings()));
    public static final Item MEDUSA_DEVICE = registerItem("medusa_device", new Item(new Item.Settings()));
    public static final Item STONE_SPEAR = registerItem("stone_spear", new Item(new Item.Settings()));
    public static final Item ROPE = registerItem("rope", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Survivalcraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Survivalcraft.LOGGER.info("Registering Mod Items for " + Survivalcraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(REVIVAL_FLUID);
            entries.add(MEDUSA_DEVICE);
            entries.add(STONE_SPEAR);
            entries.add(ROPE);
        });
    }
}