package me.hsgamer.enchantcursepack.enchants.potion;

import org.bukkit.potion.PotionEffectType;
import studio.magemonkey.fabled.enchants.api.ItemSet;

public class Hunger extends PotionCurse {
    public Hunger() {
        super("Curse Of Hunger", "Cause Hunger when wearing");

        addNaturalItems(ItemSet.ARMOR.getItems());
    }

    public PotionEffectType type() {
        return PotionEffectType.HUNGER;
    }
}
