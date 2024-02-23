package net.hotdoguy90.additionalsaturation.util;

import net.hotdoguy90.additionalsaturation.AdditionalSaturation;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> DETECTED_EDIBLE_FOOD_ITEMS = createTag("detected_edible_food_items");
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(AdditionalSaturation.MOD_ID, name));
        }
    }
}
