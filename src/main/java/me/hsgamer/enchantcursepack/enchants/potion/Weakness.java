package me.hsgamer.enchantcursepack.enchants.potion;

import org.bukkit.potion.PotionEffectType;
import studio.magemonkey.fabled.enchants.api.ItemSet;

public class Weakness extends PotionCurse {

    public Weakness() {
        super("Curse Of Weakness", "Cause Weakness while wearing");

        addNaturalItems(ItemSet.ARMOR.getItems());
    }

    public PotionEffectType type() {
        return PotionEffectType.WEAKNESS;
    }
}
