package me.hsgamer.enchantcursepack.enchants.potion;

import org.bukkit.potion.PotionEffectType;
import studio.magemonkey.fabled.enchants.api.ItemSet;

public class Slowness extends PotionCurse {
    public Slowness() {
        super("Curse Of Slowness", "Cause Slowness while wearing");

        addNaturalItems(ItemSet.BOOTS.getItems());
    }

    public PotionEffectType type() {
        return PotionEffectType.SLOW;
    }
}
